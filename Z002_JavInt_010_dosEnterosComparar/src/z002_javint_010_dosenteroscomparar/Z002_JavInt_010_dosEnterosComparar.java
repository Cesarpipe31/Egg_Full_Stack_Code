/*  Implementar un programa que le pida dos números enteros
a usuario y determine si ambos o alguno de ellos es mayor a 25
*/

package z002_javint_010_dosenteroscomparar;

import java.util.Scanner;

public class Z002_JavInt_010_dosEnterosComparar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int number1 = leer.nextInt();
        System.out.println("Escribe un nuevo número: ");
        int number2 = leer.nextInt();
        int bandera = 25;
        
        if ((number1 > 25) || (number2 > 25)){
            System.out.println("El número " + number1 + " y/o el número " + number2 + " es mayor a 25." );}
        else{
            System.out.println("Ni " + number1 + " ni " + number2 + " son mayores a 25");            
        }
    }    
}
