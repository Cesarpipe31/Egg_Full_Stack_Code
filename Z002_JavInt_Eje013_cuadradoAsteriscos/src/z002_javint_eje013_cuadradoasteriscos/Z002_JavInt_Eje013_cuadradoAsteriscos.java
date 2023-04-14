/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

            * * * *
            *     *            
            *     *
            * * * *

*/
package z002_javint_eje013_cuadradoasteriscos;

import java.util.Scanner;

public class Z002_JavInt_Eje013_cuadradoAsteriscos {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el número de asteriscos de cada lado del cuadrado");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) { 
                if (i == 0 || i == cant - 1 || j == 0 || j == cant - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();            
        }
    }
}
