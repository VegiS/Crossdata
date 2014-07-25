/*
 * Stratio Meta
 *
 * Copyright (c) 2014, Stratio, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

package com.stratio.meta2.core.query;

import com.stratio.meta.common.result.QueryStatus;
import com.stratio.meta2.core.statements.MetaStatement;

public class ParsedQuery extends BaseQuery {
  private final MetaStatement statement;
  public ParsedQuery(BaseQuery baseQuery, MetaStatement statement){
    super(baseQuery);
    this.statement=statement;
  }

  ParsedQuery(ParsedQuery parsedQuery){
    this(parsedQuery,parsedQuery.getStatement());
  }

  public MetaStatement getStatement(){
    return this.statement;
  }

  public QueryStatus getStatus() {
    return QueryStatus.PARSED;
  }
}