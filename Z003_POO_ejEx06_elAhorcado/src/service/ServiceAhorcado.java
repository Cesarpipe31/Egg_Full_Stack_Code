package service;

import java.util.Scanner;
import model.Ahorcado;

public class ServiceAhorcado {
    Ahorcado ahor = new Ahorcado();
        
    public void crearJuego() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraUsuario = scanner.nextLine();
        char[] pal = palabraUsuario.toCharArray();
        int encontradas = 0;
        System.out.print("Ingrese la cantidad máxima de jugadas: ");
        int jugadasMaximas = scanner.nextInt();
    }

    public int longitud() {
        return ahor.getPalabra().length;
    }

    public boolean buscar(char letra) {
        for (char c : ahor.getPalabra()) {
            if (c == letra) {
                return true;
            }
        }
        return false;
    }

    public boolean encontradas(char letra) {
        int cantidadLetras = 0;
        for (char c : ahor.getPalabra()) {
            if (c == letra) {
                cantidadLetras++;
            }
        }
        ahor.encontradas += cantidadLetras;
        int faltantes = palabra.length - encontradas;
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + ", " + faltantes + ")");
        return cantidadLetras > 0;
    }

    public int intentos() {
        return jugadasMaximas;
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);
        while (jugadasMaximas > 0) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.nextLine().charAt(0);
            if (buscar(letra)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                jugadasMaximas--;
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }
            if (encontradas == palabra.length) {
                System.out.println("¡Felicidades! Has descubierto toda la palabra.");
                return;
            }
            System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + ", " + (palabra.length - encontradas) + ")");
            System.out.println("Número de oportunidades restantes: " + jugadasMaximas);
            System.out.println("----------------------------------------------");
        }
        System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
    }

    
    
    
}
