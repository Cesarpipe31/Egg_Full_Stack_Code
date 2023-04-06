//Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.

package z002_javint_008_usoscanner;

import java.util.Scanner;

public class Z002_JavInt_008_usoScanner {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el resultado de una variable booleana: ");
        boolean tipboolean = leer.nextBoolean();
        System.out.println("Escribe un número de tipo double: ");
        double tipdouble = leer.nextDouble();
        System.out.println("Escibre un caracter de tipo char: ");
        char tipchar = leer.next().charAt(0);
        
        System.out.println("Has registrado como booleano: " + tipboolean);
        System.out.println("Has registrado como double: " + tipdouble);
        System.out.println("Has registrado como char: " + tipchar);
    }
    
}
