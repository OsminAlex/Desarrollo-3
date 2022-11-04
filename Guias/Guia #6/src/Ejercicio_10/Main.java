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

        System.out.print("Tamanio del arreglo: ");
        int tam = in.nextInt();

        int[] Numero = new int[tam];

        for (int i = 0; i < Numero.length; i++) {
            System.out.print("Numero [" + (i+1) + "]: ");
            Numero[i] = in.nextInt();
        }
        
        int Mayor = Numero[0]; //Mayor por defecto
        int Menor = Numero[0]; //Menor por defecto
        int num = 0;
        
        for(int i = 0; i < Numero.length; i++){
            num = Numero[i];
            
            if(num > Mayor){ // ¿actual numero es mayor al "mayor" que tengo almacenado?
                Mayor = num; // si es mayor reemplazar, ahora tengo un nuevo mayor
            }
            
            if(num < Menor){ // ¿actual numero es menor al "menor" que tengo almacenado?
                Menor = num; //si es menor reemplazar, ahora tengo un nuevo menor
            }
        }
        
        int contMayor = 0;
        int contMenor = 0;
        
        for(int i = 0; i < Numero.length; i++){
            num = Numero[i];
            
            if(num == Mayor){
                contMayor++;
            }
            
            if(num == Menor){
                contMenor++;
            }
        }

        System.out.println("El mayor es: " + Mayor + " y se repite " + contMayor + " veces");
        System.out.println("El menor es: " + Menor + " y se repite " + contMenor + " veces");
    }
}
