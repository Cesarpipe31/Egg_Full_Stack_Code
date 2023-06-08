package model;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Double> listaNotas;

    public Alumno(String n, ArrayList<Double> notas) {
    }

    public Alumno(String nombre, List<Double> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", listaNotas=" + listaNotas +
                '}';
    }
}
