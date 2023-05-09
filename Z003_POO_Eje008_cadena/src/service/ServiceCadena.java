/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package service;

import java.util.Scanner;
import model.Cadena;

public class ServiceCadena {

    Cadena c1 = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Registre la frase: ");
        c1.setFrase(leer.nextLine());
        c1.setLongitudFrase(c1.getFrase().length());
        return c1;
    }

    public void mostrarVocales(Cadena c1) {
        int contarVocales = 0;
        String frase = c1.getFrase();
        int largo = c1.getLongitudFrase();
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i + 1).equals("A") || frase.substring(i, i + 1).equals("a")
                    || frase.substring(i, i + 1).equals("Á") || frase.substring(i, i + 1).equals("á")
                    || frase.substring(i, i + 1).equals("E") || frase.substring(i, i + 1).equals("e")
                    || frase.substring(i, i + 1).equals("É") || frase.substring(i, i + 1).equals("é")
                    || frase.substring(i, i + 1).equals("I") || frase.substring(i, i + 1).equals("i")
                    || frase.substring(i, i + 1).equals("Í") || frase.substring(i, i + 1).equals("í")
                    || frase.substring(i, i + 1).equals("O") || frase.substring(i, i + 1).equals("o")
                    || frase.substring(i, i + 1).equals("Ó") || frase.substring(i, i + 1).equals("ó")
                    || frase.substring(i, i + 1).equals("U") || frase.substring(i, i + 1).equals("u")
                    || frase.substring(i, i + 1).equals("Ú") || frase.substring(i, i + 1).equals("ú")) {
                contarVocales++;
            }
        }
        System.out.println("Hay " + contarVocales + " vocales, incluyendo mayúsculas, minúsculas y acentuadas");
    }

    public void invertirFrase(Cadena c1) {
        String frase = c1.getFrase();
        int largo = c1.getLongitudFrase();
        String nuevaFrase = "", letra = "";
        for (int i = largo - 1; i >= 0; i--) {
            letra = frase.substring(i, i + 1);
            nuevaFrase = nuevaFrase + letra;
        }
        System.out.println("La nueva frase es: " + nuevaFrase);
    }

    public void contarRepetido(String letra) {
        int contarLetra = 0;
        String frase = c1.getFrase();
        int largo = c1.getLongitudFrase();
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                contarLetra++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + contarLetra + " veces.");
    }

    public void compararLongitud(String frase) {
        int largoFraseInicial = c1.getLongitudFrase();
        int largoNuevaFrase = frase.length();

        if (largoFraseInicial == largoNuevaFrase) {
            System.out.println("El largo de la frase inicial comparado con el largo de la nueva frase son IGUALES");
        } else {
            System.out.println("El largo de la frase inicial comparado con el largo de la nueva frase NO SON IGUALES");
        }
    }

    public void unirFrases(String frase) {
        String fraseInicial = c1.getFrase();
        String nuevaFrase = "";
        nuevaFrase = fraseInicial + " " + frase;
        System.out.println("La nueva frase es " + nuevaFrase);
    }

    public void reemplazarCaracter(String letra) {
        String fraseInicial = c1.getFrase();
        String nuevaFrase = "";
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            if (fraseInicial.substring(i, i + 1).equals("a")) {
                nuevaFrase = nuevaFrase + letra;
            } else {
                nuevaFrase = nuevaFrase + fraseInicial.substring(i, i + 1);
            }
        }
        System.out.println("Frase cambiando el caracter: " + nuevaFrase);
    }
    
    public boolean contenerLetra(String letra){
        String fraseInicial = c1.getFrase();
        boolean bandera = false;
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            if (fraseInicial.substring(i, i+1).equals(letra)){
                bandera = true;
                break;
            } else{
                bandera = false;
            }   
        }
        return bandera;        
    }
    
}


