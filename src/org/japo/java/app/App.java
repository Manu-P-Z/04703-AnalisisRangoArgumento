/* 
 * Copyright 2019 Manu Portolés.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.app.libraries.UtilesEntrada;
import org.japo.java.app.libraries.UtilesPrimitivos;

/**
 *
 * @author Manu Portolés
 */
public final class App {
    
    
    //RANGO
    public static final int NUM_MIN = 1;
    public static final int NUM_MAX = 10;
    
    //MENSAJES 
    public static final String MSG_USR = "Número ......: ";
    public static final String MSG_ERR = "ERROR: Entrada Incorrecta ";
    public static final String MSG_DEN = "DENTRO";
    public static final String MSG_DEB = "FUERA ( Debajo )";
    public static final String MSG_ENC = "FUERA ( Encima )";

    public static double n;

    public final void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        
        n = UtilesEntrada.leerEntero(MSG_USR, MSG_ERR);
        
        System.out.println("---");
        System.out.printf("%s %d%n", "Mínimo ......:", NUM_MIN);
        System.out.printf("%s %d%n", "Máximo ......:", NUM_MAX);
        
        System.out.println("---");
        
        System.out.printf("%s %s%n", "Análisis ....:", 
                UtilesPrimitivos.analizarRango(
                        n, NUM_MIN, NUM_MAX, MSG_DEN, MSG_DEB, MSG_ENC));

    }

}
