/*
Método Static y Clase Math
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package service;

import model.Matematica;


public class ServiceMatematica {
    Matematica m1 = new Matematica();    
    
    public Matematica crearObjeto(){
        System.out.println("Creando objeto...");
        double n1 = (Math.random() * 9 + 1);
        double n2 = (Math.random() * 9 + 1);
        m1.setNum1(n1);
        m1.setNum2(n2);
        m1.toString();
        return m1;        
    }
    
    public double devolverMayor(double num1, double num2){
        System.out.println("\nDevolviendo número mayor...");        
        double mayor;
        if (num1 >= num2){
            mayor = num1;            
        } else {
            mayor = num2;            
        }
        return mayor;
    }
    
    public void calcularPotencia(double num1, double num2){
        System.out.println("\nCalculando potencia del número mayor...");
        double n1 = Math.floor(num1);
        double n2 = Math.floor(num2);
        System.out.println("Número uno: " + m1.getNum1() + " y su valor redondeado es: " + n1);
        System.out.println("Número dos: " + m1.getNum2() + " y su valor redondeado es: " + n2);
        if (n1 >= n2){
            double cp = Math.pow(n1, n2);
            System.out.println(+n1 + " elevado a " + n2 + " es: " + cp);
        } else {
            double cp = Math.pow(n2, n1);
            System.out.println(+n2 + " elevado a " + n1 + " es: " + cp);
        }                
    }
    
   public void calcularRaiz(double num1, double num2){
       System.out.println("\nCalculando raíz de número menor...");
        double n1 = Math.abs(num1);
        double n2 = Math.abs(num2);
        System.out.println("Número uno: " + m1.getNum1() + " y su valor absoluto es: " + n1);
        System.out.println("Número dos: " + m1.getNum2() + " y su valor absoluto es: " + n2);
        if (n1 <= n2){
            double rc = Math.sqrt(n1);
            System.out.println(+n1 + " y su raiz cuadrada es " + rc);
        } else {
            double rc = Math.sqrt(n2);
            System.out.println(+n2 + " y su raiz cuadrada es " + rc);
        }                
    }    
}
