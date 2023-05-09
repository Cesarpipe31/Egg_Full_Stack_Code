/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/
package z003_poo_eje012_personayedad;

import java.util.Scanner;
import model.Persona;
import service.ServicePersona;

public class Z003_POO_Eje012_personayEdad {    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicePersona sp = new ServicePersona();
        Persona p1 = sp.crearPersona();        
        sp.calcularEdad(p1);
        System.out.println("Registre la edad (en entero) de otra persona para compararla con la inicial: ");
        int edad = leer.nextInt();
        System.out.println("Es " + sp.menorQue(edad, p1) + " que la edad inicial es menor que la que está comparando.");
        sp.mostrarPersona(p1);
    }    
}
