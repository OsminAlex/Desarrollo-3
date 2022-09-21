/*
    11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y muestra por pantalla la longitud
    Y el área de la circunferencia. Longitud de la circunferencia = 2*PI*radio, Área de la circunferencia = PI*radio*radio
 */
package Ejercicio_11;

import java.io.*;

/**
 *
 * @author Osmin Mendoza Sevilla
 */


class Circulo{
    
    final double PI = 3.1416;
    
    public double Longitud(double radio){
        double Longitud = 2 * PI * radio;
        
        return Longitud;
    }
    
    public double Area(double radio){
        double Area = PI * (radio*radio);
        
        return Area;
    }
}
public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double radio;
        
        System.out.print("Indique el radio del circulo: "); radio = Double.parseDouble(Teclado.readLine());
        
        Circulo Calculo = new Circulo();
        
        System.out.println("\nLa longitud del circulo es de: " + Calculo.Longitud(radio));
        System.out.println("\nEl area del circulo es de: " + Calculo.Area(radio));
    }
}