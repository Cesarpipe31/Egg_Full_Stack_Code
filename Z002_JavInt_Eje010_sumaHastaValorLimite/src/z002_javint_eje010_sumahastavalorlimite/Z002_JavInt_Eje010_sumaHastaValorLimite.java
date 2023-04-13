/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
*/
package z002_javint_eje010_sumahastavalorlimite;

import java.util.Scanner;

public class Z002_JavInt_Eje010_sumaHastaValorLimite {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número entero positivo que sirva como límite: ");
        int limite = leer.nextInt();
        int suma = 0;
        int numero;
        
        do{            
           System.out.println("Escriba un número entero positivo: ");
           numero = leer.nextInt();
           if(numero < 0){
               continue;
           }
           suma = suma + numero;
        } while (suma <= limite);
        System.out.println("El valor límite es " + limite + " y la suma de los enteros positivos digitados es: " + suma);
    }    
}
