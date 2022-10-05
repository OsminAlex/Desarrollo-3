/*

2. Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
    
La clase tendrá los siguientes constructores:

Constructor por defecto
Constructor con parámetros para inicializar el contador con un valor no negativo. Si el valor inicial que se 
recibe es negativo el contador tomará el valor cero como valor inicial.

Además de los métodos getter y setter, la clase contendrá los métodos:

incrementar: incrementa el contador en una unidad.
decrementar: decrementa el contador en una unidad.
El contador nunca podrá tener un valor negativo.

Si al decrementar se alcanza un valor negativo el contador toma el valor cero.

Una vez creada la clase, escribe un método main para probar la clase.

 */
package Ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla - 04/10/2022
 */
class Contador {

    int Cont;

    public Contador() {
        this.Cont = 0;
    }

    public Contador(int Cont) {
        this.Cont = Cont;

        if (Cont < 0) {
            Cont = 0;
        }
    }

    public int getCont() {
        return Cont;
    }

    public void setCont(int Cont) {
        this.Cont = Cont;
    }

    void Incrementar() {
        Cont++;
    }

    void Decrementar() {
        if (Cont < 0) {
            Cont = 0;
        } else {
            Cont--;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opc;

        Contador Obj = new Contador();

        do {

            System.out.println("\nValor actual del contador: " + Obj.getCont());
            System.out.println("\n - Menu de Opciones");
            System.out.println(" 1 - Inicializar Contador");
            System.out.println(" 2 - Incrementar Contador");
            System.out.println(" 3 - Decrementar Contador");
            System.out.println(" 4 - Salir");
            System.out.print(" - - - > ");
            opc = in.nextInt();

            switch (opc) {
                case 1: {
                    System.out.print("\nIndique el valor inicial: ");
                    int valor = in.nextInt();

                    if (valor < 0) {
                        System.out.println("\nEl valor no puede ser negativo, se la asigna el valor inicial.");
                        Obj.setCont(0);
                    } else {
                        Obj.setCont(valor);
                    }
                }
                break;

                case 2: {
                    System.out.println("\nSe Incremento el contador.");
                    Obj.Incrementar();
                }
                break;

                case 3: {
                    if (Obj.getCont() <= 0) {
                        System.out.println("\nEl valor no puede ser negativo, se la asigna el valor inicial.");
                        Obj.setCont(0);
                    } else {
                        System.out.println("\nSe Decremento el contador.");
                        Obj.Decrementar();
                    }
                }
                break;

                case 4: {
                    System.out.println("\nFin de la ejecucion");
                }
                break;

                default: {
                    System.exit(1);
                }
                break;
            }

        } while (opc != 4);
    }
}