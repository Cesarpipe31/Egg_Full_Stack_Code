/*
Juego AhorcadoTodo: Crear una clase AhorcadoTodo (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
*/
package model;

import java.util.Scanner;

public class AhorcadoTodo {
    private char[] palabra;
    private int encontradas;
    private int jugadasMaximas;

    public AhorcadoTodo() {
        palabra = null;
        encontradas = 0;
        jugadasMaximas = 0;
    }

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraUsuario = scanner.nextLine();
        palabra = palabraUsuario.toCharArray();
        encontradas = 0;
        System.out.print("Ingrese la cantidad máxima de jugadas: ");
        jugadasMaximas = scanner.nextInt();
    }

    public int longitud() {
        return palabra.length;
    }

    public boolean buscar(char letra) {
        for (char c : palabra) {
            if (c == letra) {
                return true;
            }
        }
        return false;
    }

    public boolean encontradas(char letra) {
        int cantidadLetras = 0;
        for (char c : palabra) {
            if (c == letra) {
                cantidadLetras++;
            }
        }
        encontradas += cantidadLetras;
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
