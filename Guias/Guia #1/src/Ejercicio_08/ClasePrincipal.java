/*
    8. Programa Java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un 
    mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
 */
package Ejercicio_08;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int A = 10;
        
        System.out.println("El numero " + A + (A%2==0 ? " es par " : " es impar "));
    }
}