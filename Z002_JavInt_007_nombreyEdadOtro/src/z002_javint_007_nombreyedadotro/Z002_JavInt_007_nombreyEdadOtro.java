// Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
// OTRO

package z002_javint_007_nombreyedadotro;

import java.util.Scanner;

public class Z002_JavInt_007_nombreyEdadOtro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre ");
        var nombre = leer.nextLine();
        System.out.println("Escribe tu edad ");
        var edad = leer.nextLine();
        
        System.out.println("Tu nombre es: " + nombre + " y tu edad es " + edad);               
        
    }
    
}
