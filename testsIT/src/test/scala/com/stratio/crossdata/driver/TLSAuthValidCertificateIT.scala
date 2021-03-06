/*
 * Copyright (C) 2015 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.crossdata.driver

import com.stratio.crossdata.common.result.SuccessfulSQLResult
import com.stratio.crossdata.driver.config.DriverConf
import com.stratio.crossdata.driver.exceptions.TLSInvalidAuthException
import com.stratio.crossdata.driver.test.Utils._
import com.stratio.crossdata.server.CrossdataServer
import com.stratio.crossdata.server.config.ServerConfig
import com.typesafe.config.{ConfigFactory, ConfigValueFactory}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.concurrent.duration._

import scala.language.postfixOps

@RunWith(classOf[JUnitRunner])
class TLSAuthValidCertificateIT extends EndToEndTest {

  val basepath = getClass.getResource("/certificates").getPath

  override def init() = {

    val configValues = Seq(
      ServerConfig.Http.Host                 -> ConfigValueFactory.fromAnyRef("localhost"),
      ServerConfig.Http.Port                 -> ConfigValueFactory.fromAnyRef(13422),
      ServerConfig.Http.TLS.TlsEnable        -> ConfigValueFactory.fromAnyRef(true),
      ServerConfig.Http.TLS.TlsTrustStore    -> ConfigValueFactory.fromAnyRef(s"$basepath/truststore.jks"),
      ServerConfig.Http.TLS.TlsTrustStorePwd -> ConfigValueFactory.fromAnyRef("Pass1word"),
      ServerConfig.Http.TLS.TlsKeyStore      -> ConfigValueFactory.fromAnyRef(s"$basepath/ServerKeyStore.jks"),
      ServerConfig.Http.TLS.TlsKeystorePwd   -> ConfigValueFactory.fromAnyRef("Pass1word")
    )

    val tlsConfig = (ConfigFactory.empty /: configValues) {
      case (config, (key, value)) => config.withValue(key, value)
    }


    crossdataServer = Some(new CrossdataServer(Some(tlsConfig)))
    crossdataServer.foreach(_.start())
    crossdataServer.foreach(_.sessionProviderOpt.foreach(_.newSession(SessionID, this.getClass.getSimpleName)))
  }

  "CrossdataDriver" should "return a result as usual using a valid TLS certificate from the driver" in {

    assumeCrossdataUpAndRunning()

    val settingsValues = Seq(
      DriverConf.Http.Host                 -> ConfigValueFactory.fromAnyRef("localhost"),
      DriverConf.Http.Port                 -> ConfigValueFactory.fromAnyRef("13422"),
      DriverConf.Http.TLS.TlsEnable        -> ConfigValueFactory.fromAnyRef(true),
      DriverConf.Http.TLS.TlsKeyStore      -> ConfigValueFactory.fromAnyRef(s"$basepath/goodclient/ClientKeyStore.jks"),
      DriverConf.Http.TLS.TlsKeystorePwd   -> ConfigValueFactory.fromAnyRef("Pass1word"),
      DriverConf.Http.TLS.TlsTrustStore    -> ConfigValueFactory.fromAnyRef(s"$basepath/truststore.jks"),
      DriverConf.Http.TLS.TlsTrustStorePwd -> ConfigValueFactory.fromAnyRef("Pass1word")
    )

    val setting = (new DriverConf() /: settingsValues) {
      case (config, (key, value)) => config.set(key, value)
    }

    implicit val _: DriverTestContext = DriverTestContext(Driver.http, Some(setting))

    withDriverDo { driver =>
      val result = driver.sql("show tables").waitForResult(10 seconds)
      result shouldBe an[SuccessfulSQLResult]
      result.hasError should be(false)
      val rows = result.resultSet
      rows should have length 0
    }

  }

}
