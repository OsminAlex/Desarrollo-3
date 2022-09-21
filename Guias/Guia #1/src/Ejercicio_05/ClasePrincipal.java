/*
    5. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo
    double y asigna a cada una un valor. A continuación realiza y muestra por pantalla una serie de operaciones
    entre ellas.
 */
package Ejercicio_05;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        int X = 6;
        int Y = 12;
        double N = 23.62;
        double M = 45.89;
        
        //Muwestra de valores
        System.out.println("Valor de X: " + X);
        System.out.println("Valor de Y: " + Y);
        System.out.println("Valor de N: " + N);
        System.out.println("Valor de M: " + M);
        
        //Operaciones
        
        //int
        System.out.print("\n");
        System.out.println(X + " + " + Y  +" = " + (X+Y));
        System.out.println(Y + " - " + X + " = " + (Y-X));
        System.out.println(X + " x " + Y + " = " + (X*Y));
        System.out.println(Y + " / " + X + " = " + (Y/X));
        
        //double
        System.out.print("\n");
        System.out.println(N + " + " + M + " = " + (N+M));
        System.out.println(M + " - " + N + " = " + (M-N));
        System.out.println(N + " * " + M + " = " + (N*M));
        System.out.println(M + " / " + N + " = " + (M/N));
    }
}