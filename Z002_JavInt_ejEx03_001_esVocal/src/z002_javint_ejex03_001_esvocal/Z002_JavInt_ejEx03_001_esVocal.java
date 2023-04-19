/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package z002_javint_ejex03_001_esvocal;

import java.util.Scanner;

public class Z002_JavInt_ejEx03_001_esVocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba cualquier caracter, preferiblemente una letra: ");
        var caracter = leer.next();
        if (caracter.equals("a") || caracter.equals("A") || caracter.equals("e") || caracter.equals("E") || caracter.equals("i") || caracter.equals("I") || caracter.equals("o") || caracter.equals("O") || caracter.equals("u") || caracter.equals("U")){
        System.out.println(caracter + " es vocal.");            
        } else{
            System.out.println(caracter + " no es vocal.");
        }
        }    
}
