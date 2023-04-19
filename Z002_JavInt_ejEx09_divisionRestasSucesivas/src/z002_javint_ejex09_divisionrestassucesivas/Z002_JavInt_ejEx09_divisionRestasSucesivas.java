/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.

Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/
package z002_javint_ejex09_divisionrestassucesivas;

public class Z002_JavInt_ejEx09_divisionRestasSucesivas {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 99999 + 1);
        int num2 = (int) (Math.random() * 99 + 1);
        //int num1 = 50, num2 = 13;
        int cociente = 0, residuo = 0;
        do{
            num1 = num1 - num2;
            cociente++;
            if (num1 > num2){
                residuo = num1 - num2;            
            }
        }while(num1 > num2);
        System.out.println("\nDivisión por restas sucesivas:");
        System.out.println("");
        System.out.println((cociente * num2 + residuo) + " dividido en " + num2 + " da como cociente " + cociente + " y su residuo es " + residuo + ".");                
    }
    
}
