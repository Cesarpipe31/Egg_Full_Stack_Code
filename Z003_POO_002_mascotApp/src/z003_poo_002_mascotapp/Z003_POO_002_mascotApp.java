package z003_poo_002_mascotapp;

import java.util.Scanner;
import z003_poo_002_mascotapp.entidades.Mascota;


public class Z003_POO_002_mascotApp {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("Fdo Chiquito", leer.next(), "Beagle");
        
        
        m1.setNombre("pepe");
        
        System.out.println(m1.getNombre());
        
        System.out.println(m1);
        

    
        
    }
    
}
