/*
* Licensed to STRATIO (C) under one or more contributor license agreements.
* See the NOTICE file distributed with this work for additional information
  * regarding copyright ownership.  The STRATIO (C) licenses this file
  * to you under the Apache License, Version 2.0 (the
  * "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  * KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package com.stratio.meta2.server.actors

import java.util.UUID

import akka.actor.{Actor, Props, ReceiveTimeout}
import akka.cluster.ClusterEvent._
import akka.routing.RoundRobinRouter
import com.stratio.meta.common.ask.{Command, Connect, Query}
import com.stratio.meta.common.result._
import com.stratio.meta.communication.Disconnect
import com.stratio.meta2.core.engine.Engine
import com.stratio.meta2.server.config.NumberActorConfig
import org.apache.log4j.Logger


object ServerActor{
  def props(engine: Engine): Props = Props(new ServerActor(engine))
}

class ServerActor(engine:Engine) extends Actor  with NumberActorConfig{
  val log =Logger.getLogger(classOf[ServerActor])

  val connectorManagerActorRef=context.actorOf(ConnectorManagerActor.props(engine.getConnectorManager()).withRouter(RoundRobinRouter(nrOfInstances=num_connector_manag_actor)).withRouter(RoundRobinRouter(nrOfInstances=num_coordinator_actor)),"ConnectorManagerActor")
  val coordinatorActorRef=context.actorOf(CoordinatorActor.props(connectorManagerActorRef,engine.getCoordinator()).withRouter(RoundRobinRouter(nrOfInstances=num_coordinator_actor)),"CoordinatorActor")
  val plannerActorRef=context.actorOf(PlannerActor.props(coordinatorActorRef,engine.getPlanner).withRouter(RoundRobinRouter(nrOfInstances=num_planner_actor)),"PlannerActor")
  val validatorActorRef=context.actorOf(ValidatorActor.props(plannerActorRef,engine.getValidator).withRouter(RoundRobinRouter(nrOfInstances=num_validator_actor)),"ValidatorActor")
  val parserActorRef=context.actorOf(ParserActor.props(validatorActorRef,engine.getParser()).withRouter(RoundRobinRouter(nrOfInstances=num_parser_actor)),"ParserActor")
  val APIActorRef=context.actorOf(APIActor.props(engine.getAPIManager()).withRouter(RoundRobinRouter(nrOfInstances=num_api_actor)),"APIActor")

  //val queryActorRef= context.actorOf(QueryActor.props(engine,connectorActorRef),"QueryActor")


  /*
  override def preStart(): Unit = {
    //#subscribe
    Cluster(context.system).subscribe(self, classOf[MemberEvent])
    //cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
  }
  override def postStop(): Unit =
    Cluster(context.system).unsubscribe(self)
  * 
  */

  def receive = {
    case query:Query => {
      println("query: " + query)
      parserActorRef forward query
    }
    case Connect(user)=> {
      log.info("Welcome " + user +"!")
      //println("Welcome " + user +"!")
      sender ! ConnectResult.createConnectResult(UUID.randomUUID().toString)
    }
    case Disconnect(user)=> {
      log.info("Goodbye " + user +".")
      //sender ! DisconnectResult.createDisconnectResult(user)
    }
    case cmd: Command => {
      log.info("API Command call " + cmd.commandType)
      APIActorRef forward cmd
    }
    //pass the message to the connectorActor to extract the member in the cluster
    case state: CurrentClusterState => {
      log.info("Current members: {}"+ state.members.mkString(", "))
      //connectorActorRef ! state
    }
    //case UnreachableMember(member) => {
    case member: UnreachableMember => {
      log.info("Member detected as unreachable: {}"+ member)
      //connectorActorRef ! member
    }
    case member: MemberRemoved=>{
      log.info("Member is Removed: {} after {}");//, member.address, previousStatus)
      //connectorActorRef ! member
    }
    case _: MemberEvent =>{
      log.info("Receiving anything else")
    }
    case _: ClusterDomainEvent =>{
      println("ClusterDomainEvent")
    }
    case ReceiveTimeout =>{
      println("ReceiveTimeout")
    }
    case _ => {
      println("Unknown!!!!");
      sender ! Result.createUnsupportedOperationErrorResult("Not recognized object")
    }
  }
}