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

package com.stratio.meta.core.statements;

import static com.datastax.driver.core.querybuilder.QueryBuilder.truncate;

import com.datastax.driver.core.KeyspaceMetadata;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.TableMetadata;
import com.datastax.driver.core.querybuilder.Truncate;
import com.stratio.meta.common.result.QueryResult;
import com.stratio.meta.common.result.Result;
import com.stratio.meta.core.engine.EngineConfig;
import com.stratio.meta.core.metadata.MetadataManager;
import com.stratio.meta.core.utils.MetaPath;
import com.stratio.meta.core.utils.MetaStep;
import com.stratio.meta.core.utils.Tree;

public class TruncateStatement extends MetaStatement {

  private String ident;

  public TruncateStatement(String ident) {
    this.command = false;
    this.ident = ident;
    if (ident.contains(".")) {
      String[] ksAndTableName = ident.split("\\.");
      this.setKeyspace(ksAndTableName[0]);
      this.ident = ksAndTableName[1];
    }
  }

  public String getIdent() {
    return ident;
  }

  public void setIdent(String ident) {
    if (ident.contains(".")) {
      String[] ksAndTablename = ident.split("\\.");
      this.setKeyspace(ksAndTablename[0]);
      this.ident = ksAndTablename[1];
    } else {
      this.ident = ident;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TRUNCATE ");
    if (this.isKeyspaceIncluded()) {
      sb.append(this.getEffectiveKeyspace()).append(".");
    }
    sb.append(ident);
    return sb.toString();
  }


  @Override
  public String translateToCQL(MetadataManager metadataManager) {
    return this.toString();
  }

  @Override
  public Statement getDriverStatement() {
    Truncate truncateQuery;
    if (this.isKeyspaceIncluded()) {
      truncateQuery = truncate(this.getEffectiveKeyspace(), ident);
    } else {
      truncateQuery = truncate(ident);
    }
    return truncateQuery;
  }

  @Override
  public Result validate(MetadataManager metadata, EngineConfig config) {
    Result result = QueryResult.createSuccessQueryResult();

    String effectiveKeyspace = getEffectiveKeyspace();
    if (this.isKeyspaceIncluded()) {
      effectiveKeyspace = this.getEffectiveKeyspace();
    }

    // Check that the keyspace and table exists.
    if (effectiveKeyspace == null || effectiveKeyspace.length() == 0) {
      result =
          Result
              .createValidationErrorResult("Target keyspace missing or no keyspace has been selected.");
    } else {
      KeyspaceMetadata ksMetadata = metadata.getKeyspaceMetadata(effectiveKeyspace);
      if (ksMetadata == null) {
        result =
            Result
                .createValidationErrorResult("Keyspace " + effectiveKeyspace + " does not exist.");
      } else {
        TableMetadata tableMetadata = metadata.getTableMetadata(effectiveKeyspace, ident);
        if (tableMetadata == null) {
          result = Result.createValidationErrorResult("Table " + ident + " does not exist.");
        }
      }
    }
    return result;

  }

  @Override
  public Tree getPlan(MetadataManager metadataManager, String targetKeyspace) {
    Tree tree = new Tree();
    tree.setNode(new MetaStep(MetaPath.CASSANDRA, this));
    return tree;
  }

}