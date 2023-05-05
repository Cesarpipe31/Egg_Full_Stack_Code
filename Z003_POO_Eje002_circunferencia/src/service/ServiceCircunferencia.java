package service;

import java.util.Scanner;
import model.Circunferencia;

public class ServiceCircunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia CrearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        System.out.println("Registre el radio de la circunferencia: ");
        float radio = leer.nextFloat();
        c1.setRadio(radio);
        return c1;
    }
    
    public void calcularArea(Circunferencia circ1){
        
        double area = (Math.PI * Math.pow(circ1.getRadio(), 2));
        System.out.println("El área de la circunferencia es: " + area);
    }
    
    public void calcularPerimetro(Circunferencia circ1){
        double perimetro = ( 2 * Math.PI * circ1.getRadio());
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }
}
