package org.example;

import java.util.Stack;
public class Pila {
    public static void main(String args[]) {

        String cadena1 = "El covid 19 ha generado recesión en varios países de Sudamérica (Argentina, Brasil) que venían con su economía complicada (problemas políticos, fugas de capitales.";

        String cadena2 = "El covid 19 ha generado recesión en varios países de Sudamérica (Argentina, Brasil) que venían con su economía complicada (problemas políticos, fugas de capitales)";

        System.out.println("Verificación de paréntesis para cadena1:");

        System.out.println(verificarParentesis(cadena1));

        System.out.println("Verificación de paréntesis para cadena2:");

        System.out.println(verificarParentesis(cadena2));

    }

    public static boolean verificarParentesis(String cadena) {

        Stack<String> pila = new Stack<String>();

        int i = 0;

        // Recorremos la expresión carácter a carácter.

            while (i<cadena.length())

        {

            // Si el paréntesis es de apertura, apilamos siempre.

            if(cadena.charAt(i)=='(')

            {

                pila.push("(");

            }

            else

// Si el paréntesis es de cierre, actuamos según el caso.

                if (cadena.charAt(i)==')')

                {

                    // Si la pila no está vacía, desapilamos.

                    if (!pila.empty())

                    {

                        pila.pop();

                    }

                    else

                    // La pila no puede empezar con un cierre, apilamos y salimos.

                    {

                        pila.push(")");

                        break;

                    }

                }

            i++;

        }

// Si la pila está vacía --> la verificación es correcta y si no, es falsa.

        return pila.empty();

    }

}