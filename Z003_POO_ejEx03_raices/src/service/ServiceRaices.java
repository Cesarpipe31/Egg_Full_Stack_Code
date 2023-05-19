/*
    Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package service;

import java.util.Scanner;
import model.Raices;

public class ServiceRaices {

    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crearEcuacion() {

        System.out.println("Registra el valor entero de a:");
        int a = leer.nextInt();
        System.out.println("Registra el valor entero de b:");
        int b = leer.nextInt();
        System.out.println("Registra el valor entero de c:");
        int c = leer.nextInt();
        return new Raices(a, b, c);
    }

//    public Raices crearEcuacion() {
//        Random rnd = new Random();
//        int a = rnd.nextInt();
//        int b = rnd.nextInt();
//        int c = rnd.nextInt();
//        return new Raices(a, b, c);
//    }
//   Método getDiscriminante(): devuelve el valor del discriminante (double). El
//  discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante(Raices r1) {
        int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();
        return (Math.pow(b, 2) - 4 * a * c);
    }

//   Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//  que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices r1) {
        double disc = getDiscriminante(r1);
        return disc >= 0;
    }

//   Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//  que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices r1) {
        double disc = getDiscriminante(r1);
        return disc == 0;
    }

//   Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//  posibles soluciones. (-b±√((b^2)-(4*a*c)))/(2*a)
    public boolean obtenerRaices(Raices r1) {
        boolean bandera = tieneRaices(r1);
        int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();
        if (!bandera) {
            System.out.println("La ecuación no posee dos soluciones, tiene una sola solución.");
            //break;
            return true;
        } else {
            double resultadoPositivo = (-b + (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / 2 * a;
            double resultadoNegativo = (-b - (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / 2 * a;
            System.out.println("\nLos resultados son: ");
            System.out.println("Resultado positivo: " + resultadoPositivo);
            System.out.println("Resultado negativo: " + resultadoNegativo);
            return false;
        }
    }

//   Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//  Es en el caso en que se tenga una única solución posible.
    //TENGO DUDAS
    public boolean obtenerRaiz(Raices r1) {
        boolean bandera = tieneRaiz(r1);
        int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();
        if (!bandera) {
            System.out.println("La ecuación no posee una solucion, posee dos soluciones.");
            // break;
            return false;
        } else {
            double resultadoPositivo = (-b + (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / 2 * a;
            double resultadoNegativo = (-b - (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / 2 * a;
            System.out.println("\nEl resultados es: ");
            System.out.println("Resultado positivo: " + resultadoPositivo);
            System.out.println("Resultado negativo: " + resultadoNegativo);
            return true;
        }
    }

//   Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//  pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//  obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//  de no existir solución, se mostrará un mensaje.
    public void calcular(Raices r1) {
        if (tieneRaices(r1)) {
            obtenerRaices(r1);
        } else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        } else {
            System.out.println("\nNo tiene solución en los números reales.");
        }

    }

}

