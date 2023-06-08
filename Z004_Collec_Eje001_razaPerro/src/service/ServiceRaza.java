package service;

import model.Raza;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceRaza {

    Raza rz = new Raza();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Raza> razas = new ArrayList<>();

    public Raza crearRaza(){
        System.out.println("Registre la raza del perro: ");
        String raza = leer.nextLine();
        return new Raza(raza);
    }

    public void mostrarRazas(){
        System.out.println("Las razas registradas son: ");
        for (Raza aux: razas) {
            System.out.println(aux.getNombreRaza());
        }
        System.out.println("Cantidad de razas registradas: " + razas.size());
    }

    public void adicionarRaza(Raza r){
        razas.add(r);
    }

    public void adicionarMasRazas(){
        String respuesta;
        Raza r = crearRaza();
        adicionarRaza(r);
        do {
            System.out.println("Desea registrar más razas?, Digite S o N :");
            respuesta = leer.nextLine();
            if ("S".equals(respuesta)){
                Raza r1 = crearRaza();
                adicionarRaza(r1);
            }else if ("N".equals(respuesta)){
                System.out.println("Has decidido terminar el proceso.");
                mostrarRazas();
            }
        }while ("S".equals(respuesta));
    }
}
