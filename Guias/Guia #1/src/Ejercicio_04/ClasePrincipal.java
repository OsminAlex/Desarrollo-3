/*
*    4. Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y
*    una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla: El valor de cada
*    variable, la suma de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter que contiene
*    la variable C.
*/
package Ejercicio_04;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        int N = 4;
        double A = 6.8;
        char C = 'S';
        
        //Mostrar valores
        System.out.println("El valor de N es de: " + N);
        System.out.println("El valor de A es de: " + A);
        System.out.println("El valor de C es de: " + C);
        //Operaciones
        System.out.println("La suma de N + A es: " + (N + A));
        System.out.println("La resta de A - N es: " + (A-N));
        System.out.println("El valor numerico de C es de: " + (int)C);
    }
}