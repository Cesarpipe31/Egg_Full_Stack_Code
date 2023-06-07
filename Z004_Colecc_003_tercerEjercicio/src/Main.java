import service.ServiceMascota;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceMascota servMasc = new ServiceMascota();

        servMasc.fabricaMascota(3);

        servMasc.mostrarMascotas();

        servMasc.actualizarMascota2(0);

        servMasc.mostrarMascotas();

        servMasc.eliminarMasctoa(0);

        servMasc.mostrarMascotas();



    }



}