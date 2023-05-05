package z003_poo_003_sueldos.Servicio;

import java.util.Date;
import java.util.Scanner;
import z003_poo_003_sueldos.Entidades.Vendedor;


public class ServicioVendedor {
           
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vendedor altaVendedor(){
        Vendedor v1 = new Vendedor();
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre:");
        v1.setNombre(leer.next());
        System.out.println("Ingrese dni:");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese sueldo básico:");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese día de Inicio:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de Inicio:");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de Inicio:");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        v1.setFechaInicio(fecha);
        return v1;        
    }        
    
    public void SueldoMensual(Vendedor v1){
        //Scanner leer1 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuales fueron las ventas totales del vendedor: ");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: " 
                + v1.getNombre() + " es de $ " + v1.getSueldoMensual());        
    }
    
    public void vacaciones (Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        
        if (antiguedad < 5){
            System.out.println("Le corresponde 14 días de vacaciones");
        } else if (antiguedad < 10){
            System.out.println("Le corresponden 21 días");
        } else if (antiguedad < 20){
            System.out.println("Le corresponden 28 dias");
        } else if (antiguedad > 20){
            System.out.println("Le corresponden 35 dias");            
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
    
    
}
