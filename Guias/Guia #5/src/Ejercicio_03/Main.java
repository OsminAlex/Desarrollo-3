/*
    3. Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar
    el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes 
    métodos:

    Constructor por defecto.
    Constructor con parámetros.
    Métodos Setters/getters
    
    Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán 
    prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y 
    false en caso contrario.
    
    Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se
    podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
    
    Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para daptarlo al libro.

 */
package Ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Titulo, Autor;
        int Ejemplares;

        Libro Libro_01 = new Libro("American Psycho", "Bret Easton Ellis", 1, 0); //Constructor con parametros
        Libro Libro_02 = new Libro(); //Constructor por defecto        

        System.out.println("Libro #1\n");
        System.out.println("Titulo: " + Libro_01.getTitulo());
        System.out.println("Autor: " + Libro_01.getAutor());
        System.out.println("No de Ejemplares disponibles: " + Libro_01.getNoEjemplares());
        System.out.println("No de Ejemplares prestados: " + Libro_01.getNoEjemplaresPrestados());

        
        //Uso de los metodos prestamo y devolucion
        //Metodo Prestamo
        if (Libro_01.Prestamo()) {
            System.out.println("\nSe ha prestado el libro " + Libro_01.getTitulo());
        } else {
            System.out.println("\nNo quedan ejemplares del libro " + Libro_01.getTitulo() + " para prestar.");
        }

        //Metodo devolucion
        if (Libro_01.Devolucion()) {
            System.out.println("\nSe ha devuleto el libro " + Libro_01.getTitulo());
        } else {
            System.out.println("\nNo hay ejemplares del libro " + Libro_01.getTitulo() + " para prestar.");
        }

        if (Libro_01.Prestamo()) {
            System.out.println("\nSe ha prestado el libro " + Libro_01.getTitulo());
        } else {
            System.out.println("\nNo quedan ejemplares del libro " + Libro_01.getTitulo() + " para prestar.");
        }
        
        //Si intentamos prestar de vuelta el libro nos nira que no se puede
        if (Libro_01.Prestamo()) {
            System.out.println("\nSe ha prestado el libro " + Libro_01.getTitulo());
        } else {
            System.out.println("\nNo quedan ejemplares del libro " + Libro_01.getTitulo() + " para prestar.");
        }

        System.out.println("\nLibro #1\n" + Libro_01); //Uso de toString

        System.out.println("\n\nDatos Libro #2");
        System.out.print("\nIntroduce el tiulo: ");
        Titulo = in.nextLine();
        System.out.print("Introduce el autor: ");
        Autor = in.nextLine();
        System.out.print("Introduce el numero de ejemplares: ");
        Ejemplares = in.nextInt();

        //Se asignan valores mediante los metodos set
        Libro_02.setTitulo(Titulo);
        Libro_02.setAutor(Autor);
        Libro_02.setNoEjemplares(Ejemplares);

        System.out.println("\nDatos del Libro 2");
        System.out.println(Libro_02);

    }
}