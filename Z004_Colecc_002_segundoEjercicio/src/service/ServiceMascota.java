package service;

import model.Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMascota {
    private Scanner leer= new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public void ServicioMascota(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        //this.mascotas = new ArrayList<>();
    }

    public Mascota crearMascota(){
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apodo: ");
        String apodo = leer.next();
        System.out.println("Tipo: ");
        String tipo = leer.next();
        Mascota m = new Mascota(nombre, apodo, tipo);
        return m;
    }

    

    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (Mascota aux: mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad: " + mascotas.size());
    }

    /**
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista.
     */
    public void fabricaChiquitos(int cantidad){

        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("A", "B", "C"));
        }
    }

    /**
     * Crea mascotas pidiendo datos por teclado
     * @param cantidad
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota  mascotaCreada = crearMascota();
            System.out.println(mascotaCreada);

        }
    }
}
