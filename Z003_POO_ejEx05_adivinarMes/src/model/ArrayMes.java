/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
*/
package model;

public class ArrayMes {
    private String[] arrayMes;

    public ArrayMes() {
    }

    public ArrayMes(String[] arrayMes) {
        this.arrayMes = new String[12];
    }

    public String[] getArrayMes() {
        return arrayMes;
    }

    public void setArrayMes(String[] arrayMes) {
        this.arrayMes = arrayMes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("arrayMes{");
        sb.append("arrayMes=").append(arrayMes);
        sb.append('}');
        return sb.toString();
    }
    
}
