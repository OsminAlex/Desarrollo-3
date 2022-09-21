/*
    1. Elabore un programa que mediante un menú de opciones pueda calcular cualquier tabla de la suma
     y multiplicación.
 */
package Ejercicio_01;
import java.io.*;
/**
 *
 * @author dell
 */
public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(" - Menu de Opciones - ");
        System.out.println(" 1 - Tabla de Suma");
        System.out.println(" 2 - Tabla de multiplicacion");
        System.out.print("Indique una opcion: "); int opcion = Integer.parseInt(Teclado.readLine());
        
        switch (opcion) {
            case 1 -> {
                int numero, temp;
                
                //entrada de datos
                System.out.print("Indique la tabla que a mostrar: ");
                numero = Integer.parseInt(Teclado.readLine());
                temp = numero;
                
                //salida de datos
                System.out.println("\nTabal del " + numero + "\n");
                for(int i = 1; i<=10; i++){
                    System.out.println(temp + " + " + i + " = " + (++numero));
                }
            }
            
            case 2 -> {
                int numero, temp;
                
                //entrada de datos
                System.out.print("Indique la tabla que a mostrar: ");
                numero = Integer.parseInt(Teclado.readLine());
                temp = numero;
                
                //salida de datos
                System.out.println("\nTabal del " + numero + "\n");
                for(int i = 1; i<=10; i++){
                    System.out.println(temp + " * " + i + " = " + (numero*i));
                }
            }
            
            default -> System.out.println("Opcion Invalida");
        }
    }
}