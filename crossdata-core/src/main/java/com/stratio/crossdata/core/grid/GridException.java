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

package com.stratio.crossdata.core.grid;

/**
 * Unchecked exception for {@link Grid} related problems.
 */
public class GridException extends RuntimeException {

    static final long serialVersionUID = -3562363467456756734L;

    /**
     * @see RuntimeException#RuntimeException()
     */
    public GridException() {
        super();
    }

    public GridException(Exception e) {
        super(e.getMessage());
    }

    /**
     * @see RuntimeException#RuntimeException(String message)
     */
    public GridException(String message) {
        super(message);
    }

    /**
     * @see RuntimeException#RuntimeException(String message, Throwable cause)
     */
    public GridException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @see RuntimeException#RuntimeException(Throwable cause)
     */
    public GridException(Throwable cause) {
        super(cause);
    }

}