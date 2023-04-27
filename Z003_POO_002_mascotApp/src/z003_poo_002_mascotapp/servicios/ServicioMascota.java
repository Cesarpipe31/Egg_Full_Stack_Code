package z003_poo_002_mascotapp.servicios;

import java.util.Scanner;
import z003_poo_002_mascotapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        System.out.println("Nombre:");
        String nombre = leer.next();
        
        System.out.println("Apodo:");
        String apodo = leer.next();
        
        System.out.println("Tipo:");
        String tipo = leer.next();
        
                
        return new Mascota(nombre, apodo, tipo);        
        
    }
    
}
