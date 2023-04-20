/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados 
para imprimirlos en el main.
*/
package z002_javint_ejex015_dosenterosyoperacionesbasicas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Z002_JavInt_ejEx015_dosEnterosyOperacionesBasicas {
    
    /*
     
 System.out.println(df.format(number));
    */
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        int num1 = 0, num2 = 0;
        double  resultadoDiv = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el primer entero:");
        num1 = leer.nextInt();
        System.out.println("Escriba el segundo entero:");
        num2 = leer.nextInt();
        System.out.println("Los resultados de las operaciones básicas entre " + num1 + " y " + num2 + " son:");
        System.out.println("\nLa suma es: " + Sumar(num1, num2));
        System.out.println("\nLa resta es: " + Restar(num1, num2));
        System.out.println("\nLa multiplicación es: " + Multiplicar(num1, num2));        
        //resultadoDiv = Dividir(num1, num2);        
        System.out.println("\nLa división es: " + df.format(Dividir(num1, num2)));        
    }
    
    public static int Sumar(int num1, int num2){        
        return num1 + num2;
    }
    
    public static int Restar(int num1, int num2){        
        return num1 - num2;
    }
    
    public static int Multiplicar(int num1, int num2){        
        return num1 * num2;
    }
    
    public static double Dividir(int num1, int num2){        
        return num1 / num2;
    }
}
