/*

    14. Implementar un programa en Java que genere dos enteros a y b al azar, ambos entre 1 y 30. El programa debe desplegar los 
    valores generados y posteriormente debe calcular la potencia de ab.
    
    Ejemplo:
    
    Para a = 5, b = 3, el programa debe calcular 125
 
*/

package Ejercicio_14;

/**
 *
 * @author Osmin Mendoza Sevilla - 04/10/2022
 */

class Numero{
    int A, B;
    
    int GenerarNumero(){
        this.A = (int) (Math.random() * ((30 - 1) + 1) + 1);//Genera numeros aleatorios entre el 1 y 30
        this.B = (int) (Math.random() * ((30 - 1) + 1) + 1);
        
        return 0;
    }
    
    int ElevarPotencia(){
        int Potencia = (int) Math.pow(this.A, this.B);
        return Potencia;
    }
    
    void Imprimir(){
        System.out.println("El valor de A es de: " + A + ".\nEl valor de B es de: " + B + ".");
        System.out.println("\nEl valor de A elevado al valor de B es de: " + ElevarPotencia());
    }
}
public class Main {
    public static void main(String[] args) {
        Numero Obj = new Numero();
        
        Obj.GenerarNumero();
        Obj.ElevarPotencia();
        Obj.Imprimir();
    }
}