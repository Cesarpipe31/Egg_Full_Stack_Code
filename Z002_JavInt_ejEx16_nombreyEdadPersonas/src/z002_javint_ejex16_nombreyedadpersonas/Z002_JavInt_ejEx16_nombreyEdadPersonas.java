/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package z002_javint_ejex16_nombreyedadpersonas;

import java.util.Scanner;

public class Z002_JavInt_ejEx16_nombreyEdadPersonas {

    public static void main(String[] args) {
        Scanner leerString = new Scanner(System.in);
        Scanner leerNumero = new Scanner(System.in);
        String nombre = "";
        String sN = "";
        int edad = 0;
        boolean continuar = false;

        do {
            System.out.println("Escriba el nombre:");
            nombre = leerString.nextLine();
            System.out.println("Escriba la edad de " + nombre);
            edad = leerNumero.nextInt();
            if (edad > 17) {
                System.out.println(nombre + " con " + edad + " años es mayor de edad");
            } else {
                System.out.println(nombre + " con " + edad + " años es menor de edad");
            }
            System.out.println("Desea continuar (s/n): ");
            sN = leerString.nextLine();
            if (sN.equals("s")) {
                continuar = true;
            } else if (sN.equals("n")) {
                continuar = false;
                System.out.println("Hasta pronto!!!");                
            }
        } while (continuar);
    }
}
