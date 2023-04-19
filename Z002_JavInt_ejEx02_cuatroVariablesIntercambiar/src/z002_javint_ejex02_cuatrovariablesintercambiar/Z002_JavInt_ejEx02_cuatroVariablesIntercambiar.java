/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un 
valor diferente a cada una. A continuación, realizar las instrucciones 
necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los 
valores finales de cada variable. Utilizar sólo una variable auxiliar.

    a   -->     d
    b   -->     c
    c   -->     a
    d   -->     b

*/
package z002_javint_ejex02_cuatrovariablesintercambiar;


public class Z002_JavInt_ejEx02_cuatroVariablesIntercambiar {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, aux = 0;
        System.out.println("Los datos iniciales de las variables son:");
        System.out.println(" a es " + a + " y tomará el valor de d, es decir " + d);
        System.out.println(" b es " + b + " y tomará el valor de c, es decir " + c);
        System.out.println(" c es " + c + " y tomará el valor de a, es decir " + a);
        System.out.println(" d es " + d + " y tomará el valor de b, es decir " + b);
        
        aux = a;
        a = d;
        d = c;
        c = aux;
        aux = b;       
        b = d;        
        d = aux;
        
        System.out.println("\nLos datos finales de las variables son:");
        System.out.println(" a es " + a);
        System.out.println(" b es " + b);
        System.out.println(" c es " + c);
        System.out.println(" d es " + d);
    }
    
}


        
