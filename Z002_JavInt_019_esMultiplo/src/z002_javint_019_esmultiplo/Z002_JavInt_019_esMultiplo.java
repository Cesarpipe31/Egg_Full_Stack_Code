/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer numero múltiplo del segundo y e imprima si el primer numero 
es múltiplo del segundo, sino informe que no lo son.
 */
package z002_javint_019_esmultiplo;

import java.util.Scanner;

public class Z002_JavInt_019_esMultiplo {

    public static void main(String[] args) {
        int nume1, nume2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el primer numero entero:");
        nume1 = leer.nextInt();
        System.out.println("Escriba el segundo numero entero:");
        nume2 = leer.nextInt();
        esMultiplo(nume1, nume2);

    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es múltiplo de " + num2);
        }
    }
}


