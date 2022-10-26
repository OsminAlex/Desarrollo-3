/*
    3. Diseñar la siguiente jerarquía de clases: 
    
    Persona 
    nombre 
    edad 
    visualizar() 
    
    Estudiante                              Profesor
    nombre heredado                     nombre heredado 
    edad heredado                       edad heredado 
    id definido                         salario definido 
    visualizar() redefinido             visualizar heredada 
    

    Escribir un programa que manipule la jerarquía de clases, lea un objeto de cada clase y lo visualice. 
    a) Sin utilizar métodos abstractos. 
    b) Utilizando métodos abstractos.
 */
package Ejercicio_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
abstract class Persona {

    public String Nombre;
    public int Edad;

    abstract public void Visualizar();
}

class Estudiante extends Persona {

    int ID;

    public Estudiante() {
        super();
        ID = 0;
        /*this.Nombre = Nombre;
        this.Edad = Edad;*/
    }

    @Override
    public void Visualizar() {
        System.out.println("\n\nDatos: ");
        System.out.println("\nNombre: " + Nombre + "\nEdad: " + Edad);
        System.out.println("ID: " + ID);
    }
}

class Profesor extends Persona {

    float Salario;

    public Profesor() {
        super();
        Salario = 0;
    }

    @Override
    public void Visualizar() {
        System.out.println("\n\nDatos: ");
        System.out.println("\nNombre: " + Nombre + "\nEdad: " + Edad);
        System.out.println("Salario: " + Salario);
    }
}

public class Abstracto {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*Variable*/
        String Nombre;
        int edad;
        int id;
        float salario;

        Estudiante Alumno = new Estudiante();

        System.out.println("Estudiante\n");

        //try {
        System.out.print("Nombre: ");
        Nombre = in.nextLine();
        Alumno.Nombre = Nombre;
        /*} catch (IllegalArgumentException exec) {
            System.out.println("Ocurrio una excepcion");
        } finally {
            System.out.println("ERROR: Programa terminado.");
        }*/

        try {
            System.out.print("Edad: ");
            edad = in.nextInt();

            Alumno.Edad = edad;
        } catch (InputMismatchException exec) {
            System.out.println("No es un valor numerico.");
        }
        /*finally {
            System.out.println("ERROR: Programa terminado.");
        }*/

        try {
            System.out.print("ID: ");
            id = in.nextInt();
            Alumno.ID = id;
        } catch (InputMismatchException exec) {
            System.out.println("No es un valor numerico.");
        }
        /*finally {
            System.out.println("ERROR: Programa terminado.");
        }*/

        Alumno.Visualizar();

        Profesor Profe = new Profesor();
        System.out.println("\n\nProfesor\n");

        in.nextLine();
        //try {
        System.out.print("Nombre: ");
        Nombre = in.nextLine();
        Profe.Nombre = Nombre;
        /*} catch (IllegalArgumentException exec) {
            System.out.println("Ocurrio una excepcion");
        } finally {
            System.out.println("ERROR: Programa terminado.");
        }*/

        try {
            System.out.print("Edad: ");
            edad = in.nextInt();

            Profe.Edad = edad;
        } catch (InputMismatchException exec) {
            System.out.println("No es un valor numerico.");
        }
        /*finally {
            System.out.println("ERROR: Programa terminado.");
        }*/

        try {
            System.out.print("Salario: ");
            salario = in.nextInt();
            Profe.Salario = salario;
        } catch (InputMismatchException exec) {
            System.out.println("No es un valor numerico.");
        }
        /*finally {
            System.out.println("ERROR: Programa terminado.");
        }*/

        Profe.Visualizar();
    }
}