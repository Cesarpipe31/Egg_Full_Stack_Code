/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package service;

import java.util.Scanner;
import model.Movil;

public class ServiceMovil {
    Movil m1 = new Movil();
    Scanner leerString = new Scanner(System.in).useDelimiter("\n");
    Scanner leerDouble = new Scanner(System.in).useDelimiter("\n");
    Scanner leerInt = new Scanner(System.in).useDelimiter("\n");
    
    public int ingresarCodigo(){
        int codigo = 0;
        int unidad = 1;
        System.out.println("Generando código aleatorio.......");
        for (int i = 0; i < 7; i++) {
            int num = (int)(Math.random() * 9);            
            codigo = codigo + num * unidad;
            unidad = unidad * 10;                       
        }
        return codigo;
    }
    
    public Movil cargarCelular(){
        System.out.println("Marca?:");
        String mar = leerString.nextLine();
        System.out.println("Precio?:");
        double pre = leerDouble.nextDouble();
        System.out.println("Modelo?:");
        String mod = leerString.nextLine();
        System.out.println("Memoria RAM?:");
        int memR = leerInt.nextInt();
        System.out.println("Almacenamiento?:");
        int alm = leerInt.nextInt();
        int cod = ingresarCodigo();               
        return new Movil(mar, pre, mod, memR, alm, cod);
    }
    
    public void mostrarMovil(Movil m1){
        System.out.println("\nLos datos almacenados del móvil son:");
        System.out.println(m1.toString());
    }
}
