/*

SE REALIZA EL MISMO EJERCICIO PERO CON 7 VARIABLES.

Declarar cuatro variables de tipo entero A, B, C y D y asignarle un 
valor diferente a cada una. A continuación, realizar las instrucciones 
necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los 
valores finales de cada variable. Utilizar sólo una variable auxiliar.

    a   -->     c
    b   -->     g
    c   -->     f
    d   -->     b
    e   -->     a
    f   -->     e
    g   -->     d
*/
package z002_javint_ejex02_001_sietevariablesintercambiar;


public class Z002_JavInt_ejEx02_001_sieteVariablesIntercambiar {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, aux = 0;
        System.out.println("Los datos iniciales de las variables son:");
        System.out.println(" a es " + a + " y tomará el valor de c, es decir " + c);
        System.out.println(" b es " + b + " y tomará el valor de g, es decir " + g);
        System.out.println(" c es " + c + " y tomará el valor de f, es decir " + f);
        System.out.println(" d es " + d + " y tomará el valor de b, es decir " + b);
        System.out.println(" d es " + e + " y tomará el valor de a, es decir " + a);
        System.out.println(" d es " + f + " y tomará el valor de e, es decir " + e);
        System.out.println(" d es " + g + " y tomará el valor de d, es decir " + d);
        
        aux = a;
        a = c;
        c = e;
        e = aux;
        aux = f;
        f = c;
        c = aux;
        aux = b;
        b = g;
        g = d;
        d = aux;
        
        
        System.out.println("\nLos datos finales de las variables son:");
        System.out.println(" a es " + a);
        System.out.println(" b es " + b);
        System.out.println(" c es " + c);
        System.out.println(" d es " + d);
        System.out.println(" e es " + e);
        System.out.println(" f es " + f);
        System.out.println(" g es " + g);
    }
    
}

