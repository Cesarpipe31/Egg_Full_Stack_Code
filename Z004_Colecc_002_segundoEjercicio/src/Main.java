import service.ServiceMascota;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceMascota servMasc = new ServiceMascota();

        servMasc.fabricaChiquitos(10);

        servMasc.mostrarMascotas();

        servMasc.fabricaMascota(3);
        servMasc.mostrarMascotas();

    }
}