/*
    Comensales Filósofos

    El problema de los comensales filósofos que dice así: Cinco filósofos chinos se sientan alrededor de una mesa y pasan su vida cenando y pensando.
    Cada filósofo tiene un plato de fideos y un palillo a la izquierda de su plato. Para comer los fideos son necesarios dos palillos y cada filósofo sólo puede 
    tomar los que están a su izquierda y derecha. Si cualquier filósofo toma un palillo y el otro está ocupado, se quedará esperando, con el palillo en la mano,
    hasta que pueda tomar el otro palillo, para luego empezar a comer.

    Si dos filósofos adyacentes intentan tomar el mismo tenedor a una vez, se produce una condición de carrera:

    ambos compiten por tomar el mismo palillo, y uno de ellos se queda sin comer.Si todos los filósofos toman el palillo que está a su derecha al mismo tiempo,
    entonces todos se quedarán esperando eternamente, porque alguien debe liberar el palillo que les falta.

    Nadie lo hará porque todos se encuentran en la misma situación (esperando que alguno deje sus palillos). 
    
    Entonces los filósofos se morirán de hambre. Este bloqueo mutuo se denomina interbloqueo o deadlock.
 */

 /*
    Empecemos por partes. Para este ejercicio yo necesitaré 3 clases:

    Mesa: será nuestra clase monitor, contiene los tenedores que debemos manejar (array de booleanos) y en ella haremos las operaciones de coger y dejar los tenedores.
    
    Filósofo: clase que extiende de la clase Thread y realiza las tareas del filósofo, pensar y comer.
    
    Principal: crea los 5 filósofos y empieza la aplicación.
 */
package Proyecto;

/**
 *
 * @author Osmin Mendoza Sevilla - 01/12/2022
 */
public class main {

    public static void main(String[] args) {
        
        /*En la mesa hay 5 comensales(filosofos)*/
        Mesa m = new Mesa(5);
        
        for (int i = 1; i <= 5; i++) {
            //Filosofo (Mesa(m), Comensal(i)
            Filosofo f = new Filosofo(m, i);
            f.start();
        }
    }
}
