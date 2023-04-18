/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package z002_javint_eje017_cantidaddigitosenenteros;

public class Z002_JavInt_Eje017_cantidadDigitosenEnteros {

    public static void main(String[] args) {
        int cantidad = (int) (Math.random() * 9999 + 1);
        int[] vectorCompleto = new int[cantidad];
        int cant_1_Dig = 0, cant_2_Dig = 0, cant_3_Dig = 0, cant_4_Dig = 0, cant_5_Dig = 0, sumaCant = 0;

        System.out.println("El vector tendrá " + cantidad + " elementos.");

        for (int i = 0; i < cantidad; i++) {
            int numero = (int) (Math.random() * 99 + 1);
            vectorCompleto[i] = numero;
        }

        System.out.println("\n\nLos elementos del vector son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("[" + vectorCompleto[i] + "]");
        }

        
        for (int i = 0; i < cantidad; i++) {
            if (Integer.toString(vectorCompleto[i]).length() == 1) {
                cant_1_Dig++;
            } else if (Integer.toString(vectorCompleto[i]).length() == 2) {
                cant_2_Dig++;
            } else if (Integer.toString(vectorCompleto[i]).length() == 3) {
                cant_3_Dig++;
            } else if (Integer.toString(vectorCompleto[i]).length() == 4) {
                cant_4_Dig++;
            } else if (Integer.toString(vectorCompleto[i]).length() == 5){
                cant_5_Dig++;
            }
        }
        sumaCant = cant_1_Dig + cant_2_Dig + cant_3_Dig + cant_4_Dig + cant_5_Dig;
        System.out.println("\n\n" + cant_1_Dig + " números tiene 1 dígito.");
        System.out.println(cant_2_Dig + " números tiene 2 dígito.");
        System.out.println(cant_3_Dig + " números tiene 3 dígito.");
        System.out.println(cant_4_Dig + " números tiene 4 dígito.");
        System.out.println(cant_5_Dig + " números tiene 5 dígito.");
        System.out.println("\n" + sumaCant + " números en total fueron analizados, y por tanto, calculados la cantidad de sus digitos.");
    }
}
