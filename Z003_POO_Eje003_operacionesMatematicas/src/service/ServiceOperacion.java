/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
*/
package service;

import java.util.Scanner;
import model.Operacion;

public class ServiceOperacion {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion op1 = new Operacion();
        System.out.println("Registre el primer número entero: ");
        int num1 = leer.nextInt();        
        System.out.println("Registre el segundo número entero: ");
        int num2 = leer.nextInt();
        op1.setNumero1(num1);
        op1.setNumero2(num2);
        return op1;        
    }    
    
    public int sumar(int num1, int num2){
        return num1 + num2;        
    }
    
    public int restar(int num1, int num2){
        return num1 - num2;        
    }
}
