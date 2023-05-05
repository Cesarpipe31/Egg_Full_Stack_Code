/* 
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */

package z003_poo_eje001_libro;

import z003_poo_eje001_libro.Controller.ControllerLibro;
import z003_poo_eje001_libro.Model.Libro;

public class Z003_POO_Eje001_libro {

    
    
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        ControllerLibro conLib = new ControllerLibro();
        conLib.registrarLibro();
        conLib.mostrarLibro(lib1);
        
        
    }
    
}
