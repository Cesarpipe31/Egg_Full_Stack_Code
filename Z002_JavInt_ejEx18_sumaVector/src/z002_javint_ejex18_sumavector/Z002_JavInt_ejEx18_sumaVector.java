/*
Realizar un algoritmo que calcule la suma de todos los elementos 
de un vector de tamaño N, con los valores ingresados por el usuario.
*/
package z002_javint_ejex18_sumavector;

public class Z002_JavInt_ejEx18_sumaVector {

    public static void main(String[] args) {
        int cant = 0, suma = 0;        
        cant = (int) (Math.random()* 19 + 1);
        int[] vector = new int [cant];
        System.out.println("\nEl vector es:");
        for (int i = 0; i < cant; i++) {
            vector[i] = (int) (Math.random() * 99 + 1);
            suma += vector[i];
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println("\n\nLa suma del vector es: " + suma);
    }
}
