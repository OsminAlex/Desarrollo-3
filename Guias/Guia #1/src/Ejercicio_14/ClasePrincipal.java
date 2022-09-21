/*
    14. Escriba un programa que exprese cierta cantidad de dólar en billetes y monedas a la moneda del curso legal 
    de nuestro país
 */

package Ejercicio_14;

import java.io.*;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double dolares;
        double cambio = 35.97;
        double reserva;
        double quinientos, doscientos, cien, cincuenta, veinte, diez;
        
        System.out.print("Dolares: "); dolares = Double.parseDouble(Teclado.readLine());
        
        double total = dolares * cambio;
        
        /*Desglose de billetes y monedas*/
        
        quinientos = total/500; //division normal
        reserva = total%500; //division del residuo para usarlo en la siguiente division
        
        doscientos = reserva/200;
        reserva = reserva%200;
        
        cien = reserva/100;
        reserva = reserva%100;
        
        cincuenta = reserva/50;
        reserva = reserva%50;
        
        veinte = reserva/20;
        reserva = reserva%20;
        
        diez = reserva/10;
        reserva = reserva%10;
       
        System.out.println((int)dolares + " dolares equivale a " + total + " cordobas y se desglosa en " + (int)quinientos + " billetes de 500, " + (doscientos>=1 ? (int)doscientos + " billetes de 200, " : "") + (cien>=1 ? (int)cien + " billetes de 100, " : "") + (cincuenta>=1 ? (int)cincuenta + " billetes de 50, " : "") + (veinte>=1 ? (int)veinte + " billetes de 20, " : "") + (diez>=1 ? (int)diez + " billetes de 10, " : "") + (reserva>=1 ? (int)reserva + " monedas. " : ".") );
    }
}