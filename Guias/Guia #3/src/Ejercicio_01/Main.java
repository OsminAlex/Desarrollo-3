/*
    1. Crear una clase Persona, con atributos nombre, apellido y teléfono. Crear una clase Cuenta, con atributos 
    numeroCuenta, saldo y propietario. El propietario es un objeto tipo Persona. Crear un constructor con 
    parámetros.

    Controlar que el saldo de la cuenta no debe ser menor que 0. Crear un método llamado transacción que 
    ingrese como parámetros cantidad y tipo Transacción; tipo Transacción es “retiro” o “deposito”. Si es un 
    retiro, la cantidad se resta del saldo, y si es deposito la cantidad se incrementa al saldo. El método 
    transacción debe imprimir el tipo de transacción y el nuevo saldo. Crear en una clase llamada Principal, dos 
    cuentas pertenecientes a dos personas distintas y hacer un depósito y un retiro en cada cuenta. Imprimir 
    los valores de las personas, propietarios y transacciones.
 */

package Ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla 19/09/2022
 */

//Clase Persona
class Persona{
    String Nombre;
    String Apellido;
    String Telefono;
    
    public Persona(String Nombre, String Apellido, String Telefono){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
    }
}

class Cuenta{
    //Atributos
    int NumeroCuenta;
    double Saldo;
    Persona Propietario;

    //Metodo Construcctor
    public Cuenta(int NumeroCuenta, double Saldo, Persona Propietario) {
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.Propietario = Propietario;
    }
    
    /*public String MenuOpciones(){
        String Opcion;
        
        return Opcion;
    }*/

    //Metodo Transaccion
    public void Transaccion(double Cantidad, String TipoTransaccion){
        
        /*************************/
        
        switch(TipoTransaccion){
            case "Retiro":{
                if(Saldo <= 0){
                    System.out.println("No posee saldo suficiente para un retiro");
                } else{
                    Saldo -= Cantidad;
                    System.out.println("Retiro hecho correctamente. Su saldo actual es de: $ " + Saldo);
                }
            } break;
            
            case "Deposito":{
                Saldo+=Cantidad;
                System.out.println("Deposito hecho correctamente. Su saldo actual es de: $ " + Saldo);
            } break;
            
            default:{
                System.out.println("Opcion invalida. Intentelo nuevemente");
            }break;
        }
    
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int Cuenta = 0;
        String TipoTransaccion = null;
        double Cantidad = 0;
        String Opcion = null;
        
        Persona Juan = new Persona("Juan", "Manuel", "0123-4567");
        Persona Pedro = new Persona("Pedro", "Garza", "0202-0404");
        
        Cuenta UserJuan = new Cuenta(123456, 5000.0, Juan);
        Cuenta UserPedro = new Cuenta(246810, 5000.0, Pedro);
        
        do {            
            //String Opcion = "a";
            System.out.println(" - Banco - ");
            System.out.print("Indique se numero de Cuenta: "); Cuenta = teclado.nextInt();
            if((Cuenta != UserJuan.NumeroCuenta) && (Cuenta != UserPedro.NumeroCuenta)){
                System.out.println("Usuario no encontrado.");
            } else {
                System.out.println("\nIndique el Tipo de Transaccion: ");
                System.out.println(" - Retiro");
                System.out.println(" - Deposito");
                System.out.println(" - Salir");
                teclado.nextLine();
                System.out.print(" - - - > "); TipoTransaccion = teclado.nextLine();
                
                /*System.out.println("\nIndique el tipo de Transaccion: ");
                System.out.println(" - Retiro \n - Deposito");
                teclado.nextLine();
                System.out.print(" - - - - > "); Opcion = teclado.nextLine();*/
                
                switch (TipoTransaccion){
                    case "Retiro":{
                        System.out.print("\nIndique la cantidad a Retirar:"); Cantidad = teclado.nextDouble();
                    } break;
                    
                    case "Deposito":{
                        System.out.print("\nIndique la cantidad a Depositar: "); Cantidad = teclado.nextDouble();
                    } break;
                    
                    case "Salir":{
                         System.exit(0);
                    } break;
                    
                    default:{
                        System.out.println("Opcion Invalida. ");
                    } break;
                }
                UserJuan.Transaccion(Cantidad, TipoTransaccion);
            }
            
        } while (!"Salir".equals(TipoTransaccion));
        
        /*System.out.println(" - Banco - ");
        System.out.print("\n Indique su numero de cuenta: "); Cuenta = teclado.nextInt();
        
        System.out.println("\nIndique el Tipo de Transaccion");
        System.out.println(" - Retiro.");
        System.out.println(" - Deposito.");
        teclado.nextLine();
        System.out.print("\n - - - > "); TipoTransaccion = teclado.nextLine();
        
        System.out.print("Indique la cantidad: "); Cantidad = teclado.nextDouble();
        
        UserJuan.Transaccion(Cantidad, TipoTransaccion);*/
        
    }
}