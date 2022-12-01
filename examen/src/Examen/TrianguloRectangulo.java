/*
    d) Implementar la clase TriánguloRectángulo. En este caso, sí se puede representar la figura en consola.

    Dado que la mayoría de los métodos y variables necesarios ya están implementados en la clase Triángulo, TriánguloRectángulo debe heredar de la 
    clase anterior, añadiendo el constructor adecuado (trabajaremos con triángulo rectángulos isósceles, esto es, con los dos catetos iguales;
    por tanto, para representar un triángulo rectángulo sólo necesitas conocer uno de los catetos).

    Además debes implementar el método dibujarTxt(), que debe mostrar el triángulo de forma semejante al siguiente ejemplo (con cateto igual a 5):

    *
    **
    ***
    ****
    *****
 */
package Examen;

/**
 *
 * @author Osmin Mendoza Sevilla
 */
public class TrianguloRectangulo implements Figura { //no Herencia?

    int cateto;
    double base, altura;

    public TrianguloRectangulo(int cateto) {
        this.cateto = cateto;
        this.base = cateto;
        this.altura = cateto;
    }

    @Override
    public String Nombre() {
        return "Soy un Triangulo Rectangulo";
    }

    @Override
    public double calcularArea() {
        return ((altura * base) / 2);
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + cateto;
    }

    @Override
    public void dibujarTxt() {
        int aux = 1;

        for (int i = 1; i <= cateto; i++) {
            for (int j = 1; j <= aux; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            aux++;
        }
    }
}
