/*
Realice un programa que compruebe si una matriz dada es anti simétrica. 
Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
obtiene cambiando sus filas por columnas (o viceversa).
 */
package z002_javint_eje019_matrizantisimetrica;

/**
 *
 * @author cesar
 */
public class Z002_JavInt_Eje019_matrizAntisimetrica {

    public static void main(String[] args) {
        int cantidad = 3;
        int[][] matrizA = new int[cantidad][cantidad];
        int[][] matrizB = new int[cantidad][cantidad];
        int[][] matrizC = new int[cantidad][cantidad];

        crearMatAyMatBTranyMatC(matrizA, matrizB, matrizC, cantidad);
        System.out.println("\nLa matriz es:");
        System.out.println();
        imprimirMatriz(matrizA, cantidad);
        System.out.println("\nY la matriz transpuesta es:");
        System.out.println();
        imprimirMatriz(matrizB, cantidad);
        System.out.println("\nY la matriz transpuesta con signo cambiado es:");
        System.out.println();
        imprimirMatriz(matrizC, cantidad);
        esAntisimetrica(matrizA, matrizC, cantidad);

    }

    public static void crearMatAyMatBTranyMatC(int[][] matriz1, int[][] matriz2, int[][] matriz3, int cant) {
        int num;
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                matriz1[i][j] = (int) (Math.random() * 99 + 1);
                matriz2[j][i] = matriz1[i][j];                
                matriz3[j][i] = -(matriz1[i][j]);
            }
        }
    }

    public static void imprimirMatriz(int[][] vector, int cant) {
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                System.out.print("[ " + vector[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public static void esAntisimetrica(int[][] matriz1, int[][] matriz3, int cant) {
        int cantAnti = 0;
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                if (matriz1[i][j] != matriz3[i][j]) {
                    cantAnti++;
                }
            }
        }
        if (cantAnti > 0) {
            System.out.println("\n\nMatríz NO es Antisimétrica.");
        } else {
            System.out.println("\n\nMatriz antisimétrica.");
        }
    }

}
