/*
    10. Construir un programa en java que permita encontrar el número mayor y el número menor de una 
    serie de números ingresados por teclado, como primera entrada se le dará el tamaño del arreglo y 
    luego los datos, también se debe indicar cuantas veces se repiten tanto el mayor como el menor.
    
    Ejemplo:
    Entrada:
    
    2 -4 -13 1 -3 15 1 9 6 -8 4 23 7 -13 13 23 15 -13 9 0
    
    Salida:
    El mayor es: 23 y se repite 2 veces.
    El menor es: -13 y se repite 3 veces.

 */
package Ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*Variables Auxiliares*/
        int auxMayor = 0;
        int auxMenor = 0;

        /*Contador*/
        int contMayor = 1;
        int contMenor = 1;

        System.out.print("Tamanio del arreglo: ");
        int tam = in.nextInt();

        int[] Numero = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Numero [" + i + "]: ");
            Numero[i] = in.nextInt();

            if (Numero[i] > auxMayor) {
                auxMayor = Numero[i];

                if (Numero[i] == auxMayor) {
                    contMayor++;
                }

            }

            if (Numero[i] < auxMenor) {
                auxMenor = Numero[i];
                //contMenor = (Numero[i] == auxMenor) ? contMenor++ : contMenor;
                if (Numero[i] == auxMenor) {
                    contMenor++;
                }
            }
        }

        System.out.println("El mayor es: " + auxMayor + " y se repite " + contMayor + " veces");
        System.out.println("El menor es: " + auxMenor + " y se repite " + contMenor + " veces");
    }
}
