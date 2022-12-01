/*
    En la clase Mesa, tendremos como atributo un array de booleanos que representan a los tenedores.
    Por ejemplo, cuando el tenedor de la posición 0 este a true, significa que esta libre.

    En el constructor, inicializaremos el array, según el numero de tenedores deseados, en nuestro caso 5.
 */
package Proyecto;

import java.util.logging.*;

/**
 *
 * @author dell
 */
public class Mesa {

    private boolean[] tenedores;

    public Mesa(int numTenedores) {
        this.tenedores = new boolean[numTenedores];
    }

    /*
    Cuando un filósofo quiera coger el tenedor de la izquierda y de la derecha, tendremos que decirle cual es la posición concretamente.

    El tenedor de su izquierda, coincide con el índice del filósofo.

    El tenedor de su derecha, es una posición menos del índice del filósofo. En el caso del 0, obtendremos el ultimo índice del array.
     */
    public int tenedorIzquierda(int i) {
        return i;
    }

    public int tenedorDerecha(int i) {
        if (i == 0) {
            return this.tenedores.length - 1;
        } else {
            return i - 1;
        }
    }

    /*
    En algún momento, tenemos que hacer parar al proceso para empezar a comer y liberarlos cuando termine.

    A la hora de coger los tenedores, comprobaremos si el tenedor de la izquierda o derecha están ocupados, de ser así, esperaremos con wait().
    Sino están ocupados, pondremos a true las dos posiciones del array.

    Al dejar los tenedores, pondremos a false ambos tenedores que ocupa el filósofo y notificaremos a todos aquellos procesos que estuvieran parados en el anterior método
    para que vuelvan a comprobar los tenedores.
     */
    public synchronized void cogerTenedores(int comensal) {

        while (tenedores[tenedorIzquierda(comensal)] || tenedores[tenedorDerecha(comensal)]) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        tenedores[tenedorIzquierda(comensal)] = true;
        tenedores[tenedorDerecha(comensal)] = true;
    }

    public synchronized void dejarTenedores(int comensal) {
        tenedores[tenedorIzquierda(comensal)] = false;
        tenedores[tenedorDerecha(comensal)] = false;
        notifyAll();
    }
}
