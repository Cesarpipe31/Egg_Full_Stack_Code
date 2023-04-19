////
/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package z002_javint_eje020_cuadromatrizmagica;

import java.util.Scanner;

public class Z002_Javint_Eje020_cuadroMatrizMagica {

    public static void main(String[] args) {
        int cant = 3, cant1 = 8;
        int[][] matriz = new int[cant][cant];
        int[] vectorSumaFila = new int[cant];
        int[] vectorSumaColumna = new int[cant];
        int[] vectorSumas = new int[cant1];
        int sumaDiagonalPrincipal = 0, sumaDiagonalSecundaria = 0;
        crearMatriz(matriz);
        System.out.println("***   M A T R I Z   ***");
        imprimirMatriz(matriz);
        sumarMatrizFila(matriz, vectorSumaFila);
        sumarMatrizColumna(matriz, vectorSumaColumna);
        System.out.println("\n\n***   Vector con suma de Filas   ***");
        imprimirVector(vectorSumaFila, cant);
        System.out.println("\n\n***   Vector con suma de Columnas   ***");
        imprimirVector(vectorSumaColumna, cant);        
        sumaDiagonalPrincipal = sumarDiagonalPrincipal(matriz, sumaDiagonalPrincipal);
        System.out.println("\n\nRevisar " + sumaDiagonalPrincipal);
        sumaDiagonalSecundaria = sumarDiagonalSecundaria(matriz, sumaDiagonalSecundaria);
        System.out.println("\n\nRevisar1 " + sumaDiagonalSecundaria);
        vectorSumas(vectorSumas, vectorSumaFila, vectorSumaColumna, sumaDiagonalPrincipal, sumaDiagonalSecundaria);
        System.out.println("\n\n***   Vector con suma de Filas, Columnas y Diagonales   ***");
        imprimirVector(vectorSumas, cant1);
        analizarSumas(vectorSumas, cant1);
    }

    public static void crearMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Escriba un número entre 1 y el 9; posición [ " + i + " ] [ " + j + " ]");
                int num = leer.nextInt();
                if (num < 1 || num > 9) {
                    //i--;
                    j--;
                    continue;
                }
                if (num >= 1 || num <= 9) {
                    matriz[i][j] = num;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public static void sumarMatrizFila(int[][] matriz, int[] vectorFila) {
        int sumaFila = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            }
            vectorFila[i] = sumaFila;
            sumaFila = 0;
        }
    }

    public static void sumarMatrizColumna(int[][] matriz, int[] vectorColumna) {
        int sumaColumna = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            }
            vectorColumna[j] = sumaColumna;
            sumaColumna = 0;
        }
    }

    public static int sumarDiagonalPrincipal(int[][] matriz, int sumaDiagonalPrincipal) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        return sumaDiagonalPrincipal;
    }

    public static int sumarDiagonalSecundaria(int[][] matriz, int sumaDiagonalSecundaria) {
        int j = 3 - 1;
        for (int i = 0; i < 3; i++) {            
                sumaDiagonalSecundaria += matriz[i][j];    
                j--;
        }
        return sumaDiagonalSecundaria;
    }

    public static void imprimirVector(int[] vector, int cant) {
        System.out.println();
        for (int i = 0; i < cant; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
    }
    
    public static void vectorSumas(int[] vectorSumas, int[] vectorFilas, int[] vectorColumnas, int sumDiaPri, int sumDiaSec){
        
        int j = 0;
        for (int i = 0; i < 3; i++) {
            vectorSumas[j] = vectorFilas[i];
            j++;            
        }                
        
        for (int m = 0; m < 3; m++) {
            vectorSumas[j] = vectorColumnas[m];
            j++;            
        }               
        
        vectorSumas[j] = sumDiaPri;
        j++;
                
        vectorSumas[j] = sumDiaSec;
        
    }
    
    public static void analizarSumas(int[] vectorSumas, int cant){
        int bandera = vectorSumas[0], cuenta = 0;        
        for (int i = 0; i < cant; i++) {
            if (bandera == vectorSumas[i]){            
            cuenta++;            
        }
        }
        if (cuenta == 8){
            System.out.println("\n\nMatriz es mágica");
        }else {
            System.out.println("\n\nMatriz no es mágica");
        }
    }
}