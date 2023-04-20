/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package z002_javint_ejex06_promedioalturas;


public class Z002_JavInt_ejEx06_promedioAlturas {

    public static void main(String[] args) {
        int cantTotal = 0, cantParcial = 0, cantElementos = 3;       
        float [] vector = new float [cantElementos];
        float altura = 0, promTotal = 0, promParcial = 0, sumTotal = 0, sumParcial = 0;        
        for (int i = 0; i < cantElementos; i++) {
            altura = (float) (Math.random() * 1 + .99);
            cantTotal++;
            sumTotal = sumTotal + altura;
            promTotal = sumTotal / cantTotal;
            vector[i] = altura;
            if (altura < 1.6){
                cantParcial++;
                sumParcial = sumParcial + altura;
                promParcial = sumParcial / cantParcial;
            }         
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println("\n\n Se han registrado " + cantTotal + " alturas cuyo promedio es " + promTotal + ".");   
        System.out.println("\n Se han registrado " + cantParcial + " alturas menores a 1.6 cuyo promedio es " + promParcial + ".");   
    }    
}
