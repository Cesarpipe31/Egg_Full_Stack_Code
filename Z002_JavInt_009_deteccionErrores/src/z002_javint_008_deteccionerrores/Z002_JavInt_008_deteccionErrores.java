/*
DETECCIÓN DE ERRORES
Arreglar la siguiente porción de codigo.
public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();
System.out.println("Ingresa tu nombre");
int edad = leer.next();
}
}
*/
package z002_javint_008_deteccionerrores;

import java.util.Scanner;

public class Z002_JavInt_008_deteccionErrores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  // faltó System.in dentro de parentesis e importar java.util.Scanner
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();  // String reemplazar por int y nombre por edad
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next(); // int reemplazar por String y edad por nombre y next por nextLine
    }    
}
