/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
*/

package z002_javint_eje001_sumadosnumeros;

import java.util.Scanner;


public class Z002_JavInt_Eje001_sumaDosNumeros {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el primer número entero: ");
        var num1 = leer.nextInt();
        System.out.println("Escriba el segundo número entero: ");
        var num2 = leer.nextInt();
        System.out.println("La suma de " + num1 + " más " + num2 + " es: " + (num1 + num2));
    }
    
}
