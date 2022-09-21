/**
 * 1 . Realice un programa que determine las siguientes soluciones:
    a) Dado el radio de un círculo, encontrar la longitud de su circunferencia.
    b) Dados dos números A y B, calcular la suma, la diferencia, el producto y la división.
    c) Las calificaciones de cuatro asignaturas del último semestre de un alumno son 45.5, 75.5, 60.5, 70 ¿Cuál
    es la calificación media?
 * /
/**
 *
 * @author Osmin Mendoza Sevilla 04/08/2022
 */

import java.io.*;

class Ejercicio_01 {
    
    public double Circulo(double radio){
        //para calculart la longitud de un circuclo se usa la formula: 2 * pi * radio
        final double pi = 3.1416;
        double longitud = 2 * pi * radio;
        
        return longitud;
    }
    
    public class Numero{
        double Numero_1;
        double Numero_2;
        double suma;
        double diferencia;
        double producto;
        double division;
        
        public void Suma(){
            /*this.Numero_1 =  Numero_1;
            this.Numero_2 = Numero_2;*/
            
            /*int N1 = (int) Math.round(Numero_1);
            int N2 = (int) Math.round(Numero_2);*/
            
            suma = Numero_1 + Numero_2;
        }
        
        public void Diferencia(){
            /*this.Numero_1 =  Numero_1;
            this.Numero_2 = Numero_2;*/
            
            /*int N1 = (int) Math.round(Numero_1);
            int N2 = (int) Math.round(Numero_2);*/
            
            diferencia = Numero_1 - Numero_2;
        }
        
        public void Producto(double Numero_1, double Numero_2){
            /*this.Numero_1 =  Numero_1;
            this.Numero_2 = Numero_2;*/
            
            /*int N1 = (int) Math.round(Numero_1);
            int N2 = (int) Math.round(Numero_2);*/
            
            producto = Numero_1 * Numero_2;
        }
         
        public void Division(){
            /*this.Numero_1 =  Numero_1;
            this.Numero_2 = Numero_2;*/
            
            /*int N1 = (int) Math.round(Numero_1);
            int N2 = (int) Math.round(Numero_2);*/
            
            division = Numero_1 / Numero_2;
        }
    }
    
    
    public static void main(String[] args) throws IOException{
        
        /*double radio;
        
        BufferedReader Lectura = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese el radio del Circulo: ");
        radio = Double.parseDouble(Lectura.readLine());
        
        Ejercicio_01 longitud = new Ejercicio_01();
        System.out.println("La longitud del circulo es de: " + longitud.Circulo(radio));*/
        
        /*double Numero_1, Numero2;
        
        BufferedReader Lectura = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingese");*/
        
    }
}