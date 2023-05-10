/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
package z003_poo_ejex02_puntosycoordenadas;

import model.Puntos;
import service.ServicePuntos;


public class Z003_POO_ejEx02_puntosyCoordenadas {

    
    public static void main(String[] args) {
       ServicePuntos sp = new ServicePuntos();
       Puntos p1 = sp.crearPuntos();
        System.out.println("Los puntos son: " + p1.toString());
        sp.calcularDistancia(p1);        
    }    
}
