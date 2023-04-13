/*
Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:

                MENU
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el 
resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package z002_javint_eje011_operacionesbasicas;

import java.util.Scanner;

public class Z002_Javint_Eje011_operacionesBasicas {

    public static void main(String[] args) {             
        
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Escriba el primer número entero: ");
        int numero1 = leer.nextInt();
        System.out.println("Escriba el segundo número entero: ");
        int numero2 = leer.nextInt();
        
        int opcion = leer.nextInt();
        
        do{
            menu();
        } while ( opcion <=5);
        
        switchMenu(opcion, numero1, numero2);        
        

    }
    
    public static void menu(){
        System.out.println(" *** M E N U ***");
        System.out.println("");
        System.out.println("1.  Sumar");
        System.out.println("2.  Restar");
        System.out.println("3.  Multiplicar");
        System.out.println("4.  Dividir");
        System.out.println("5.  Salir");
        System.out.println("");
        System.out.println("Elija la opción entre 1 y 5:");
        System.out.println("");
    }
    
    public static void sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " más " + num2 + " es: " + suma);        
    }
    
    public static void restar(int num1, int num2){
        int resta = num1 - num2;
        System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resta);        
    }
    
    public static void multiplicar(int num1, int num2){
        int multi = num1 * num2;
        System.out.println("La multiplicación de " + num1 + " por " + num2 + " es: " + multi);        
    }
    
    public static void dividir(int num1, int num2){
        float divi = num1 / num2;        
        System.out.println("La división de " + num1 + " en " + num2 + " es: " + divi);        
    }
    
    public static void switchMenu(int opcion, int num1, int num2){
        switch(opcion){ 
            case 1: sumar(num1, num2); break;
            case 2: restar(num1, num2); break;
            case 3: multiplicar(num1, num2); break;
            case 4: dividir(num1, num2); break;
            default: System.out.println("Opción inválida. Escoja entre 1 y 5.");                   
        }
    }
}

