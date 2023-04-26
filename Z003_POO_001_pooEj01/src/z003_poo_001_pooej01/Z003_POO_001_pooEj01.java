package z003_poo_001_pooej01;

import Entidad.Persona;

public class Z003_POO_001_pooEj01 {

    
    public static void main(String[] args) {
        Persona primeraPersona = new Persona();
        
        Persona segundaPersona = new Persona("Mariano", 9191, "Colombiano");
        
        System.out.println(primeraPersona);
        System.out.println(segundaPersona);
        
    }
    
}
