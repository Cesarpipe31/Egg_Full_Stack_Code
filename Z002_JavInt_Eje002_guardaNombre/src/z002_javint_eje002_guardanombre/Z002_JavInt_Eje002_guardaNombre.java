/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/
package z002_javint_eje002_guardanombre;

import java.util.Scanner;


public class Z002_JavInt_Eje002_guardaNombre {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre completo");
        String nombreCompleto = leer.nextLine();
        System.out.println("Su nombre es: " + nombreCompleto);
    }    
}
