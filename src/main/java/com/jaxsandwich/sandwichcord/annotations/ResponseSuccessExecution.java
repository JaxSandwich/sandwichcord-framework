/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright 2021 Juan Acuña                                                   *
 *                                                                             *
 * Licensed under the Apache License, Version 2.0 (the "License");             *
 * you may not use this file except in compliance with the License.            *
 * You may obtain a copy of the License at                                     *
 *                                                                             *
 *     http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                             *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.                                              *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package com.jaxsandwich.sandwichcord.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
/**
 * [ES] Identifica el metodo que se ejecutará una vez que el comando de respuesta se ejecute satisfactoriamente.<br>
 * [EN] Identifies the method wich will run after its response command ends it execution successfuly.
 * @author Juan Acuña
 * @since 0.5.0
 * @version 2.0<br>
 * [ES] Requiere ser usado en una clase con la anotacion {@link ResponseCommandContainer}.<br>
 * [EN] Requires be used in a class with the annotation {@link ResponseCommandContainer}.
 */
public @interface ResponseSuccessExecution {
	/**
	 * [ES] Nombre del comando de respuesta al que referencia este {@link ResponseSuccessExecution}.<br>
	 * [EN] Name of the response command referenced by this {@link ResponseSuccessExecution}.
	 */
	String name();
}
