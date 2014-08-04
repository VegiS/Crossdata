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

package com.stratio.meta.core.planner.statements;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.stratio.meta.core.planner.BasicPlannerTest;
import com.stratio.meta.core.statements.DropTableStatement;
import com.stratio.meta.core.statements.ExplainPlanStatement;
import com.stratio.meta.core.statements.MetaStatement;
import com.stratio.meta.core.statements.SelectStatement;
import com.stratio.meta.core.structures.IntegerTerm;
import com.stratio.meta.core.structures.Relation;
import com.stratio.meta.core.structures.RelationCompare;
import com.stratio.meta.core.structures.SelectionClause;
import com.stratio.meta.core.structures.SelectionList;
import com.stratio.meta.core.structures.SelectionSelector;
import com.stratio.meta.core.structures.SelectionSelectors;
import com.stratio.meta.core.structures.SelectorIdentifier;

public class ExplainPlanStatementTest extends BasicPlannerTest {

  @Test
  public void testPlanForExplainDrop() {

    // EXPLAIN PLAN FOR DROP TABLE table1;
    MetaStatement dropTable = new DropTableStatement("demo.users", false);
    stmt = new ExplainPlanStatement(dropTable);
    validateCommandPath("testPlanForExplain");
  }

  @Test
  public void testPlanForExplainSelect() {

    // EXPLAIN PLAN FOR SELECT name, age, info FROM demo.users WHERE age = 10;
    List<SelectionSelector> selectionSelectors =
        Arrays.asList(new SelectionSelector(new SelectorIdentifier("name")), new SelectionSelector(
            new SelectorIdentifier("age")), new SelectionSelector(new SelectorIdentifier("info")));

    SelectionClause selClause = new SelectionList(new SelectionSelectors(selectionSelectors));
    SelectStatement selectStmt = new SelectStatement(selClause, "demo.users");
    Relation relation = new RelationCompare("age", "=", new IntegerTerm("10"));
    List<Relation> whereClause = Arrays.asList(relation);
    selectStmt.setWhere(whereClause);

    stmt = new ExplainPlanStatement(selectStmt);
    validateCommandPath("testPlanForExplainSelect");
  }
}
