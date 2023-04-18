/*

Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).

    Matriz A            Matriz B (Transpuesta)
    1   0   4           1   0   6
    0   5   0           0   5   0
    6   0   -9          4   0   -9

*/
package z002_javint_eje018_matrizysutranspuesta;

public class Z002_JavInt_Eje018_matrizySuTranspuesta {

    public static void main(String[] args) {
        int cantidad = 5;
        int[][] matrizA = new int[cantidad][cantidad];
        int[][] matrizB = new int[cantidad][cantidad];
        
        crearMatrizAyMatrizBTran(matrizA, matrizB, cantidad);
        System.out.println("\nLa matriz es:");
        System.out.println();
        imprimirVector(matrizA, cantidad);
        System.out.println("\nY la matriz transpuesta es:");
        System.out.println();
        imprimirVector(matrizB, cantidad);        
        
    }
    
    public static void crearMatrizAyMatrizBTran (int[][] matriz1,int[][] matriz2, int cant){
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                matriz1[i][j] = (int) (Math.random() * 99);
                matriz2[j][i] = matriz1[i][j];
            }            
        }
    }
    
    public static void imprimirVector (int[][] matriz, int cant){
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println();
        }
    }
    
}
