/*
    10. Programa en Java que declare una variable C de tipo entero y asígnale un valor. A continuación, muestra un 
    Mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo
    De 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional (?:) 
    dentro del println para resolverlo

 */
package Ejercicio_10;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) {
        int C = 48;
        
        System.out.println(C + " es un numero " + (C<0 ? "negativo" : "positivo"));
        System.out.println(C + " es un numero " + (C%2==0 ? "par" : "impar"));
        System.out.println(C + (C%5==0 ? " es multiplo de 5" : " no es multiplo de 5"));
        System.out.println(C + (C%10==0 ? " es multiplo de 10" : " no es multiplo de 10"));
        System.out.println(C + (C > 100 ? " es mayor de 100" : " es menor de 100"));
    }
}