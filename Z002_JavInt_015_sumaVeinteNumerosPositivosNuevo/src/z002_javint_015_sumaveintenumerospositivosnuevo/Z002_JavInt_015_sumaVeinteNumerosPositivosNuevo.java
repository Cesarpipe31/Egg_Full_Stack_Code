/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá 
calcular y mostrar el resultado de la suma de los números leídos, pero si el número 
es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
//20 números.  num == 0 salir de bucle y "Se capturó el número cero". num < 0 no debe sumarse. Usar break.

package z002_javint_015_sumaveintenumerospositivosnuevo;

import java.util.Scanner;

public class Z002_JavInt_015_sumaVeinteNumerosPositivosNuevo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        int nota, sumaNumeros, cant, cantSuma;
        sumaNumeros = 0;
        cant = 0;
        cantSuma = 0;
        do
        {
            cant++;
            System.out.println("Escriba el número entero a sumar: ");
            nota = leer.nextInt();
            if (nota == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            if (nota > 0) {
                sumaNumeros = sumaNumeros + nota;                
                cantSuma++;
            }                                 
        }while (cant < 20);                      
        
        System.out.println("Ha escrito " + cantSuma + " números mayores que 0 cuya suma es: " + sumaNumeros + ".");
    }
    
}
