/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
*/
package service;

import java.util.Scanner;
import model.ArrayMes;

public class ServiceArrayMes {
    ArrayMes am = new ArrayMes();
    
    //@SuppressWarnings("empty-statement")
    public ArrayMes crearArray(){        
        String arrayMes[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        am.setArrayMes(arrayMes);               
        return am;
    }
    
    public void adivinarMes(ArrayMes am1){
        String arrayMes[] = new String[12];
        arrayMes = am1.getArrayMes();
        int posMes = (int)(Math.random() * 11 + 1);
        System.out.println("posMes = " + posMes);
        String mes;
        do{
            Scanner leer = new Scanner(System.in).useDelimiter("\n");            
            System.out.println("Adivine uno de los doce meses, en minúscula:");
            mes = leer.nextLine();
            if (!arrayMes[posMes].equals(mes)){
                System.out.println("No ha acertado. Intente nuevamente.");                
            }   
        }while(!arrayMes[posMes].equals(mes));
        System.out.println("Felicitaciones. Has acertado!!!");                    
    }
}
