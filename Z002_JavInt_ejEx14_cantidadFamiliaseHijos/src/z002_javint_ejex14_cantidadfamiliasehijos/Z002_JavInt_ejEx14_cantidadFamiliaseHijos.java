/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene 
una M cantidad de hijos. Escriba un programa que pida la cantidad de 
familias y para cada familia la cantidad de hijos para averiguar la 
media de edad de los hijos de todas las familias.

10 familias
1 7
2 5
3 4
4 5

 */
package z002_javint_ejex14_cantidadfamiliasehijos;

import java.util.Scanner;

public class Z002_JavInt_ejEx14_cantidadFamiliaseHijos {

    public static void main(String[] args) {
        int cantFamilias = 0, cantParcial = 0, cantTotal = 0, prom = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("De cuántas familias tomará la cantidad de hijos: ");
        cantFamilias = leer.nextInt();
        for (int i = 0; i < cantFamilias; i++) {
            System.out.println("Cuántos hijos tiene la familia " + i);
            cantParcial = leer.nextInt();
            cantTotal +=  cantParcial;            
        }
        prom = cantTotal / cantFamilias;
        System.out.println("Son " + cantFamilias + " familias, con un total de " + cantTotal + " hijos. En promedio tienen " + prom + " hijos por familia.");
    }
}
