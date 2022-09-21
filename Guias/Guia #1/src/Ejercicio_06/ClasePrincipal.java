/*
    6. Programa Java que declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones 
    que realicen lo siguiente: Incrementar N en 77, Decrementarla en 3, Duplicar su valor.
 */
package Ejercicio_06;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        int N = 45;
        
        System.out.println("Valor inicial de N es: " + N);
        N+=77;
        System.out.println("Al Incrementar 77 a N nos de el valor de: " + N);
        N-=3;
        System.out.println("Al decrementar en 3 a N nos da el valro de: " + N);
        N*=2;
        System.out.println("Al duplicar su valor nos da: " + N);
    }
}