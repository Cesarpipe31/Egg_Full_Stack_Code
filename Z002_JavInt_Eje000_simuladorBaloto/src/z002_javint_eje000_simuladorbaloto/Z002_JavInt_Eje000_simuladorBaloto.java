package z002_javint_eje000_simuladorbaloto;

import java.util.ArrayList;


public class Z002_JavInt_Eje000_simuladorBaloto {

   
    public static void main(String[] args) {
        int numero;
ArrayList numeros = new ArrayList();
ArrayList magica = new ArrayList();

// Genera 5 numeros entre 1 y 43
for (int i = 0; i < 5; i++) {
    numero = (int) (Math.random() * 42 + 1);
    if (numeros.contains(numero)) {
        i--;
    } else {
        numeros.add(numero);
    }
}

System.out.println("La combinacion del Baloto es:");
for (Object n : numeros) {
    System.out.println(n + "");
}


// Genera 1 numero entre 1 y 16
for (int i = 0; i < 1; i++) {
    numero = (int) (Math.random() * 15 + 1);
    if (magica.contains(numero)) {
        i--;
    } else {
        magica.add(numero);
    }
}
System.out.println("\nY la balota mágica es: ");
for (Object n : magica) {
    System.out.println(n);
}
    }
    
}
