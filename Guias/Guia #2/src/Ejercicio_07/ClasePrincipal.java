/*
    7. Escribir un programa que pida el total de kilómetros recorridos, el precio de la gasolina (por litro), el dinero de gasolina
    gastado en el viaje y el tiempo que se ha tardado (en horas y minutos) y que calcule:

    • Litros consumidos totales
    • Litros por km 
    • Dinero por km
    • Tiempo empleado, convertido a horas (horastotal = horas + minutos / 60)
    • Consumos por cada 100 km (Tlitrosporcada100, Tpesosporcada100

 */
package Ejercicio_07;

import java.io.*;

/**
 *
 * @author Osmin Mendoza sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double KilometrosRecorridos, PrecioGas, DineroGas, tiempo;
        
        System.out.print("Kilomentros recorrido: "); KilometrosRecorridos = Double.parseDouble(Teclado.readLine());
        System.out.print("Precio de la gasolina: "); PrecioGas = Double.parseDouble(Teclado.readLine());
        System.out.print("Dinero de gasolina gastado en el viaje: "); DineroGas = Double.parseDouble(Teclado.readLine());
        System.out.println("Tiempo del viaje(minutos): "); tiempo = Double.parseDouble(Teclado.readLine());
        
        double LitrosConsumidos = DineroGas/(PrecioGas * KilometrosRecorridos)*100;
        
        //System.out.println(LitrosConsumidos);
    }
}