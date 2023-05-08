/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
6.
 */
package Service;

import java.util.Scanner;
import model.Cuenta;

public class serviceCuenta {

    Scanner leer = new Scanner(System.in);

    Cuenta c1 = new Cuenta();

    public Cuenta crearCuenta() {
        //Cuenta c1 = new Cuenta();
        System.out.println("Registre número de la cuenta: ");
        int numcta = leer.nextInt();
        System.out.println("Registre el DNI: ");
        int dni = leer.nextInt();
        System.out.println("Registre número del saldo de la cuenta: ");
        int saldocta = leer.nextInt();
        c1.Cuenta(numcta, dni, saldocta);
        return c1;
    }

//      d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//      y se la sumara a saldo actual.
    public int ingresar() {
        System.out.println("Registre el valor a consignar: ");
        int mas = leer.nextInt();
        return c1.getSaldoActual() + mas;
    }

//    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//    usuario no saque más del 20%.
    public void extraerRapido() {
        System.out.println("Cuánto deseas retirar en extracción rápida: ");
        int retirar = leer.nextInt();
        int saldoActual = c1.getSaldoActual();
        if (retirar < (saldoActual * .2)) {
            c1.setSaldoActual(saldoActual - retirar);
            System.out.println("Extracción rápida realizada con éxito.  Su nuevo saldo es: " + c1.getSaldoActual());
        } else {
            System.out.println("No es posible realizar la extracción rápida.  Su saldo es: "
                    + c1.getSaldoActual());
        }
    }

    //  Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    
    public void consultarSaldo(){
        System.out.println("Su saldo es: " + c1.getSaldoActual());        
    }
    
    //  Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
    public void consultarDatos(){
        System.out.println("\nSus datos son:");
        System.out.println("Su número de cuenta es: " + c1.getNumeroCuenta());        
        System.out.println("Su DNI es: " + c1.getDNI());        
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());        
    }
}
