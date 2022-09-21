/*
    12. Escriba un programa que lea una temperatura:
    En Celsius y la convierta a una Temperatura Fahrenheit equivalente: F=(9/5)*C+32
    En Fahrenheit y la convierta a una temperatura Celsius equivalente: C= (5/9)/(F-32)
 */
package Ejercicio_12;

import java.io.*;
/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double Celsius, Fahrenheit;
        
        System.out.print("Indique la temperatura en Celsius: "); Celsius = Double.parseDouble(Teclado.readLine());
        System.out.print("Indique la temperatura en Fahrenheit: "); Fahrenheit = Double.parseDouble(Teclado.readLine());
        
        double F = (9/5)*Celsius+32;
        double C = (Fahrenheit-32)/(1.8);
        
        System.out.println(Celsius + " en grados Fahrenheit es equivalenbte a: " + F);
        System.out.println(Fahrenheit + " en grados Celsius es equivalenbte a: " + C);
    }
}