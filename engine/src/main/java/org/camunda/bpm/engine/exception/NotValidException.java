/*
 * Copyright © 2013-2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;

/**
 * <p>This exception is thrown, if a given value is not valid.</p>
 *
 * @author Roman Smirnov
 *
 */
public class NotValidException extends BadUserRequestException {

  private static final long serialVersionUID = 1L;

  public NotValidException() {
  }

  public NotValidException(String message, Throwable cause) {
    super(message, cause);
  }

  public NotValidException(String message) {
    super(message);
  }

  public NotValidException(Throwable cause) {
    super(cause);
  }

}