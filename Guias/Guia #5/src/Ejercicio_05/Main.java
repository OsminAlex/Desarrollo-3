/*
    5. Codifica la siguiente jerarquía de clases java representada por este diagrama UML

    La clase base es la clase Empleado. Esta clase contiene:
    - Un atributo privado nombre de tipo String que heredan el resto de clases.
    - Un constructor por defecto.
    - Un constructor con parámetros que inicializa el nombre con el String que recibe.
    - Método set y get para el atributo nombre.
    - Un método toString() que devuelve el String: "Empleado " + nombre.
       
    El resto de clases solo deben sobrescribir el método toString() en cada una de ellas y declarar el constructor adecuado de 
    forma que cuando la ejecución de las siguientes instrucciones:

    Empleado E1 = new Empleado("Rafa");
     Directivo D1 = new Directivo("Mario");
     Operario OP1 = new Operario("Alfonso");
     Oficial OF1 = new Oficial("Luis");
     Tecnico T1 = new Tecnico("Pablo");
     System.out.println(E1);
     System.out.println(D1);
     System.out.println(OP1);
     System.out.println(OF1);
     System.out.println(T1);
     Den como resultado:
     Empleado Rafa
     Empleado Mario -> Directivo
     Empleado Alfonso -> Operario
     Empleado Luis -> Operario -> Oficial
     Empleado Pablo -> Operario -> Tecnico
 */
package Ejercicio_05;

/**
 *
 * @author Osmin Mendoza Sevilla 11/10/2022
 */
class Empleado {

    private String Nombre;

    public Empleado() {
        Nombre = "";
    }

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Empleado: " + Nombre;
    }
}

class Operario extends Empleado {

    public Operario(String Nombre) {
        super(Nombre);
    }

    public Operario() {

    }

    @Override
    public String toString() {
        return super.toString() + " - > Operario";
    }
}

class Directivo extends Empleado {

    public Directivo(String Nombre) {
        super(Nombre);
    }

    public Directivo() {

    }

    @Override
    public String toString() {
        return super.toString() + " - > Directivo";
    }
}

class Oficial extends Operario {

    public Oficial() {

    }

    public Oficial(String Nombre) {
        super(Nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " - > Oficial";
    }
}

class Tecnico extends Operario {

    public Tecnico() {

    }

    public Tecnico(String Nombre) {
        super(Nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " - Tecnico";
    }
}

public class Main {

    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
}