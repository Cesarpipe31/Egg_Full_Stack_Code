/*
Escribir un programa que lea un número entero y devuelva el número 
de dígitos que componen ese número. Por ejemplo, si introducimos 
el número 12345, el programa deberá devolver 5. Calcular la cantidad 
de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.
*/

/*
12345

12345 / 10 = 1234   1
1234 / 10 = 123   2
123 / 10 = 12   3
12 / 10 = 1   4
1 / 10 = 0   5

*/

package z002_javint_ejex11_cantidaddigitosdivision;

import java.util.Scanner;

public class Z002_JavInt_ejEx11_cantidadDigitosDivision {

    public static void main(String[] args) {
        int numIni = 0, cant = 0, num = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el número entero al que se le determinará la cantidad de dígitos:");
        numIni = leer.nextInt();
        num = numIni;
        
        do{
            num = num / 10;
            cant ++;            
        }while (num > 0);
        
        System.out.println("El número " + numIni + " tiene " + cant + " dígitos.");
    }    
}
