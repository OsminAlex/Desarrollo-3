/*
    15. En una gasolinera los surtidores de la misma registran lo que surten en galones, pero el precio de la gasolina 
    está fijado en litros. El algoritmo debe de calcular e imprimir lo que hay que cobrarle al cliente.

    Cada galón tiene 3.785 litros 
    El precio del litro es $ 1.025
 */

package Ejercicio_15;

import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double gasolina;
        
        System.out.print("Cantidad de gasolina(Galones): "); gasolina = Double.parseDouble(Teclado.readLine());
        
        double cambio = gasolina * 3.785;
        double total = cambio * 1.025;
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Total a pagar por la compra de " + gasolina + " galones de gasolina: $" + df.format(total));
    }
}