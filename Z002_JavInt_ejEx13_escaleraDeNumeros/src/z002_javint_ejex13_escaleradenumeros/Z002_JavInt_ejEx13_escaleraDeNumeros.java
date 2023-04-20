/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la 
altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
package z002_javint_ejex13_escaleradenumeros;

public class Z002_JavInt_ejEx13_escaleraDeNumeros {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 19 + 1);
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < i; j++) {                
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
