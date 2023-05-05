/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
    e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
*/
package z003_poo_eje002_circunferencia;

import model.Circunferencia;
import service.ServiceCircunferencia;


public class Z003_POO_Eje002_circunferencia {


    public static void main(String[] args) {
        ServiceCircunferencia sc = new ServiceCircunferencia();
        Circunferencia c1 = sc.CrearCircunferencia();
        sc.calcularArea(c1);
        sc.calcularPerimetro(c1);        
    }    
}
