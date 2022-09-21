/*
    4. Escribir en JAVA un programa que:

    a)Pida por teclado dos numeros(enteros) y sean almacenados en dos variables, llamadas v1 y v2.
    b)Intercambie los valores de las variables
    c)Muestre por pantalla los valores contenidos de las variables
 */
package Ejercicio_04;

import java.io.*;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

class Intercambio{
    
    public void cambio(int a, int b){
        int temp = a;
        
        a = b;
        b = temp;
        
        System.out.println("El nuevo valor de V1 es de: " + a + "\nEl nuevo valor de V2 es de: " + b);
        
    }
}
public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        int v1, v2;
        
        System.out.print("Indique el valo de V1: ");
        v1 = Integer.parseInt(teclado.readLine());
        
        System.out.print("Indique el valo de V2: ");
        v2 = Integer.parseInt(teclado.readLine());
        
        System.out.println("\n¡Se intercambian los valores!\n");
        
        Intercambio cambio = new Intercambio();
        cambio.cambio(v1, v2);
    }
}