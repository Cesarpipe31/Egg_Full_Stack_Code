/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
 */
package z002_javint_eje015_primero100enteros;

public class Z002_JavInt_Eje015_primero100Enteros {

    public static void main(String[] args) {
        int cantidad = 100;
        int[] vector100 = new int[cantidad];
        rellenarVector(cantidad, vector100);
        imprimirVector(cantidad, vector100);
    }



public static void rellenarVector(int cantidad, int[] vector){    
        for (int i = 0; i < cantidad; i++) {
            vector[i] = i+1;
        }    
}

public static void imprimirVector(int cantidad, int[] vector){
    System.out.println("Se imprimirá el vector de manera descendente.");
    for (int i = 99; i >= 0; i--) {            
            System.out.println(" [ " + vector[i] + " ] ");            
        }        
    
}

}
