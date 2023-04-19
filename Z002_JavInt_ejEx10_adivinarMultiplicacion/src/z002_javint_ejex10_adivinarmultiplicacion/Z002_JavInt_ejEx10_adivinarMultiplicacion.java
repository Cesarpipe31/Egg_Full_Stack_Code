/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar 
al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta 
se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este 
ejercicio investigue como utilizar la función Math.random() de Java.
*/
package z002_javint_ejex10_adivinarmultiplicacion;

import java.util.Scanner;

public class Z002_JavInt_ejEx10_adivinarMultiplicacion {

    public static void main(String[] args) {
       int num1 = (int) (Math.random() * 9 + 1);
       int num2 = (int) (Math.random() * 9 + 1);
       int[] vector = new int [100];
       Scanner leer = new Scanner(System.in);
       System.out.println("Cuál cree que sea el resultado de la multiplicación entre dos enteros entre 0 y 10.");
       int resultado = leer.nextInt();
       int i = 0;
       do{
            System.out.println("Incorrecto!!!. Cuál cree que sea el resultado de la multiplicación entre dos enteros entre 0 y 10.");
            resultado = leer.nextInt();
            vector[i] = resultado;            
       }while (num1*num2 != resultado);
        System.out.println("\n\n Eureka!!! Has adivinado el resultado de la multiplicación de " + num1 + " por " + num2 + " que es: " + resultado + ".");               
    }
}
