/*
Elaborar un algoritmo en el cuál se ingrese un número 
entre 1 y 10 y se muestre su equivalente en romano.
*/
package z002_javint_ejex04_unoadiezromano;

public class Z002_JavInt_ejEx04_unoaDiezRomano {
   
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 9 + 1);
        switch (numero){
        case 1: System.out.println(numero + " es romano es: I ."); break;
        case 2: System.out.println(numero + " es romano es: II ."); break;
        case 3: System.out.println(numero + " es romano es: III ."); break;
        case 4: System.out.println(numero + " es romano es: IV ."); break;
        case 5: System.out.println(numero + " es romano es: V ."); break;
        case 6: System.out.println(numero + " es romano es: VI ."); break;
        case 7: System.out.println(numero + " es romano es: VII ."); break;
        case 8: System.out.println(numero + " es romano es: VIII ."); break;
        case 9: System.out.println(numero + " es romano es: IX ."); break;
        case 10: System.out.println(numero + " es romano es: X ."); break;
        default: System.out.println("No es un número entre 1 y 10"); break;
    }
    }    
}
