/* 
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */

package z003_poo_eje001_libro.Controller;

import java.util.Scanner;
import z003_poo_eje001_libro.Model.Libro;


public class ControllerLibro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leerInt = new Scanner(System.in).useDelimiter("\n");
    
    Libro lib1 = new Libro();
    
    public Libro registrarLibro(){
        
        System.out.println("Registre el ISBN: ");
        lib1.setIsbn(leer.nextLine());
        System.out.println("Registre el título: ");
        lib1.setTitulo(leer.nextLine());
        System.out.println("Registre el autor: ");
        lib1.setAutor(leer.nextLine());
        System.out.println("Registre el número de páginas: ");
        lib1.setPaginas(leerInt.nextInt());  
        return lib1;
    }
    
    public void mostrarLibro(Libro lib1){
        System.out.println(lib1.toString());
                
    }
    
    
}
