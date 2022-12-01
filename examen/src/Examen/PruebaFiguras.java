/*
    e) Mejorar la clase PruebaFiguras para que proporcione una interfaz de usuario en modo texto, que permita al usuario elegir la 
    figura geométrica que desea pintar, solicite los parámetros adecuados para cada figura, instancia la clase y pinte la figura en 
    consola.
    
    Utilizar el siguiente menú:
    
    1. Crear rectángulo
    2. Crear cuadrado
    3. Crear triángulo
    4. ver figura
    5. salir
    
    Si el usuario selecciona una de las primeras opciones, deberán pedírsele los datos adecuados. Si selecciona la opción 4, se 
    mostrarán el área y el perímetro y se dibujará la última figura creada. Debe presentarse el menú hasta que el usuario seleccione la opción Salir.
    
    No se puede seleccionar la opción 4 hasta tanto no se haya seleccionado una figura.
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author Osmin Mendoza Sevilla 01/12/2022
 */
public class PruebaFiguras {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opc = 0;

        //Indicara si puede dibujar o no
        boolean Dibujar = false;

        boolean RecCreado = false;
        boolean CuaCreado = false;
        boolean TriCreado = false;

        /*Rectangulo (base, altura)*/
        Rectangulo Rec = new Rectangulo(0, 0);

        /*Cuadrado(lado)*/
        Cuadrado Cua = new Cuadrado(0);

        /*Triangulo (lado, lado, angulo)*/
        Triangulo Tri = new Triangulo(0, 0, 0);

        /*Triangulo Rectangulo (cateto)*/
        TrianguloRectangulo tr = new TrianguloRectangulo(0);

        do {
            System.out.println("\t\nM E N U  D E  O P C I O N E S\n");
            System.out.println("1. Crear Rectangulo");
            System.out.println("2. Crear Cuadrado");
            System.out.println("3. Crear Triangulo");
            System.out.println("4. Ver Figura");
            System.out.println("5. Salir");
            System.out.print("\n\t - - - > ");
            opc = in.nextInt();

            switch (opc) {
                case 1: {
                    //Evitar Crear mas de una figura a la vez
                    RecCreado = false;
                    CuaCreado = false;
                    TriCreado = false;

                    System.out.println("Creando Rectangulo...");
                    System.out.print("\nIndique la Base: ");
                    int base = in.nextInt();
                    System.out.print("Indique la Altura: ");
                    int altura = in.nextInt();

                    /*Base - Altura*/
                    System.out.print("\n");
                    Rec.base = base;
                    Rec.altura = altura;

                    Dibujar = true;
                    RecCreado = true;
                }
                break;

                case 2: {
                    //Evitar Crear mas de una figura a la vez
                    RecCreado = false;
                    CuaCreado = false;
                    TriCreado = false;

                    System.out.println("Creando Cuadrado... ");
                    System.out.print("\nIndique el lado: ");
                    int lado = in.nextInt();

                    Cua.lado = lado;

                    Dibujar = true;
                    CuaCreado = true;
                }
                break;

                case 3: {
                    //Evitar Crear mas de una figura a la vez
                    RecCreado = false;
                    CuaCreado = false;
                    TriCreado = false;

                    System.out.println("Creando un Triangulo... ");
                    System.out.print("\nIndique la base: ");
                    int base = in.nextInt();
                    System.out.print("Indique la altura: ");
                    int altura = in.nextInt();
                    System.out.print("Indique el lado: ");
                    int lado = in.nextInt();

                    //Asignando valores
                    Tri.base = base;
                    Tri.altura = altura;
                    Tri.lado = lado;

                    //Creando el triangulo 
                    System.out.println("\nCreando Triangulo Rectangulo... ");
                    System.out.print("\nIndique el Cateto: ");
                    int cateto = in.nextInt();

                    tr.cateto = cateto;
                    tr.base = cateto;
                    tr.altura = cateto;

                    Dibujar = true;
                    TriCreado = true;
                }
                break;

                case 4: {
                    if (Dibujar == false) {
                        System.out.println("\nNo se ha creado una figura.");
                    } else {
                        if (RecCreado == true) {

                            /*Pruebas del rectangulo*/
                            System.out.println(Rec.Nombre() + " con Base: " + Rec.base + " y altura: " + Rec.altura);
                            System.out.println("Area del Rectangulo: " + Rec.calcularArea() + "\nPerimetro del rectangulo: " + Rec.calcularPerimetro());

                            System.out.print("\n");
                            Rec.dibujarTxt();

                            RecCreado = false;
                            Dibujar = false;
                        } else if (CuaCreado == true) {
                            /*Pruebas del cuadrado*/
                            System.out.println(Cua.Nombre() + " con lados de: " + Cua.lado);
                            System.out.println("Area del Cuadrado es: " + Cua.calcularArea() + "\nPerimetro del cuadrado es: " + Cua.calcularPerimetro());

                            System.out.print("\n");
                            Cua.dibujarTxt();

                            CuaCreado = false;
                            Dibujar = false;
                        } else if (TriCreado == true) {

                            /*Pruebas del Triangulo*/
                            System.out.println(Tri.Nombre() + " con Base: " + Tri.base + ", altura: " + Tri.altura + " y con lado(angulo) de: " + Tri.lado);
                            System.out.println("Area del Triangulo es: " + Tri.calcularArea() + "\nPerimetro del Triangulo es: " + Tri.calcularPerimetro());

                            System.out.print("\n");
                            Tri.dibujarTxt();

                            /*Pruebas del TrianguloRectangulo*/
                            System.out.println("\n" + tr.Nombre() + " con Catetos: " + tr.cateto);
                            System.out.println("Area del Triangulo Rectangulo es: " + tr.calcularArea() + "\nPerimetro del Triangulo Rectangulo es: " + tr.calcularPerimetro());

                            System.out.print("\n");
                            tr.dibujarTxt();

                            TriCreado = false;
                            Dibujar = false;
                        }
                    }
                }
                break;

                case 5: {
                    System.out.println("\nAdios... ");
                }
                break;

                default: {
                    System.out.println("\nOpcion Invalida");
                }
                break;
            }

        } while (opc != 5);
    }
}
