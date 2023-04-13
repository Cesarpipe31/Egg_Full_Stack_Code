/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/

package z002_javint_eje005_dobletripleraizcuadrada;

import java.util.Scanner;


public class Z002_JavInt_Eje005_dobleTripleRaizCuadrada {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el número entero base de los cálculos:");
        int numero = leer.nextInt();
        System.out.println("El doble de " + numero + " es: " + duplicar(numero));
        System.out.println("El triple de " + numero + " es: " + triplicar(numero));
        System.out.println("La raiz cuadrada de " + numero + " es: " + calcularRaizCuadrada(numero));
    }
    
    public static int duplicar(int num){
        int resultadoDuplicado = num * 2;
        return resultadoDuplicado;
    }
    
    public static int triplicar(int num){
        int resultadoTriplicado = num * 3;
        return resultadoTriplicado;
    }
    
    public static float calcularRaizCuadrada(int num){
        float resultadoRaizCuadrada = (float) Math.sqrt(num);
        return resultadoRaizCuadrada;
    }
}
