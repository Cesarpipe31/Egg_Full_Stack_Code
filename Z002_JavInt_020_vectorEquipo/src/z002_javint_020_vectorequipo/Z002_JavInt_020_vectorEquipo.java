/*
ESTE CODIGO REALIZA EL EJERCICIO 13 Y 14 DE MANERA SIMULTANEA.

EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo

*/

package z002_javint_020_vectorequipo;

import java.util.Scanner;

public class Z002_JavInt_020_vectorEquipo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Escriba el nombre de la persona del equipo número " + (i+1));
            equipo[i] = leer.nextLine();            
        }
        imprimirVector(equipo);
    }

    public static void imprimirVector(String[] equipo){  //TAMBIEN  FUNCIONA ASÍ: " (String equipo[]) "{
        System.out.println("Las personas del equipo son: ");
        for (int i = 0; i < 5; i++) {            
            System.out.print(" [ " + equipo[i] + " ] ");            
        }
        System.out.println("");
    }
}
