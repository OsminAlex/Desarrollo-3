/**
 * 1 . Realice un programa que determine las siguientes soluciones:
    a) Dado el radio de un círculo, encontrar la longitud de su circunferencia.
    b) Dados dos números A y B, calcular la suma, la diferencia, el producto y la división.
    c) Las calificaciones de cuatro asignaturas del último semestre de un alumno son 45.5, 75.5, 60.5, 70 ¿Cuál
    es la calificación media?
 * /
/**
 *
 * @author Osmin Mendoza Sevilla 04/08/2022
 */
package Ejercicio_01;

import java.io.*;

public class ClasePrincipal {
    public static void main(String[] args) throws IOException{
        
        BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedReader Lectura = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(" - Menu de Opciones - ");
        System.out.println(" 1 - Calcular Longitud de un Circulo");
        System.out.println(" 2 - Operacion de dos numeros");
        System.out.println(" 3 - Calificacion meida");
        System.out.print("\nIndique se eleccion: ");
        int Opcion = Integer.parseInt(Entrada.readLine());
        
        switch (Opcion) {
            case 1:
                double radio;

                System.out.print("Indique el radio del circulo: ");
                radio = Double.parseDouble(Lectura.readLine());

                Circulo longitud = new Circulo();
                System.out.println("La longitud del circulo es: " + longitud.Circulo(radio));
            break;
            case 2:
                double Numero_1;
                double Numero_2;

                System.out.print("Indique el primer numero: "); Numero_1 = Double.parseDouble(Lectura.readLine());

                System.out.print("Indique el segundo numero: "); Numero_2 = Double.parseDouble(Lectura.readLine());

                Numero Calculo = new Numero();

                System.out.println("La suma es: " + Calculo.Suma(Numero_1, Numero_2));
                System.out.println("La diferencia es de: " + Calculo.Diferencia(Numero_1, Numero_2));
                System.out.println("El producto es de: " + Calculo.Producto(Numero_1, Numero_2));
                System.out.println("La division es de: " + Calculo.Division(Numero_1, Numero_2));
            break;
                
            case 3:
                double Nota1 = 45.5;
                double Nota2 = 75.5;
                double Nota3 = 60.5;
                double Nota4 = 70;

                Promedio CalculoPromedio = new Promedio();
                System.out.println("La califiacion media del estudiante es de: " + CalculoPromedio.Promedio(Nota1, Nota2, Nota3, Nota4));
            break;
                
            default:
                System.out.println("Opcion Invalida");
            break;
        }
    }
}