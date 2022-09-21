/*
    2. Elabora un programa que permita ingresar el monto de venta alcanzado por un vendedor durante el mes, 
    luego de calcular la bonificación que le corresponde sabiendo:

    Monto              ||  Bonificacion %
    0 - 1000                    0
    1000 - 5000                 3
    5000 - 20000                5
    20000 a mas                 8
 */
package Ejercicio_02;
import java.io.*;

/**
 *
 * @author dell
 */
public class ClasePrincipal {
    
    public static void main(String[] args) throws IOException{
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        
        int monto;
        double bono;
        
        System.out.print("Indique el monto de venta de este mes: ");
        monto = Integer.parseInt(Teclado.readLine());
        
        if(monto <= 1000){
            System.out.println("No aplica a bono.");
        } else if(monto > 1000 && monto <= 5000){
            bono = 0.03;
            System.out.println("Por la venta de $" + monto + " aplica a un bono del 3%, su bono es de: " + (monto*bono));
        } else if(monto > 5000 && monto <= 20000){
            bono = 0.05;
            System.out.println("Por la venta de $" + monto + " aplica a un bono del 5%, su bono es de: " + (monto*bono));
        } else if (monto > 20000){
            bono = 0.08;
            System.out.println("Por la venta de $" + monto + " aplica a un bono del 8%, su bono es de: " + (monto*bono));
        }
    }
}