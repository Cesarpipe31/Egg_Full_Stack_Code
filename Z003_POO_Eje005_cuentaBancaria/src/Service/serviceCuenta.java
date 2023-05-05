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
    
    public Cuenta crearCuenta(){
        Cuenta c1 = new Cuenta();
        System.out.println("Registre número de la cuenta: ");
        int numcta = leer.nextInt();
        System.out.println("Registre el DNI: ");
        int dni = leer.nextInt();
        System.out.println("Registre número del saldo de la cuenta: ");
        int saldocta = leer.nextInt();
        c1.Cuenta(numcta, dni, saldocta);
        return c1;        
    }    
}
