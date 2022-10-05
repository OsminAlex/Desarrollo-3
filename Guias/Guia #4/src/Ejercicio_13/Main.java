/*
    13. Implementar un programa en Java que genere una secuencia de enteros al azar entre 0 y 10. El programa debe ir 
    desplegando cada entero en pantalla junto con un mensaje que diga si es par o no lo es. Además, el programa debe ir 
    sumando todos los valores impares que se vayan generando. El procesamiento debe detenerse en el momento en que la 
    suma supere el valor 25. 

    Al finalizar, el programa debe desplegar en pantalla la suma calculada.

    Ejemplo:
    Una posible ejecución sería la siguiente:
    7 – impar
    2 – par
    4 – par
    3 – impar
    9 – impar
    6 – par
    1 – impar
    3 – impar
    8 – par
    5 – impar

    El procesamiento se detuvo en el 5 porque en ese instante la suma de todos los impares generados superó a 25 
    (7+3+9+1+3+5=28)

 */
package Ejercicio_13;

/**
 *
 * @author Osmin Mendoza Sevilla - 03/10/2022
 */

public class Main {

    public static void main(String[] args) {
        int Contador = 0;
        int Numero;
        
        while(Contador <= 25) {
            Numero = (int) (Math.random() * ((10 - 0) + 1) + 0);//Genera numeros aleatorios entre el 0 y 10

            if (Numero % 2 == 0) {
                System.out.println(Numero + " - Par");
            }else{
                System.out.println(Numero + " - Impar");
                Contador += Numero;
            }
        }

        System.out.println("\n - - - - - - - - - - - - - - - - -");
        System.out.println("\nLa suma de numeros impares supero el valor 25, se detiene la ejecucion.");
        System.out.println("\nLa suma de impares es de: " + Contador);
    }
}
