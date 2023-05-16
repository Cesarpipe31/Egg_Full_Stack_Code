/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package service;

import java.util.Scanner;
import model.Fraccion;

public class ServiceFraccion {

    Scanner leer = new Scanner(System.in);
    Fraccion fr = new Fraccion();

    public Fraccion crearFraccion() {
        System.out.println("Generando una nueva fracción... ");
        System.out.println("Registre el valor entero del numerador: ");
        int x = leer.nextInt();
        System.out.println("Registre el valor entero del denominador: ");
        int y = leer.nextInt();
        return new Fraccion(x, y);
    }

    public void sumarFraccion(Fraccion fr1, Fraccion fr2) {
        int x1 = fr1.getX();
        int y1 = fr1.getY();
        int x2 = fr2.getX();
        int y2 = fr2.getY();
        int rx, ry;

        if (y1 == y2) {
            rx = x1 + x2;
            ry = y1;
        } else {
            rx = x1 * y2 + x2 * y1;
            ry = y1 * y2;
        }
        System.out.println("La suma es: " + rx + " / " + ry);
    }

    public void restarFraccion(Fraccion fr1, Fraccion fr2) {
        int x1 = fr1.getX();
        int y1 = fr1.getY();
        int x2 = fr2.getX();
        int y2 = fr2.getY();
        int rx, ry;

        if (y1 == y2) {
            rx = x1 - x2;
            ry = y1;
        } else {
            rx = x1 * y2 - x2 * y1;
            ry = y1 * y2;
        }
        System.out.println("La resta es: " + rx + " / " + ry);
    }

    public void multiplicarFraccion(Fraccion fr1, Fraccion fr2) {
        int x1 = fr1.getX();
        int y1 = fr1.getY();
        int x2 = fr2.getX();
        int y2 = fr2.getY();
        int rx, ry;

        if (y1 == y2) {
            rx = x1 * x2;
            ry = y1;
        } else {
            rx = x1 * x2;
            ry = y1 * y2;
        }
        System.out.println("La multiplicación es: " + rx + " / " + ry);
    }

    public void dividirFraccion(Fraccion fr1, Fraccion fr2) {
        int x1 = fr1.getX();
        int y1 = fr1.getY();
        int x2 = fr2.getX();
        int y2 = fr2.getY();
        int rx, ry;

        rx = x1 * y2;
        ry = x2 * y1;
        
        System.out.println("La división es: " + rx + " / " + ry);
    }

}
