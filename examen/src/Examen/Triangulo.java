/*
    c) Ahora vamos a definir una nueva figura: el triángulo.
    En la consola no podemos representar cualquier triángulo. Por lo tanto, no se puede implementar en la clase triángulo el método dibujarTxt().

    Por ello, declararemos este método como abstracto y, por tanto, también la clase. El resto de los métodos sí pueden ser implementados.
    
    Por otra parte para definir un triángulo vamos a utilizar tres variables, lado1, lado2 y ángulo (ángulo que forman los dos lados anteriores).
    
    En este ejercicio debes programar todos los métodos de la clase Triángulo, excepto dibujarTxt().

    Recuerda que una clase abstracta puede tener constructores, aunque no pueden instanciarse objetos.

    Sin embargo, a diferencia del resto de los métodos, estos constructores no se ejecutan automáticamente al crear objetos de las clases hijas.
 */
package Examen;

/**
 *
 * @author Osmin Mendoza Sevilla
 */

public class Triangulo implements Figura{ //no Abstract?

    int base;
    int altura;
    int lado;

    public Triangulo(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    @Override
    public String Nombre() {
        return "Soy un Triangulo";
    }

    @Override
    public double calcularArea() {
        return (int) ((base * altura) / 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado + lado + lado;
    }

    @Override
    public void dibujarTxt() {
        System.out.println("\nNo se pude dibujar un Triangulo");
    }
    
    
}
