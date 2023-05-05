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
package z003_poo_eje003_operacionesmatematicas;

import model.Operacion;
import service.ServiceOperacion;


public class Z003_POO_Eje003_operacionesMatematicas {

    
    public static void main(String[] args) {
        ServiceOperacion so = new ServiceOperacion();
        Operacion op1 = so.crearOperacion();                
        
        int resulSuma = so.sumar(op1.getNumero1(), op1.getNumero2());
        int resulResta = so.restar(op1.getNumero1(), op1.getNumero2());
        
        System.out.println("La suma es: " + resulSuma);
        System.out.println("La resta es: " + resulResta);
        
    }
    
}
