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

package com.jaxsandwich.sandwichcord.core.util.defaultvalues;

import com.jaxsandwich.sandwichcord.annotations.text.*;
import com.jaxsandwich.sandwichcord.core.util.Language;
@ValuesContainer(Language.ES)
/**
 * [ES] Valores por defecto dentro del framework. En este caso: Español.<br>
 * [EN] Defaul values inside the framework. In this case: Spanish.
 * @author Juancho
 * @version 1.0
 * @since 0.4.2
 */
public class Strings_es {
	@ValueID("xyz-sndwch-def-hlp-title")
	public static final String HLP_T = "Lista de comandos por categorias.";
	
	@ValueID("xyz-sndwch-def-hlp-desc")
	public static final String HLP_D = "";
	
	@ValueID("xyz-sndwch-def-hlp-cmdhint")
	public static final String H_CMD_HINT = "\nPara saber más sobre este comando, escriba %sayuda $%s.";
	
	@ValueID("xyz-sndwch-def-hlp-cathint")
	public static final String H_CAT_HINT = "\nPara más detalles, escriba %sayuda %s.";

	@ValueID("xyz-sndwch-def-hlp-cattitle")
	public static final String H_CAT_T = "Categoría: %s";

	@ValueID("xyz-sndwch-def-hlp-cats")
	public static final String H_CATS = "Categorias";
	
	@ValueID("xyz-sndwch-def-hlp-catcmd")
	public static final String H_CAT_CMD = "\n*Comandos*:   %s";

	@ValueID("xyz-sndwch-def-hlp-cmd-opts")
	public static final String H_CMD_OPTS = "Parámetros/Opciones:";

	@ValueID("xyz-sndwch-def-hlp-cmd-opt")
	public static final String H_CMD_OPT = "Parametro: %s";

	@ValueID("xyz-sndwch-def-hlp-dup")
	public static final String H_DUP = "```'%s' tambien hace referencia a un comando, para consultar por este, anteponga '$' para diferenciar de la categoria.```";

	@ValueID("xyz-sndwch-def-hlp-cat-nf")
	public static final String H_CNF = "No se encontró categoría/comando.";
	
	@ValueID("xyz-sndwch-def-t-dnf")
	public static final String T_0 = "No se encontró descripción.";
	
	@ValueID("xyz-sndwch-def-t-na")
	public static final String T_1 = "No disponible";
	
	@ValueID("xyz-sndwch-def-t-boff")
	public static final String T_2 = "Este bot se encuentra fuera de servicio.";
	
	@ValueID("xyz-sndwch-def-t-ncmd")
	public static final String T_3 = "Este comando no se encuentra habilitado. :pensive:";
	
}
