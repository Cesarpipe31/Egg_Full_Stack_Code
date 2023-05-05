/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
*/
package model;

public class Operacion {
    
    private Integer numero1;
    private Integer numero2;
    
    
    public Operacion(){
        
    }
    
    public Operacion(Integer numero1, Integer numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Integer getNumero1() {
        return this.numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return this.numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operacion{");
        sb.append("numero1=").append(numero1);
        sb.append(", numero2=").append(numero2);
        sb.append('}');
        return sb.toString();
    }
}
