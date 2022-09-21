/*
    3. Un importante local comercial de la provincia solicita la confección de un sistema para el
    seguimiento de sus ventas. Para ello solicita la confección de un programa que realice lo
    siguiente:

    Ingrese los datos de los productos a la venta que dispone dicho local. De cada producto se conoce: código (un valor numérico), descripción y precio unitario.
    
    Ingrese los datos de las ventas registradas. De cada venta se conoce: Fecha, Nro. de Vendedor (un valor entre 0 y 9), 
    código del producto vendido, cantidad vendida y forma de pago (0 – Efectivo, 1 – Débito, 2- Tarjeta)
    
    Realice una clase principal manejadora de los datos de la concesionaria.
 */

package Ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla 20/09/2022
 * 
 */

class Producto{
    
    Scanner in = new Scanner(System.in);
    
    int Codigo;
    String Descripcion;
    double Precio;
    
    //Constructor

    /*public Producto(int Codigo, String Descripcion, double Precio) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }*/
    
    //Crear un producto
    void CrearProducto(){
        System.out.print("Codigo: "); Codigo = in.nextInt();
        System.out.print("Descripcion: "); 
        in.nextLine();
        Descripcion = in.nextLine();
        System.out.print("Precio Unitario: ");Precio = in.nextDouble();
                    
        System.out.println("Producto Registrado!");
    }
    
}

class Ventas{
    
    Scanner in = new Scanner(System.in);
    
    String Fecha;
    int NoVendedor;
    int CodigoProducto;
    int Cantidad;
    int FormaPago;

    public Ventas(String Fecha, int NoVendedor, int CodigoProducto, int Cantidad, int FormaPago) {
        this.Fecha = Fecha;
        this.NoVendedor = NoVendedor;
        this.CodigoProducto = CodigoProducto;
        this.Cantidad = Cantidad;
        this.FormaPago = FormaPago;
    }
    
    //Registrar Producto
    void RegistrarVenta(){
        System.out.print("Fecha: "); Fecha = in.nextLine();
        System.out.print("Vendedor: "); NoVendedor = in.nextInt();
        System.out.print("Codigo de Producto: "); CodigoProducto = in.nextInt();
        System.out.print("Cantidad: "); Cantidad = in.nextInt();
        System.out.println("Formato de Pago: ");
        System.out.print(" 0 - Efectivo \n 1 - Debito \n 2 - Tarjeta"); FormaPago = in.nextInt();
        if(FormaPago > 2 || FormaPago < 0){
            System.out.println("Opcion Invalida");
        } else{
            System.out.println("Compra registrada");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /*
        //producto
        int codigo;
        String Descripcion;
        double Precio;
        
        //venta
        String fecha;
        int vendedor;
        int cantidad;
        int formatopago;*/
        
        int opcion = 0;
        
        do{
            System.out.println(" - Menu de Opciones - ");
            System.out.println(" 1 - Ingresar Producto");
            System.out.println(" 2 - Registrar Venta");
            System.out.println(" 3 - Salir");
            System.out.print(" - > "); opcion = in.nextInt();
            
            switch (opcion) {
                case 1:{
                    
                    Producto producto = new Producto();
                    producto.CrearProducto();
                    /*System.out.print("Codigo: "); codigo = in.nextInt();
                    System.out.print("Descripcion: "); Descripcion = in.nextLine();
                    System.out.print("Precio Unitario: ");Precio = in.nextDouble();
                    
                    System.out.println("Producto Registrado!");*/
                }break;
                
                case 2: {
                    /*System.out.print("Fecha: "); fecha = in.nextLine();
                    System.out.print("Vendedor: "); vendedor = in.nextInt();
                    System.out.print("Codigo de Producto: "); codigo = in.nextInt();
                    System.out.print("Cantidad: "); cantidad = in.nextInt();
                    System.out.print("Formato de Pago: "); formatopago = in.nextInt();
                    
                    System.out.println("Compra registrada");*/
                }break;
                
                default:
                    throw new AssertionError();
            }
        }while(opcion!=3);
    }
}