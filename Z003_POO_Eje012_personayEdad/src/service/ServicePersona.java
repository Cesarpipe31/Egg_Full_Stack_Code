/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package service;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import model.Persona;

public class ServicePersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        int dia, mes, anho;
        System.out.println("Registre el nombre: ");
        String nombre = leer.nextLine();
        do {
            System.out.println("Registre el día: ");
            dia = leer.nextInt();
        } while (dia < 0 && dia >= 31);
        do {
            System.out.println("Registre el mes: ");
            mes = leer.nextInt();
        } while (mes < 0 && mes >= 12);
        do {
            System.out.println("Registre el año: ");
            anho = leer.nextInt();
        } while (anho < 0 && anho >= 3000);

        Date fecha1 = new Date(anho - 1900, mes - 1, dia);

        return new Persona(nombre, fecha1);
    }

    public long calcularEdad(Persona p1) {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = p1.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
        System.out.println("la edad es: " + edad);
        return edad;
    }
    
//      OTRA FORMA
    
//    public void calcularEdad(Persona p1){
//    Calendar hoy = Calendar.getInstance();
//    Calendar nacimiento = Calendar.getInstance();
//    nacimiento.setTime(p1.getFechaNacimiento());
//    int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
//    if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)){
//        edad--;
//    }
//    System.out.println("La edad es: " + edad);
//}

    
    public boolean menorQue(int edadOtro, Persona p1){
        boolean bandera = false;
        long edad = calcularEdad(p1);
        if (edad < edadOtro){
            bandera = true;
        } else{
            bandera = false;
        }
        return bandera;        
    }

    public void mostrarPersona(Persona p1){
            System.out.println("El nombre de la persona es : " + p1.getNombre());
            System.out.println("La fecha de nacimiento es: " + p1.getFechaNacimiento());
    }
}


