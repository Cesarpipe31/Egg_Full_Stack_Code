package z003_poo_003_sueldos;

import z003_poo_003_sueldos.Entidades.Vendedor;
import z003_poo_003_sueldos.Servicio.ServicioVendedor;

public class Z003_POO_003_sueldos {

    public static void main(String[] args) {
        ServicioVendedor sv = new ServicioVendedor();
        Vendedor v1 = sv.altaVendedor();
        sv.SueldoMensual(v1);
        sv.vacaciones(v1);
    }

}
