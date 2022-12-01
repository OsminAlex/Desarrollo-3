/*
    Todas las clases van a implmentar la interfza Figura
 */
package Examen;

/**
 *
 * @author Osmin Mendoza Sevilla - 01/12/2022
 */
public interface Figura {
    
    /* Devuelve el nombre de la figura*/
    public String Nombre();
    
    /*Calcula la superficie de la figura*/
    public double calcularArea();
    
    /*Calcula el perímetro de la figura*/
    public double calcularPerimetro();
    
    /*Dibujar la figura en la pantalla, en modo texto*/
    public void dibujarTxt();
}
