/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
sobre dichos tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento 
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
package z002_javint_ejex05_trestipossocios;

import java.util.Scanner;

public class Z002_JavInt_ejEx05_tresTiposSocios {

    public static void main(String[] args) {
        int opcion;
        double valor;
        Scanner leer = new Scanner(System.in);                
        System.out.println("Escriba el valor del tratamiento para calcular su descuento (sin puntuación):");
        valor = leer.nextDouble();
        menu();
        opcion = leer.nextInt();
        calcular(opcion, valor);
        System.out.println("");
    }

    public static void menu() {
        System.out.println("   ***   M E N U   ***   ");
        System.out.println("");
        System.out.println("1  Socio Tipo A");
        System.out.println("2  Socio Tipo B");
        System.out.println("3  Socio Tipo C");
        System.out.println("4  SALIR");
        System.out.println("");
        System.out.println("Escoja una opción, entre 1 y 4.");
        System.out.println("");
    }

    public static void calcular(int opcion, double valor) {
        switch (opcion) {
            case 1:
                System.out.println(valor + " es el costo del tratamiento.");
                System.out.println("Con el descuento del 50% solo le costará: $" + (valor - valor * .5));
                break;
            case 2:
                System.out.println(valor + " es el costo del tratamiento.");
                System.out.println("Con el descuento del 25% solo le costará: $" + (valor - valor * .25));
                break;
            case 3:
                System.out.println(valor + " es el costo del tratamiento.");
                System.out.println("Con el descuento del 0% le costará: $" + (valor - valor * .0));
                break;
            case 4:
                System.out.println("Hasta pronto!!!");
                break;
            default:
                System.out.println("Opción nó válida");
                break;
        }
    }
}
