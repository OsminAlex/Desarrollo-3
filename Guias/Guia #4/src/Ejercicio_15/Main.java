/*

15. Implementar un programa en Java que genere al azar una secuencia de letras minúsculas, desplegándolas en pantalla. El 
programa debe contar la cantidad total de letras vocales generadas. El procesamiento debe finalizar cuando se genere la 
letra z o cuando se hayan generado 10 letras, lo que ocurra primero. Al final, se debe desplegar la cantidad total de letras 
vocales generadas. Para generar una letra minúscula al azar, hacer:

letra = (char) ((Math.random() * 26) + 'a');

Ejemplos:

Si la secuencia generada es: f, e, t, a, s, e, m, z entonces se debe desplegar un 3. Nótese que en este caso la secuencia finalizó 
porque se generó la letra z en el octavo lugar de la secuencia. Si la secuencia generada es: h, t, a, u, n, o, p, e, i, w entonces 
se debe desplegar un 5. Nótese que en este caso la secuencia finalizó porque generaron 10 letras antes de que se generase 
la z.

 */

package Ejercicio_15;

/**
 *
 * @author Osmin Mendoza Sevilla - 04/10/2022
 */

public class Main {

    public static void main(String[] args) {
        char Letra = ' ';
        int i = 1;
        int contador = 0;

        while (i <= 10 && Letra != 'z') {
            Letra = (char) ((Math.random() * 26) + 'a');

            if (Letra == 'a' || Letra == 'e' || Letra == 'i' || Letra == 'o' || Letra == 'u') {
                contador++;
            }

            System.out.println(" - " + Letra);

            if (Letra == 'z') {
                System.out.println("\nLa letra Z detiene la ejecucion");
            }

            if (i == 10) {
                System.out.println("\nSe han gerado 10 caracteres, se detiene la ejecucion");
            }

            i++;
        }

        System.out.println("\nLa cantidad de letras vocales es de: " + contador);
    }
}