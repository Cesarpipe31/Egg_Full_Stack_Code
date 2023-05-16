/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
*/
package z003_poo_ejex07_fraccion;

import model.Fraccion;
import service.ServiceFraccion;


public class Z003_POO_eJEx07_fraccion {

    
    public static void main(String[] args) {
        ServiceFraccion sf = new ServiceFraccion();
        Fraccion fr = sf.crearFraccion();
        Fraccion fr1 = sf.crearFraccion();
        
        sf.sumarFraccion(fr, fr1);
        sf.restarFraccion(fr, fr1);
        sf.multiplicarFraccion(fr, fr1);
        sf.dividirFraccion(fr, fr1);
    }
    
}
