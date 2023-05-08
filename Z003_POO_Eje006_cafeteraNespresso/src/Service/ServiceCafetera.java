/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Service;

import java.util.Scanner;
import model.Cafetera;

public class ServiceCafetera {

    Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        System.out.println("Cuál es la capacidad máxima de la cafetera?: ");
        int cm = leer.nextInt();
        c1.setCapacidadMaxima(cm);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        return c1;
    }

    public void llenarCafetera() {
        c1.setCantidadActual(c1.getCapacidadMaxima());
    }

    public void servirTaza() {
        System.out.println("Cuál es el tamaña de la taza a servir?: ");
        int tm = leer.nextInt();
        int tmCaf = c1.getCantidadActual();
        if (tm <= tmCaf) {
            System.out.println("La taza se llenó en " + tm);
            c1.setCantidadActual(c1.getCantidadActual() - tm);
            System.out.println("En la cafetera ha quedado: " + c1.getCantidadActual());
        } else if (tm > tmCaf) {
            System.out.println("No alcanza. La taza se llenó solo en " + tmCaf);
            c1.setCantidadActual(c1.getCantidadActual() - tmCaf);
            System.out.println("En la cafetera ha quedado: " + c1.getCantidadActual());
        }
    }
    
    public void vaciarCafetera(){
        c1.setCantidadActual(0);
        System.out.println("La capacidad actual es " + c1.getCantidadActual());
    }
    
    public void agregarCafe(int caf){
        c1.setCantidadActual(caf);
        System.out.println("Ahora la cafetera tiene: " + c1.getCantidadActual());
    }
}   

    

