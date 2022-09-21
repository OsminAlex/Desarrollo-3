/*
    6. La presión, el volumen y la temperatura de una masa de aire se relacionan por la fórmula:

     masa = (presión * volumen)/ (0.37 * (temperatura + 460)).
 */
package Ejercicio_06;

import java.io.*;

import java.text.DecimalFormat;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double presion, volumen, temperatura;
        
        System.out.print("Presion: "); presion = Double.parseDouble(Teclado.readLine());
        System.out.print("Volumen: "); volumen = Double.parseDouble(Teclado.readLine());
        System.out.print("Temperatura: "); temperatura = Double.parseDouble(Teclado.readLine());
        
        double Masa = (presion * volumen) / (0.37 * (temperatura + 460));
        
        DecimalFormat df = new DecimalFormat("#.00");//Limitar a dos decimales
        
        System.out.println("\nLa masa es de: " + df.format(Masa));
    }
}