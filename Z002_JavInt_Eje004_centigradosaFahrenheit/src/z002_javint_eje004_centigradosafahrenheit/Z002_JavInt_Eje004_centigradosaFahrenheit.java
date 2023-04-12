/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package z002_javint_eje004_centigradosafahrenheit;

import java.util.Scanner;

public class Z002_JavInt_Eje004_centigradosaFahrenheit {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuál es la temperatura actual en grados centígrados:");
        float gradosCelsius = leer.nextFloat();
        float gradosFahrenheit = 32 + (9 * gradosCelsius / 5 );
        System.out.println(gradosCelsius + " grados centígrados son " + gradosFahrenheit + " grados fahrenheit.");
    }    
}
