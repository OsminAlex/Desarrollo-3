/*
    7. Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una. A continuación 
    realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de 
    D, D tome el valor de B.
 */
package Ejercicio_07;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int A = 8, B = 5, C = 3, D = 6, AUX;
        
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        
        System.out.println("\nB toma el valor de C: " + B);
        System.out.println("\nC toma el valor de A: " + C);
        System.out.println("\nA toma el valor de D: " + A);
        System.out.println("\nD toma el valor de B: " + D);
    }
}