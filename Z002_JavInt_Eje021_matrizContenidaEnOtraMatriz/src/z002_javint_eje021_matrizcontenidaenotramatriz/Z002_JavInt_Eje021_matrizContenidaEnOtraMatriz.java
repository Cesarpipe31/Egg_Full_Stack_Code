/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 
y la matriz P de 3x3, se solicita escribir un programa en el cual se 
compruebe si la matriz P está contenida dentro de la matriz M. Para ello 
se debe verificar si entre todas las submatrices de 3x3 que se pueden 
formar en la matriz M, desplazándose por filas o columnas, existe al menos 
una que coincida con la matriz P. En ese caso, el programa debe indicar 
la fila y la columna de la matriz M en la cual empieza el primer elemento 
de la submatriz P.
Ejemplo:
Como podemos observar nuestra submatriz P se encuentra en la matriz M 
en los índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.

    Matriz de 10 x 10                               Matriz de 3 x3 

    1   26  36  47  5   6   72  81  95  10          36  5   67 
    11  12  13  21  41  22  67  20  10  61          89  90  75
    56  78  87  90  09  90  17  12  87  67          14  22  26
    41  87  24  56  97  74  87  42  64  35
    32  76  79  1   36  5   67  96  12  11
    99  13  54  88  89  90  75  12  41  76
    67  78  87  45  14  22  26  42  56  78
    98  45  34  23  32  56  74  16  19  18
    24  67  97  46  87  13  67  89  93  24  
    21  68  78  98  90  67  12  41  65  12

*/
package z002_javint_eje021_matrizcontenidaenotramatriz;


public class Z002_JavInt_Eje021_matrizContenidaEnOtraMatriz {


    public static void main(String[] args) {
        int canMatA = 10, canMatB = 3;
        int[][] matrizA = new int [canMatA][canMatA];
        int[][] matrizB = new int [canMatB][canMatB];
        crearMatriz(matrizA, canMatA);
        crearMatriz(matrizB, canMatB);
        System.out.println("\n *** M a t r i z   A ***");
        imprimirMatriz(matrizA, canMatA);
        System.out.println("\n *** M a t r i z   B ***");
        imprimirMatriz(matrizB, canMatB);
    }
    
    public static void crearMatriz(int[][] matriz, int cant){
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }            
        }
    }
    
    public static void imprimirMatriz(int[][] matriz, int cant){
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println();
        }
    }
    
    public static void compararMatriz(int[][] matrizA, int[][] matrizB, int cantA, int cantB){                
            for (int i = 0; i < cantA; i++) {
                for (int j = 0; j < cantA; j++) {                    
                    while(i < cantA - cantB + 1 || j < cantA - cantB + 1){
                        
                    }
                        
                    
                    for (int k = 0; k < cantB; k++) {
                        for (int l = 0; l < cantB; l++) {
                            
                        }
                        
                    }
                    
                }                
            }
        }
    }
    
}
