/*
Escriba un programa que lea números enteros. Si el número es múltiplo 
de cinco debe detener la lectura y mostrar la cantidad de números 
leídos, la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben 
sumarse. Nota: recordar el uso de la sentencia break.
*/
package z002_javint_ejex08_numerosrompemultiplo5;

public class Z002_JavInt_ejEx08_numerosRompeMultiplo5 {
    
    public static void main(String[] args) {
        int cant = 30, num = 0, contar = 0, numPares = 0, numImpares = 0;
        int[] vector = new int [cant];
        
        do{
            num = (int) (Math.random() * 99 + 1 );
            //System.out.println(num);
            vector[contar] = num;
            if (num % 5 == 0){
                break;
            }            
            if (num % 2 == 0){
                numPares++;
            }else {
                numImpares++;
            }            
            System.out.print("[ " + vector[contar] + " ]");            
            contar++;
        }while (contar < cant);     
        
        System.out.println("\n\n Se han registado " + contar + " números enteros.  Existen " + numPares + " pares y " + numImpares + " impares.");        
        System.out.println("\n El número múltiplo de 5 que rompe el código es: " + num);
    }    
}
