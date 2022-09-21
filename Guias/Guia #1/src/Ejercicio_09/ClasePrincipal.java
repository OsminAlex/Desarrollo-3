/*
    9. Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación, muestra un 
    Mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el 
    operador condicional (?:) dentro del println para resolverlo.
 */
package Ejercicio_09;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) {
        int B = -25;
        
        System.out.println(B + " es un numero " + (B<0 ? "negativo" : "positivo"));
    }
}