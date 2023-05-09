/*
Clase Arrays
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package z003_poo_eje010_arreglos;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Z003_POO_Eje010_arreglos {

    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Double.parseDouble(df.format(rand.nextDouble() * 100));
            //System.out.print("[" + arrayA[i] + "]");            
        }

        // Mostrar arregloA sin ordenar
        System.out.println("Arreglo A sin ordenar:");
        System.out.println(Arrays.toString(arrayA));

        // Ordenar arregloA de menor a mayor
        Arrays.sort(arrayA);
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(arrayA));

        // Copiar los primeros 10 elementos de arregloA a arregloB
        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];
        }

        // Rellenar los 10 últimos elementos de arregloB con el valor 0.5
        Arrays.fill(arrayB, 10, arrayB.length, 0.5);

        // Mostrar arregloA ordenado y arregloB combinado
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(arrayB));
    }
}
