import java.lang.reflect.Array;
import java.util.*;

/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
public class Main {
    static ArrayList<String> listaRazas = new ArrayList<>();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        registrarRaza();
        System.out.println("\n\nRegistre la raza a eliminar de la lista: ");
        String raza = leer.nextLine();
        eliminarRaza(raza);
    }

    public static void registrarRaza(){
        String respuesta;
        do {
            System.out.println("Registre la raza: ");
            String raza = leer.nextLine();
            listaRazas.add(raza);
            System.out.println("Desea registrar otra raza?. Digite S o N (Sí o No):");
            respuesta = leer.nextLine();
            if("S".equals(respuesta)){
                continue;
            } else if("N".equals(respuesta)){
                System.out.println("Has decidido terminar el proceso.");
                mostrarLista();
            }
        }while ("S".equals(respuesta));
    }

    public static void mostrarLista(){
        Collections.sort(listaRazas);
        System.out.println("\nLas razas registradas en la lista son:");
        for (String aux: listaRazas) {
            System.out.println("Raza: " + aux);
        }
        System.out.println("Cantidad de razas registradas en la lista: " + listaRazas.size());
    }

    public static void eliminarRaza(String r){
        if (listaRazas.contains(r)){
            System.out.println("\nSe encontró la raza " + r + " en la lista y será eliminada.");
        } else {
            System.out.println("\nNo se encontró la raza " + r + " en la lista, por lo tanto no se eliminará.");
        }

        Iterator<String> it = listaRazas.iterator();
        while (it.hasNext()){
            String aux = it.next();
            if (aux.equals(r)){
                it.remove();
            }
        }
        mostrarLista();
    }
}