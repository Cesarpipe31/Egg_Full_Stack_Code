/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package z002_javint_013_notaentreoy10nuevo;

import java.util.Scanner;

public class Z002_JavInt_013_notaEntreOy10Nuevo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la nota lograda");
        float nota = leer.nextFloat();
        do {
            System.out.println("Escriba NUEVAMENTE la nota lograda, ya que la anterior no está dentro del rango de 0 a 10");
            nota = leer.nextFloat();
        } while (nota < 0 || nota > 10); 
        System.out.println("La nota registrada: " + nota + " está dentro del rango de 0 a 10.");
    }
}
