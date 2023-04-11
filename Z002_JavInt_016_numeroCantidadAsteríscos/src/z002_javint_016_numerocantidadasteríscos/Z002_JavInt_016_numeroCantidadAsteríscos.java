/*
EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package z002_javint_016_numerocantidadasteríscos;

import java.util.Scanner;

public class Z002_JavInt_016_numeroCantidadAsteríscos {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
                
        int cant = 0;

        do {
            System.out.println("Escriba un número entre 1 y 20.");
            num = leer.nextInt();
            while (num < 0 || num > 20) {
                System.out.println("Escriba NUEVAMENTE un número entre 1 y 20.");
                num = leer.nextInt();
            } ;
            if (num >= 0 || num <= 20) {
                System.out.print(num);
                for (int i = 0; i < num; i++) {
                    System.out.print("*");                    
                }
            }
            System.out.println("");
            cant++;
        } while (cant < 4);
        System.out.println("Ya has escrito los 4 números enteros entre 0 y 20, imprimiendo dicho número y su cantidad en asteríscos.");
    }
}
