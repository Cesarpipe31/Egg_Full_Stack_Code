/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo
y el promedio de n números (n>0). El valor de n se solicitará al principio 
del programa y los números serán introducidos por el usuario. Realice dos 
versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
*/
package z002_javint_ejex07_001_minimomaximopromediodowhile;

public class Z002_JavInt_ejEx07_001_minimoMaximoPromedioDoWhile {
    
    public static void main(String[] args) {
      int cant = 7, contar = 0, vrMinimo = 10000, vrMaximo = 0, suma = 0;
      double promedio = 0;
      int[] vector = new int [cant];
      do{          
          vector[contar] = (int)(Math.random() * 99 + 2);          
          if(vector[contar] < vrMinimo){
              vrMinimo = vector[contar];              
          }
          if(vector[contar] > vrMaximo){
              vrMaximo = vector[contar];              
          }
          suma += vector[contar];
          System.out.print("[ " + vector[contar] + " ]");
          contar++;
          promedio = suma / contar;          
      }while (contar < cant);        
        System.out.println("\n\nHay " + contar + " números cuyo promedio es " + promedio + ". Valor máximo: " + vrMaximo + ". Valor mínimo: " + vrMinimo + ".");      
    }    
}
