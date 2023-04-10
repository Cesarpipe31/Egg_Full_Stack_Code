/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá 
calcular y mostrar el resultado de la suma de los números leídos, pero si el número 
es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
//20 números.  num == 0 salir de bucle y "Se capturó el número cero". num < 0 no debe sumarse. Usar break.
package z002_javint_014_sumaveintenumerospositivos;

import java.util.Scanner;

public class Z002_JavInt_014_sumaVeinteNumerosPositivos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("Escriba el número a sumar: ");
        //int nota = leer.nextInt();
        int nota, sumaNumeros, cant;
        sumaNumeros = 0;
        cant = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Escriba el número a sumar: ");
            nota = leer.nextInt();
            if (nota == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            if (nota > 0) {
                sumaNumeros = sumaNumeros + nota;
                cant++;
            }                     
        }
        System.out.println("Ha escrito " + cant + " números mayores que 0 cuya suma es: " + sumaNumeros + ".");
    }
}
