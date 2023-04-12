
/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.

        a   e   i   o   u
        @   #   $   %   *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

Para realizar este ejemplo, deberás investigar el método concat de la clase String. Puedes encontrar 
estos ejemplos al final de la guía.
*/


package z002_javint_018.pkg01_cambiarvocalporcaracternuevo;

import java.util.Scanner;

public class Z002_JavInt_01801_cambiarVocalporCaracterNuevo {


    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase terminada con el signo punto (.)");
        String frase = leer.nextLine();           
        codificar(frase);        
    }
    
    
    public static String codificar(String frase){
        String fraseNueva = "";
        for (int i = 0; i < frase.length(); i++) {            
            char parteFrase = frase.charAt(i);            
            switch (parteFrase){
                case 'a': parteFrase = '@'; break;
                case 'e': parteFrase = '#'; break;
                case 'i': parteFrase = '$'; break;
                case 'o': parteFrase = '%'; break;
                case 'u': parteFrase = '*'; break;                                
            }            
            fraseNueva = fraseNueva.concat(parteFrase);            
        }
        return fraseNueva;
    }    
}
