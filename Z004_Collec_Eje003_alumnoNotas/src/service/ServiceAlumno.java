package service;

import model.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceAlumno {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leerDouble = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public Alumno crearAlumno(){
        System.out.println("Escriba el nombre del alumno: ");
        String n = leer.nextLine();
        ArrayList<Double> notas = new ArrayList<>();
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Registre la nota (de 0 a 100) " + (i+1) + " de 3:");
            double nota = leerDouble.nextDouble();
            notas.add(nota);
        }
        return new Alumno(n, notas);
    }

    public void adicionarAlumno(Alumno a){
        listaAlumnos.add(a);
    }

    public void mostrarAlumnos(){
        System.out.println("Las alumnos registradas son: ");
        for (Alumno aux: listaAlumnos) {
            System.out.println(listaAlumnos.toString());
        }
        System.out.println("Cantidad de alumnos registradas: " + listaAlumnos.size());
    }

    public void adicionarMasAlumnos(){
        String respuesta;
        Alumno a = crearAlumno();
        adicionarAlumno(a);
        do {
            System.out.println("Desea registrar más alumnos?, Digite S o N :");
            respuesta = leer.nextLine();
            if ("S".equals(respuesta)){
                Alumno a1 = crearAlumno();
                adicionarAlumno(a1);
            }else if ("N".equals(respuesta)){
                System.out.println("Has decidido terminar el proceso.");
                mostrarAlumnos();
            }
        }while ("S".equals(respuesta));
    }
}
