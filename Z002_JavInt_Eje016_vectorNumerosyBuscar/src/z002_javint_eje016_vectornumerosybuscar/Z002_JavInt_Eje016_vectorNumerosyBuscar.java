/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el numero 
y si se encuentra repetido
 */
package z002_javint_eje016_vectornumerosybuscar;

public class Z002_JavInt_Eje016_vectorNumerosyBuscar {

    public static void main(String[] args) {
        int cantidad = (int) (Math.random() * 33 + 1);
        int[] vectorCompleto = new int[cantidad];
        int[] vectorBuscar = new int[1];
        System.out.println("El vector tendrá " + cantidad + " elementos.");

        for (int i = 0; i < cantidad; i++) {
            int numero = (int) (Math.random() * 99 + 1);
            vectorCompleto[i] = numero;
        }

        System.out.println("\n\nLos elementos del vector son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("[" + vectorCompleto[i] + "]");
        }

        System.out.println("\n\nEl número a buscar es: (No se solicitó al Usuario, se ramdonizó) ");
        for (int i = 0; i < 1; i++) {
            int numeroBuscar = (int) (Math.random() * 99 + 1);
            vectorBuscar[i] = numeroBuscar;
            System.out.println(vectorBuscar[i]);
        }

        int cant = 0;
        for (int i = 0; i < cantidad; i++) {
            if (vectorCompleto[i] == vectorBuscar[0]) {
                cant++;
                System.out.println("\nEl número buscado se encuentra en la posición " + "[ " + (i + 1) + " ].");
            }
        }

        if (cant == 0) {
            System.out.println("\n\nEl número buscado no se encuentra en ninguna posición del vector.");
        }
    }
}
