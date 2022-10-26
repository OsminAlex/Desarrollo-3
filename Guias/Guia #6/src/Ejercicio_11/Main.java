/*
    11. Llenar un arreglo de tamaño 20 con números aleatorios en el mismo rango usando Math.random,
    luego mostrar el mayor número de todos.

 */
package Ejercicio_11;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class Main {

    public static void main(String[] args) {

        int[] Numeros = new int[20];
        int aux = 0;

        /*LLenado de arreglo mediante un bucle for*/
        for (int i = 0; i < 20; i++) {

            /*
            Sintaxis:
                (Math.random() * ((max - min) + 1)) + min
             */
            Numeros[i] = (int) (Math.random() * ((999 - 1) + 1) + 1);/*Genera numeros aleatorios entre 999 - 1*/

            if (Numeros[i] > aux) {
                aux = Numeros[i];
            }
        }

        System.out.println("Numeros: \n");
        for (int i = 0; i < 20; i++) {
            System.out.println("[" + i + "] " + Numeros[i]);
        }

        System.out.println("El mayor es: " + aux);

    }
}
