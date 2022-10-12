/*
    19. Crea las siguientes clases (utilice paquete):
    Motor: con métodos para arrancar el motor y apagarlo.
    Rueda: con métodos para inflar la rueda y desinflarla.
    Ventana: con métodos para abrirla y cerrarla.
    Puerta: con una ventana y métodos para abrir la puerta y cerrar la puerta.
    Coche: con un motor, cuatro ruedas y dos puertas, con los métodos que te parezcan adecuados

 */
package Ejercicio_19;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

class Motor {

    boolean EstaEncendido;

    public Motor() {
        EstaEncendido = false;
    }

    boolean ArrancarMotor() {
        if (EstaEncendido == !false) {
            System.out.println("El motor ya esta encendido.");
        } else {
            System.out.println("Se encendio el motor.");
            EstaEncendido = true;
        }

        return EstaEncendido;
    }

    boolean ApagarMotor() {
        if (EstaEncendido == !false) {
            System.out.println("Se apagado el motor");
            EstaEncendido = false;
        } else {
            System.out.println("El motor ya esta apagado");
        }

        return EstaEncendido;
    }
}

class Rueda {

    boolean EstaInflada;

    public Rueda() {
        EstaInflada = false;
    }

    boolean InflarRueda() {
        if (EstaInflada == !false) {
            System.out.println("La rueda ya esta inflada");
        } else {
            System.out.println("Se inflo la rueda");
            EstaInflada = true;
        }

        return EstaInflada;
    }

    boolean DesinflarRueda() {
        if (EstaInflada == !false) {
            System.out.println("Se desinflo la rueda");
            EstaInflada = false;
        } else{
            System.out.println("La rueda ya esta desinflada");
        }
        
        return EstaInflada;
    }
}

public class Main {

}