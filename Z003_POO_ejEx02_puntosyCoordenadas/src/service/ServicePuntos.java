/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
package service;

import model.Puntos;

public class ServicePuntos {
    
    Puntos p1 = new Puntos();
    
    public Puntos crearPuntos(){
        int x1 = (int)(Math.random() * 99 + 1);
        int y1 = (int)(Math.random() * 99 + 1);
        int x2 = (int)(Math.random() * 99 + 1);
        int y2 = (int)(Math.random() * 99 + 1);
        return new Puntos(x1, y1, x2, y2);
    }
    
    public void calcularDistancia(Puntos p1){
        int x1 = p1.getX1();
        int y1 = p1.getY1();
        int x2 = p1.getX2();
        int y2 = p1.getY2();        
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);                
    }    
}
