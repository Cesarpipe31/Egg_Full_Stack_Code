/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package z002_javint_ejex12_numeromodificael3;

public class Z002_JavInt_ejEx12_numeroModificaEl3 {

    public static void main(String[] args) {
        int  largo = 0;
        String numCadena = "";
        for (int i = 0; i < 1000; i++) {
            numCadena = Integer.toString(i);
            largo = numCadena.length();
            if (largo == 1) {
                numCadena = "00" + numCadena;
            } else if (largo == 2) {
                numCadena = "0" + numCadena;
            }
            
            numCadena = numCadena.replaceAll("3", "E");
                      
            System.out.println(numCadena.substring(0,1) + " " + numCadena.substring(1,2) + " " + numCadena.substring(2,3));            
        }        
    }
}
