/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra 
función o procedimiento que imprima el vector.
*/

package z002_javint_ejex20_vectorrellenareimprimir;

public class Z002_JavInt_ejEx20_vectorRellenareImprimir {
   
    public static void main(String[] args) {
        int cant = (int)(Math.random() * 9 +1);
        int[] vector = new int [cant];
        System.out.println("El vector tendrá " + cant + " elementos.");        
        rellenar(vector, cant);
        System.out.println("\n");
        imprimir(vector, cant);
    }
    
    public static void rellenar(int[] vector, int cant){
        for (int i = 0; i < cant; i++) {
            vector[i] = (int) (Math.random() * 99 + 1);            
        }
    }
    
    public static void imprimir(int[] vector, int cant){
        for (int i = 0; i < cant; i++) {
            System.out.print("[ " + vector[i] + "]");            
        }
        System.out.println("");
    }    
}
