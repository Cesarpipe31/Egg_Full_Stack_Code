/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.
*/
package z002_javint_eje006_eureka;

import java.util.Scanner;

public class Z002_JavInt_Eje006_Eureka {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la frase: ");
        String frase = leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
