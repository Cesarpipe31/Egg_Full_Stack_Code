package Service;

import java.util.Date;
import java.util.Scanner;
import model.DateReg;

public class ServiceDate {

    Scanner leer = new Scanner(System.in);

    public DateReg crearFecha() {
        DateReg d1 = new DateReg();
        int dia, mes, anho;
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
        d1.setFechaRegistrada(fecha1);

        return d1;
    }

    public void comparar(DateReg d1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - d1.getFechaRegistrada().getYear();
        System.out.println("Diferencia entre años = " + antiguedad);
    }   
    
}
