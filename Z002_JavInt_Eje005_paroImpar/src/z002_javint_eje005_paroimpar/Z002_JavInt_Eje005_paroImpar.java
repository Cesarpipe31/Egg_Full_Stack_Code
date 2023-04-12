/*
Crear un programa que dado un numero determine si es par o impar.
 */
package z002_javint_eje005_paroimpar;

import java.util.Scanner;

public class Z002_JavInt_Eje005_paroImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el número entero a evaluar:");
        var numero = leer.nextInt();
        if(parImpar(numero)){
            System.out.println("El número " + numero + " es PAR");}
        else {
            System.out.println("El número " + numero + " es IMPAR");            
        }
    }

    public static boolean parImpar(int num) {
        boolean parimp = false;
        if (num % 2 == 0) {
            parimp = true;
        } else {
            parimp = false;
        }
        return parimp;
    }
}
