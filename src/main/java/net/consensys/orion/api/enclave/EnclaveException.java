/*
 * Copyright 2018 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package net.consensys.orion.api.enclave;

import net.consensys.orion.api.exception.OrionErrorCode;
import net.consensys.orion.api.exception.OrionException;

public class EnclaveException extends OrionException {

  public EnclaveException(OrionErrorCode code, String message) {
    super(code, message);
  }

  public EnclaveException(OrionErrorCode code, Throwable cause) {
    super(code, cause);
  }
}
