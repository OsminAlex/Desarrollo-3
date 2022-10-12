/*

********************************************************************************

 */

package Ejercicio_03;

public class Libro {

    private String Titulo;
    private String Autor;
    private int NoEjemplares;
    private int NoEjemplaresPrestados;

    public Libro() {
        Titulo = "";
        Autor = "";
        NoEjemplares = 0;
        NoEjemplaresPrestados = 0;
    }

    public Libro(String Titulo, String Autor, int NoEjemplares, int NoEjemplaresPrestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NoEjemplares = NoEjemplares;
        this.NoEjemplaresPrestados = NoEjemplaresPrestados;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNoEjemplares() {
        return NoEjemplares;
    }

    public void setNoEjemplares(int NoEjemplares) {
        this.NoEjemplares = NoEjemplares;
    }

    public int getNoEjemplaresPrestados() {
        return NoEjemplaresPrestados;
    }

    //Metodo prestamo
    public boolean Prestamo() {
        boolean Prestamo = true;

        if (NoEjemplaresPrestados < NoEjemplares) {
            NoEjemplaresPrestados++;
        } else {
            Prestamo = false;
        }

        return Prestamo;
    }

    //Metodo de devolucion
    public boolean Devolucion() {
        boolean Devolucion = true;

        if (NoEjemplaresPrestados == 0) {
            Devolucion = false;
        } else {
            NoEjemplaresPrestados--;
        }

        return Devolucion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "\nTitulo: " + Titulo + "\nAutor: " + Autor + "\nNo de Ejemplares: " + NoEjemplares + "\nNo de Ejemplares prestados: " + NoEjemplaresPrestados;
    }
}