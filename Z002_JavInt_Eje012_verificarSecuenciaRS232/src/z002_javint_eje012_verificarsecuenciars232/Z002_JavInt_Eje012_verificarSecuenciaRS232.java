/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser 
de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” 
marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el 
formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas 
recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de 
Java Substring(), Length(), equals().
*/

package z002_javint_eje012_verificarsecuenciars232;

import java.util.Scanner;

public class Z002_JavInt_Eje012_verificarSecuenciaRS232 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        String cadena, FDE = "&&&&&";
        int lectCorrecta = 0, lectIncorrecta = 0, lectDiferente = 0;
        do{
            System.out.println("RS232.  Escriba una cadena de 5 caráctares. Para finalizar escriba &&&&&");
            cadena = leer.nextLine();
            if (cadena.length() != 5){
                lectDiferente++;
                continue;                
            }
            if(cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
                lectCorrecta++;
            }else{
                if(!cadena.equals(FDE)){
                lectIncorrecta++;}
            }
        }while (!cadena.equals(FDE));
        System.out.println(lectCorrecta + " es la cantidad de cadenas correctas en formato X???O");
        System.out.println(lectIncorrecta + " es la cantidad de cadenas incorrectas (No se cuenta el caracter de salida &&&&&)"); 
        System.out.println(lectDiferente + " es la cantidad de cadenas que no poseen 5 caracteres"); 
    }   
}
