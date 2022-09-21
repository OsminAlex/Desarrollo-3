/*
    13. Escriba un programa que desglose cierta cantidad de segundos introducido por el Teclado en su equivalente 
    en semanas, días, horas y segundos.
 */

package Ejercicio_13;

import java.io.*;
/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        int segundosIniciales, segundos, minutos, horas, dias, semanas;
        
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Indique la cantidad de segundos para la conversion: ");
        segundosIniciales = Integer.parseInt(Teclado.readLine());
        
        segundos = segundosIniciales % 60;
        minutos = segundosIniciales / 60;
        horas = minutos / 60;
        minutos = minutos % 60;
        dias = horas / 24;
        horas = horas % 24;
        semanas = dias / 7;
        dias = horas % 24;
        
        
        System.out.println("Los " + segundosIniciales + " equivalen a: " + segundos + " segundos, " + minutos + " minutos, " + horas + " horas, " + dias + " dias y " + semanas + " semanas");
    }
}