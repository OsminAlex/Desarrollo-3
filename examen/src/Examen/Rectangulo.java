/*
    a) La primera clase a implementar representará un rectángulo y se llamará Rectángulo. Debe implementar todos los métodos 
    de la interfaz Figura, además de tener un constructor (que reciba como parámetros las dimensiones del rectángulo), y las 
    variables necesarias.

    Para representar un rectángulo, puedes utilizar dos variables enteras: su base y su altura.
    Por lo tanto, lo más adecuado es que el constructor tome como parámetros ambas variables.

    El método dibujarTxt () debe dibujar la figura en la consola de texto.
    Por ejemplo, un rectángulo con base 6 y altura 3 se podría mostrar como:
    
    ******
    ******
    ******

    Para probar la clase rectángulo, debes programar una clase llamada PruebaFiguras, que en su método main cree 
    una instancia de la clase Rectángulo y la muestre en consola, junto con su área y perímetro.

 */
package Examen;

/**
 *
 * @author dell
 */
public class Rectangulo implements Figura {

    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String Nombre() {
        return "Soy un Rectangulo";
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + base);
    }

    @Override
    public void dibujarTxt() {

        //System.out.println("Rectangulo con base: " + base + " y un altura de: " + altura + "\n");

        for (int i = 0; i < altura; i++) {
            System.out.print("*");
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
