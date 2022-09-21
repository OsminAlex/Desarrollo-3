/*
    Determinar la cantidad de dinero que recibira un trabajador por concepto de las horas extras trabajadas en una empresa,
    sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera horas extras y que estas se pagan al doble
    de una hora normal cuando no exceden de 8 ; si las horas extras exceden de las 8 se pagan las primeras 8 al doble de lo
    que se paga por una hora normal y el resto al triple.
 */
package Ejercicio_03;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

import java.io.*;

class HorasExtras{
    public double calculo(double horas, double pagohora){
        double paga = 0.0;
        
        if(horas > 40){
            double extras = horas - 40;
            if(extras <= 8){
                paga = (pagohora*extras) * 2;
                System.out.println("Hizo " + extras + " horas extra y se le pagara un extra de: " + paga + " por las horas");
            } else if(extras > 8){
                double temp1 = extras - 8;
                paga = (((pagohora*8)*2) + ((pagohora*temp1)*3));
                System.out.println("Hizo " + extras + " horas extra y se le pagara un extra de: " + paga + " por las horas");                
            }
        }else{
            System.out.println("No hizo horas extras");
        }
        return paga;
    }
}

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        double horasdeTrabajo, pagoHora;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Indique las horas trabajadas: ");
        horasdeTrabajo = Double.parseDouble(teclado.readLine());
        System.out.print("Indique el pago por hora: ");
        pagoHora = Double.parseDouble(teclado.readLine());
        
        HorasExtras calc = new HorasExtras();
        calc.calculo(horasdeTrabajo, pagoHora);
    }
}