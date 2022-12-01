/*
    b) Un cuadrado es un rectángulo con base y altura iguales, por lo tanto cuadrado puede ser definida como clase hija de 
     la clase rectángulo. Programe la clase cuadrado de forma tal que herede de la clase rectángulo del apartado anterior. 
     la clase cuadrado sólo necesita un constructor que reciba un parámetro (el valor del lado), y que llame al constructor 
     del rectángulo con los parámetros base y altura iguales. Probar esta nueva clase añadiendo el código necesario a la
     clase PruebaFiguras.
 */
package Examen;

/**
 *
 * @author Osmin Mendoza Sevilla 01/12/2022
 */
public class Cuadrado implements Figura { //no Herencia?

    int lado;

    public Cuadrado(int lado) {
        //super(base, altura);
        this.lado = lado;
    }

    @Override
    public String Nombre() {
        return "Soy un Cuadrado";
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void dibujarTxt() {

        //System.out.println("Soy un Cuadrado con lados de: " + lado);
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
