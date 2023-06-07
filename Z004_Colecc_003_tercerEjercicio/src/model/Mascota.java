package model;

public class Mascota {

    private String nombre;
    private String apodo;
    // Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mascota{");
        sb.append("nombre=").append(nombre);
        sb.append(", apodo=").append(apodo);
        sb.append(", tipo=").append(tipo);
        sb.append(", color=").append(color);
        sb.append(", edad=").append(edad);
        sb.append(", cola=").append(cola);
        sb.append(", raza=").append(raza);
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
}
