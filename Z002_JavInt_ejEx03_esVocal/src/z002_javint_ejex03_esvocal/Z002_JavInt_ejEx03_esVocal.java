/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package z002_javint_ejex03_esvocal;

import java.util.Scanner;

public class Z002_JavInt_ejEx03_esVocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba cualquier caracter, preferiblemente una letra: ");
        char caracter = leer.next().charAt(0);
        switch (caracter) {
            case 'a':
                System.out.println(caracter + " es vocal.");
                break;
            case 'e':
                System.out.println(caracter + " es vocal.");
                break;
            case 'i':
                System.out.println(caracter + " es vocal.");
                break;
            case 'o':
                System.out.println(caracter + " es vocal.");
                break;
            case 'u':
                System.out.println(caracter + " es vocal.");
                break;
            default:
                System.out.println("No es vocal.");
        }
    }
}
