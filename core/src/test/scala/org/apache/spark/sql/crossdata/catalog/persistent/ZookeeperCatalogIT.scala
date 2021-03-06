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
package org.apache.spark.sql.crossdata.catalog.persistent

import com.typesafe.config.{Config, ConfigFactory, ConfigValueFactory}
import org.apache.spark.sql.crossdata.catalog.CatalogConstants
import org.apache.spark.sql.crossdata.config.CoreConfig
import org.apache.spark.sql.crossdata.test.SharedXDContextTest
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import CoreConfig.{CatalogClassConfigKey, ZookeeperClass}

import scala.util.Try

@RunWith(classOf[JUnitRunner])
class ZookeeperCatalogIT extends {
  val catalogName = "Zookeeper"
} with SharedXDContextTest with CatalogConstants with GenericCatalogTests with ZookeeperDefaultTestConstants{

  override val coreConfig : Option[Config] = {
    val zkResourceConfig =
      Try(ConfigFactory.load("zookeeper-catalog.conf").getConfig(CoreConfig.ParentConfigName)).toOption

    ZookeeperConnection.fold(zkResourceConfig) {connectionString =>
      zkResourceConfig.flatMap(resourceConfig =>
        Option(resourceConfig.withValue(ZookeeperConnectionKey, ConfigValueFactory.fromAnyRef(connectionString))))
    } map (_.withValue(CatalogClassConfigKey, ConfigValueFactory.fromAnyRef(ZookeeperClass)))
  }

}

sealed trait ZookeeperDefaultTestConstants {
  val ZookeeperConnectionKey = "catalog.zookeeper.connectionString"
  val ZookeeperConnection: Option[String] =
    Try(ConfigFactory.load().getString(ZookeeperConnectionKey)).toOption
}