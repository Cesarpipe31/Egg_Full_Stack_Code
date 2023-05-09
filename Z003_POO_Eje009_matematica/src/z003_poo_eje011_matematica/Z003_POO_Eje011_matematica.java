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
package z003_poo_eje011_matematica;

import model.Matematica;
import service.ServiceMatematica;

public class Z003_POO_Eje011_matematica {

    public static void main(String[] args) {
        ServiceMatematica sm = new ServiceMatematica();
        Matematica m1 = sm.crearObjeto();
        System.out.println("El número mayor es " + sm.devolverMayor(m1.getNum1(), m1.getNum2()));
        sm.calcularPotencia(m1.getNum1(), m1.getNum2());
        sm.calcularRaiz(m1.getNum1(), m1.getNum2());
    }

}
