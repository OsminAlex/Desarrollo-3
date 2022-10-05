/*
20. Desarrolla una clase Cancion con los siguientes atributos:

titulo: una variable String que guarda el título de la canción.
autor: una variable String que guarda el autor de la canción.

y los siguientes métodos:
    
Cancion(String, String): constructor que recibe como parámetros el título y el autor de la canción (por este orden).

Cancion(): constructor predeterminado que inicializa el título y el autor a cadenas vacías.

dameTitulo(): devuelve el título de la canción.

dameAutor(): devuelve el autor de la canción.

ponTitulo(String): establece el título de la canción.

ponAutor(String): establece el autor de la canción.

*/

package Ejercicio_20;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla - 03/10/2022
 */

class Cancion{
    String titulo;
    String autor;
    
    //Metodo constructor por defecto
    public Cancion(){
        this.titulo = "";
        this.autor = "";
    }

    //metodos Set y Get
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //Constructor con parametros, recibe como parametros el titulo y autor

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }    
}
public class Main {
    public static void main(String[] args) {
        
    //Objeto de entrada de datos
    Scanner in = new Scanner(System.in);
    
    //Objeto Cancion
    Cancion obj = new Cancion();
       
    String titulo, autor; //variables
    
    System.out.print("Dame el titulo de la cancion: "); titulo = in.nextLine();
    obj.setTitulo(titulo);
    System.out.print("Dame el nombre del autor: "); autor = in.nextLine();
    obj.setAutor(autor);
    
    System.out.println("Titulo de la Cancion: " + obj.getTitulo());
    System.out.println("Autor de la cancion: " + obj.getAutor());
    
    }
}
