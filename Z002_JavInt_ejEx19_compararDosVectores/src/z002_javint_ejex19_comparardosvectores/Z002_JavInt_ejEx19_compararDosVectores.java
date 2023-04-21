/*
Escriba un programa que averigüe si dos vectores de N enteros 
son iguales (la comparación deberá detenerse en cuanto se 
detecte alguna diferencia entre los elementos).
*/
package z002_javint_ejex19_comparardosvectores;


public class Z002_JavInt_ejEx19_compararDosVectores {
  
    public static void main(String[] args) {
        int cant = 10, contar = 0;                
        int[] vector1 = new int [cant];
        int[] vector2 = new int [cant];
        //System.out.println("\nEl vector es:");
        for (int i = 0; i < cant; i++) {
            vector1[i] = (int) (Math.random() * 9 + 1 );
            vector2[i] = (int) (Math.random() * 9 + 1 );
            if (vector1[i] == vector2[i]){
                contar++;
                continue;
            }else{
                System.out.println("Hemos encontrado un elemento diferente al comparar los dos vectores, en la posición " + (i+1) + " . V1 tiene " + vector1[i] + " y V2 tiene " + vector2[i]);
                break;
            }
        }
        
        if (contar == cant){
            System.out.println("Vector1 y Vector2 son exactamente iguales");
        }
        
        System.out.println("\nEl vector 1 es:");        
        for (int i = 0; i < cant; i++) {
            System.out.print("[ " + vector1[i] + " ]");            
        }
        System.out.println("\n\nEl vector 2 es:");        
        for (int i = 0; i < cant; i++) {
            System.out.print("[ " + vector2[i] + " ]");            
        }
        System.out.println();
    }
}
