/*
Uso de vectores como atributos de clase

Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
*/
package service;

import java.util.Scanner;
import model.Curso;

public class ServiceCurso {
    Curso c1 = new Curso();
    Scanner leerInt = new Scanner(System.in).useDelimiter("\n");
    Scanner leerString = new Scanner(System.in).useDelimiter("\n");
    Scanner leerDouble = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(){
        String[] alumnos = new String[5];
        System.out.println("Registre los nombres de los alumnos.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Registre el dato del alumno " + (i+1));
            alumnos[i] = leerString.nextLine();            
        }
        c1.setAlumnos(alumnos);
    }
    
    public Curso crearCurso(){
        System.out.println("Registre el nombre del curso: ");
        c1.setNombreCurso(leerString.nextLine());
        System.out.println("Registre la cantidad de horas por día: ");
        c1.setCantidadHorasPorDia(leerInt.nextInt());
        System.out.println("Registre la cantidad de días por semana: ");
        c1.setCantidadDiasPorSemana(leerInt.nextInt());
        System.out.println("Registre el turno (mañana o tarde): ");
        c1.setTurno(leerString.nextLine());
        System.out.println("Registre el precio por hora: ");
        c1.setPrecioPorHora(leerDouble.nextDouble());
        
        cargarAlumnos();
        return c1;
    }
    
    public void imprimirEstudiante(Curso c1){
        String[] alu = new String[5];
        alu = c1.getAlumnos();
        System.out.println("Los estudiantes son:");
        for (int i = 0; i < alu.length; i++) {
            System.out.println((i+1) + ".  " + alu[i]);
        }
    }
    
    public double calcularGananciaSemanal(Curso c1) {
        int cantAlumnos = 0;
        String[] alu = new String[5];
        alu = c1.getAlumnos();        
        for (int i = 0; i < alu.length; i++) {
            if (alu[i] != null && !alu[i].isEmpty()) {
                cantAlumnos++;
            }
        }
        double gananciaSemanal = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * cantAlumnos * c1.getCantidadDiasPorSemana();
        return gananciaSemanal;
    }
}
