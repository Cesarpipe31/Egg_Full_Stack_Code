/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package z003_poo_eje004_dibujarrectangulo;

import java.util.Scanner;


public class Z003_POO_Eje004_dibujarRectangulo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Registre la base del rectángulo: ");
        int base = leer.nextInt();
        System.out.println("Registre la altura del rectángulo: ");
        int altura = leer.nextInt();
        
        Rectangulo r1 = new Rectangulo();
        r1.setBase(base);
        r1.setAltura(altura);
        
        int superficie = r1.calcularSuperficie(r1.getBase(),r1.getAltura());
        System.out.println("\nLa superficie es: " + superficie);
        double perimetro = r1.calcularPerimetro(r1.getBase(),r1.getAltura());
        System.out.println("\nEl perimetro es: " + perimetro);
        r1.crearRectangulo(base, altura);
    }
}
