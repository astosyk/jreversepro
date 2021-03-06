/**
 * JReversePro - Java Decompiler / Disassembler.
 * Copyright (C) 2008 Karthik Kumar.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *  
 *  	http://www.apache.org/licenses/LICENSE-2.0 
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  * 
 */
package org.jreversepro.reflect.variabletable;

import java.util.List;
import java.util.Map;

import org.jreversepro.reflect.Method;


public class DynamicVariableTableContext {

  Map<Integer, String> mapMethodExceptions;

  int maxSymbols; // = rhsMethod.getMaxLocals();

  List<String> args; // = rhsMethod.getArgList();

  boolean isMethodStatic; // Is the given method static

  String jvmMethodReturnType; // JVM Method Return type
  
  /**
   * 
   * @param method
   *          Method Instance for SymbolTableContext needs to be created.
   */
  public DynamicVariableTableContext(Method method) {
    maxSymbols = method.getMaxLocals();
    args = method.getArgList();
    isMethodStatic = method.isStatic();
    mapMethodExceptions = method.getExceptionBlocks().getAllExceptionsAsMap();
    jvmMethodReturnType = method.getReturnType();
  }

  
}
