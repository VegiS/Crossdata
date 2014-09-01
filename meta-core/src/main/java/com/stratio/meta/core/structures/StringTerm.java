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

package com.stratio.meta.core.structures;

public class StringTerm extends Term<String> {

  private static final long serialVersionUID = 4470491967411363431L;

  private boolean quotedLiteral = false;

  public StringTerm(String term, boolean quotedLiteral) {
    super(String.class, term);
    this.type = TYPE_TERM;
    this.quotedLiteral = quotedLiteral;
  }

  public StringTerm(String term) {
    this(term, false);
  }

  public StringTerm(Term<String> term) {
    super(String.class, term.getTermValue().toString());
  }

  public boolean isQuotedLiteral() {
    return quotedLiteral;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    if (this.isQuotedLiteral()) {
      return "'" + value + "'";
    } else {
      return value;
    }
  }
}