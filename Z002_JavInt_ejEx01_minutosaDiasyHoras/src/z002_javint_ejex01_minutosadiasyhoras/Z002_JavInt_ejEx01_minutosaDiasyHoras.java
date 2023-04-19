/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 

Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
calcular su equivalente: 1 día, 2 horas.
 */
package z002_javint_ejex01_minutosadiasyhoras;

import java.util.Scanner;

public class Z002_JavInt_ejEx01_minutosaDiasyHoras {

    public static void main(String[] args) {
        int cantMinutos = 0, minutosEnDia = 1440, minutosEnHora = 60, dias = 0, horas = 0, minutos = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la cantidad de minutos a convertir en días y horas");
        cantMinutos = leer.nextInt();

        if (cantMinutos > minutosEnDia) {
            dias = (cantMinutos / minutosEnDia);
        }
        if ((cantMinutos - minutosEnDia * dias) > minutosEnHora) {
            horas = ((cantMinutos - minutosEnDia * dias) / minutosEnHora);
        }
        minutos = cantMinutos - minutosEnDia * dias - minutosEnHora * horas;

        System.out.println(cantMinutos + " minutos son: " + dias + " días , " + horas + " horas y " + minutos + " minutos." );
    }

}
