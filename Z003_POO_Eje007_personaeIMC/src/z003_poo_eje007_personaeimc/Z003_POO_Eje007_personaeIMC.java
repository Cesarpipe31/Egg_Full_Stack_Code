/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package z003_poo_eje007_personaeimc;

import java.util.ArrayList;
import model.Persona;
import service.ServicePersona;

public class Z003_POO_Eje007_personaeIMC {

    public static void main(String[] args) {
        ServicePersona sc = new ServicePersona();
        ArrayList<Persona> arrayperso = new ArrayList<>();

        Persona p1 = sc.crearPersona();
        Persona p2 = sc.crearPersona();
        Persona p3 = sc.crearPersona();
        Persona p4 = sc.crearPersona();

        arrayperso.add(p1);
        arrayperso.add(p2);
        arrayperso.add(p3);
        arrayperso.add(p4);

        int imc = 0, sobrePeso = 0, pesoIdeal = 0, debajoPeso = 0, mayorEdad = 0, menorEdad = 0;        

        for (int i = 0; i < arrayperso.size(); i++) {
            imc = sc.calcuclarIMC(arrayperso.get(i));

            if (imc == 1) {                
                sobrePeso++;
            } else if (imc == 0) {                
                pesoIdeal++;
            } else if (imc == -1) {                
                debajoPeso++;
            } else {
                System.out.println("Error. Revisa la data.");
            }
            
            if (sc.esMayorDeEdad(arrayperso.get(i))) {                
                mayorEdad++;
            } else {                
                menorEdad++;
            }            
        }
        System.out.println("En sobrepeso estan el " +  ((sobrePeso/4)*100)+ "%");
        System.out.println("En debajo de su peso ideal estan el " +  ((debajoPeso/4)*100)+ "%");
        System.out.println("En su peso ideal estan el " +  ((pesoIdeal/4)*100)+ "%");
        System.out.println("El porcentaje de mayores de edad es " +  ((mayorEdad/4)*100)+ "%");
        System.out.println("El porcentaje de menores de edad es " +  ((menorEdad/4)*100)+ "%");
    }
}
