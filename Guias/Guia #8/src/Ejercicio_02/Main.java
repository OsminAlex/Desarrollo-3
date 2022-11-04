/*
    2. Realice la implementación del diagrama de clases que se muestra en la parte superior. 
    
    Como podrá apreciar todos los empleados tienen nombres, apellidos, salario Base y salario como 
    atributos en común.
    
    La forma del cálculo del salario varia para cada sub clase. Para el
    
    - Jefe: salario es igual al salario base
    - Trabajador por comisión: este trabajador tiene un salario base más un porcentaje por las ventas realizadas.
    - Trabajador por destajo (por producción): su salario es igual al salario base más el total de piezas producidas por el salario de producir dicha pieza.
    
    La implementación deberá de leer desde el teclado, según corresponda la instancia a la que se haga referencia. Deberá de incluir un menú:
    
    1 Jefe
    2 Trabajador por comisión
    3 Trabajador por destajo
    9 Salir de menú

 */
package Ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
abstract class Empleado {

    public String Nombre;
    public String Apellido;
    public float SalarioBase;
    public float Salario;

    public abstract void CalcularSalario();

    public abstract void Imprimir();
}

class Jefe extends Empleado {

    @Override
    public void CalcularSalario() {
        Salario = SalarioBase;
    }

    @Override
    public void Imprimir() {
        System.out.println("\n\nNombre: " + Nombre + " " + Apellido);
        System.out.println("\nEl salario del jefe es de: " + Salario);
    }
}

class TrabajadorPorComision extends Empleado {

    public int PorcentajeDeComision;
    public float ventas;

    @Override
    public void CalcularSalario() {
        Salario = SalarioBase + (ventas * ((float) PorcentajeDeComision / 100));
    }

    @Override
    public void Imprimir() {
        System.out.println("\n\nNombre: " + Nombre + " " + Apellido);
        System.out.println("\nEl salario del trabajador por comision es de: " + Salario);
    }
}

class TrabajadorPorDestajo extends Empleado {

    public int PiezasProducidas;
    public float SalarioPorPieza;

    @Override
    public void CalcularSalario() {
        Salario = SalarioBase + (PiezasProducidas * SalarioPorPieza);
    }

    @Override
    public void Imprimir() {
        System.out.println("\n\nNombre: " + Nombre + " " + Apellido);
        System.out.println("\nEl salario del trabajador por destajo es de: " + Salario);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc = 0;

        /*Variables*/
        String Nombre;
        String Apellido;
        float SalarioBase;

        /* - - -*/
        int PorcentajeComision;
        float Ventas;
        int PiezasProducidas;
        float SalarioPorPieza;

        do {
            System.out.println("\n\n - - - Menu de Opciones - - -");
            System.out.println("\n 1 - Jefe\n 2 - Trabajador por comision\n 3 - Trabajador por destajo\n 9 - Salir");
            System.out.print("\n - - - > ");
            opc = in.nextInt();

            switch (opc) {
                case 1: {

                    Jefe jefe_ = new Jefe();
                    in.nextLine();

                    System.out.print("Nombre: ");
                    Nombre = in.nextLine();
                    System.out.print("Apellido: ");
                    Apellido = in.nextLine();
                    System.out.print("Salario Base: ");
                    SalarioBase = in.nextFloat();

                    jefe_.Nombre = Nombre;
                    jefe_.Apellido = Apellido;
                    jefe_.SalarioBase = SalarioBase;

                    jefe_.CalcularSalario();
                    jefe_.Imprimir();
                }
                break;

                case 2: {

                    TrabajadorPorComision Trabajador = new TrabajadorPorComision();
                    in.nextLine();

                    System.out.print("Nombre: ");
                    Nombre = in.nextLine();
                    System.out.print("Apellido: ");
                    Apellido = in.nextLine();
                    System.out.print("Salario Base: ");
                    SalarioBase = in.nextFloat();
                    System.out.print("Ventas: ");
                    Ventas = in.nextFloat();
                    System.out.print("Porcentaja de comision: %");
                    PorcentajeComision = in.nextInt();

                    Trabajador.Nombre = Nombre;
                    Trabajador.Apellido = Apellido;
                    Trabajador.SalarioBase = SalarioBase;
                    Trabajador.ventas = Ventas;
                    Trabajador.PorcentajeDeComision = PorcentajeComision;

                    Trabajador.CalcularSalario();
                    Trabajador.Imprimir();
                }
                break;

                case 3: {

                    TrabajadorPorDestajo Trabajador = new TrabajadorPorDestajo();
                    in.nextLine();

                    System.out.print("Nombre: ");
                    Nombre = in.nextLine();
                    System.out.print("Apellido: ");
                    Apellido = in.nextLine();
                    System.out.print("Salario Base: ");
                    SalarioBase = in.nextFloat();
                    System.out.print("Salario por pieza: ");
                    SalarioPorPieza = in.nextFloat();
                    System.out.print("Piezas Producidas: ");
                    PiezasProducidas = in.nextInt();

                    Trabajador.Nombre = Nombre;
                    Trabajador.Apellido = Apellido;
                    Trabajador.SalarioBase = SalarioBase;
                    Trabajador.SalarioPorPieza = SalarioPorPieza;
                    Trabajador.PiezasProducidas = PiezasProducidas;

                    Trabajador.CalcularSalario();
                    Trabajador.Imprimir();

                }
                break;

                case 9: {
                    System.out.println("\n\nAdios!");
                }
                break;

                default: {
                    System.out.println("\n\nOpcion invalida!");
                }
                break;
            }
        } while (opc != 9);
    }
}
