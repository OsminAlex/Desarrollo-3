/*
    5. Escribir en JAVA un programa que:
    a) Pida por teclado la arista (dato real) de un cubo.
    b) Calcule el volumen del cubo. 
    c) Muestre por pantalla el resultado (dato real).
    Nota: Volumen de un cubo = arista3 (AL CUBO)

 */
package Ejercicio_05;

import java.io.*;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double arista;
        
        System.out.print("Indique la arista del Cubo: "); arista = Double.parseDouble(Teclado.readLine());
        
        double volummen = Math.pow(arista, 3); //funcion para elevar la arista al cubo
        
        System.out.println("El volumen del cubo con Arista " + arista + " es de: " + volummen);
    }
}