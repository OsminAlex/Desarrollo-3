/*
    8. En la siguiente tabla se muestran los posibles colores en los que puede estar un semáforo, y sus significados asociados:
    
                    Colores de un semáforo
                        Color Significado
                        1. Rojo "No pasar"
                        2. Verde "Adelante"
                        3. Amarillo "Precaución"
    
    Escribir en lenguaje Java un programa que:
    
    a) Muestre el listado de los posibles colores en los que puede estar un semáforo, con sus números asociados.
    b) Pida por teclado el número (dato entero) asociado a un color.
    c) Muestre el significado del color seleccionado.
    
    Nota: Si el número introducido por el usuario, no está asociado a ningún color, se mostrará el mensaje: "ERROR: <número> no 
    está asociado a ningún color."
 */
package Ejercicio_08;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println(" - Listado de los posib les colores de un semaforo - ");
        System.out.println(" 1 - Rojo"); System.out.println(" 2 - Verde"); System.out.println(" 3 - Amarillo");
        System.out.print("\nIndique un color pra mostrar su significado: "); int Opcion = Teclado.nextInt();
        
        switch (Opcion) {
            case 1:
                System.out.println("\nEl color Rojo significa: No pasar");
                break;
            case 2:
                System.out.println("\nEl color Verde significa: Adelante");
                break;
            case 3:
                System.out.println("\nEl color Amarillo significa: Precaucion");
                break;
            default:
                System.out.print("\nERROR: " + Opcion + " no esta asociado a ningun color. ");
            break;
        }
    }
}