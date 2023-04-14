/*
Vectores y Matrices en Java

Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:

* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package z002_javint_eje014_conversioneuroaotramoneda;

import java.util.Scanner;

public class Z002_JavInt_Eje014_conversionEuroaOtraMoneda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la cantidad de euros a convertir: ");
        float cantEuros = leer.nextFloat();
        System.out.println("A qué moneda desea convertir: (libras, dolares, yenes) ");
        String tipoMoneda = leer.next();
        //new java.util.Scanner(System.in).nextLine();
        Convertir(cantEuros, tipoMoneda);
    }

    public static void Convertir(float euros, String moneda) {
        switch (moneda) {
            case "libras":
                System.out.println(euros + " euros son " + (0.86 * euros) + " libras");
                break;
            case "dolares":
                System.out.println(euros + " euros son " + (1.28611 * euros) + " dólares");
                break;
            case "yenes":
                System.out.println(euros + " euros son " + (129.852 * euros) + " yenes");
                break;
            default:
                System.out.println("Opción no válida");                
        }
    }
}
