import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] nombresArray = new String[5];
        for (int i = 0; i < nombresArray.length ; i++) {
            nombresArray[i] = "Chiquito " + (i+1);
        }

        for (String var: nombresArray) {
            System.out.println(var);
        }

        //Collections

        ArrayList<String> nombresArrayList = new ArrayList<>();
        System.out.println("Tamaño al iniciar " +nombresArrayList.size());
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        System.out.println("Tamaño luego de adicionar elementos " + nombresArrayList.size());
        nombresArrayList.remove("chiquito");
        System.out.println("Tamañan luego de eliminar un elemento " + nombresArrayList.size());
        System.out.println("Máxima dimensión de un ArrayList " + Integer.MAX_VALUE);
        System.out.println("Mínima dimensión de un ArrayList " + Integer.MIN_VALUE);

    }
}