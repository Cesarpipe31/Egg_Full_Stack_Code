/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package z002_javint_eje003_fraseenmayusculayminuscula;

import java.util.Scanner;


public class Z002_JavInt_Eje003_fraseEnMayusculayMinuscula {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase, utilizando mayúsculas y minúsculas.");
        var frase = leer.nextLine();
        System.out.println("La frase en mayúscula es: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("La frase en minúscula es: " + frase.toLowerCase());
        System.out.println("La frase inicial es: " + frase);
    }    
}
