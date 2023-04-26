
package Entidad;


public class Persona {
    
    public String nombre;
    public int identificación;
    public String nacionalidad;

    // Por ahora solo se utilizarán los MODIFICADORES public, private y protected.
    // Constructor con parámetros

    public Persona(String nombre, int identificación, String nacionalidad) {
        this.nombre = nombre;
        this.identificación = identificación;
        this.nacionalidad = nacionalidad;
    }
    
    
    // Constructor por defecto
    public Persona() {
    }    
}
