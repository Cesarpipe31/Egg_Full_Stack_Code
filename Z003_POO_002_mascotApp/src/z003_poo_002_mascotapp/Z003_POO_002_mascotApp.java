package z003_poo_002_mascotapp;

import z003_poo_002_mascotapp.entidades.Mascota;
import z003_poo_002_mascotapp.servicios.ServicioMascota;


public class Z003_POO_002_mascotApp {
   
    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
        
        
    
        
    }

    

    
    
}
