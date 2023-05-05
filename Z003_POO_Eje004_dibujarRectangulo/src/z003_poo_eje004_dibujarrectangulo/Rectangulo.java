/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package z003_poo_eje004_dibujarrectangulo;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {

    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public void crearRectangulo(int b, int a) {
        System.out.println("");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ((i == 0 || i == a - 1) || (j == 0 || j == b - 1)) {
                    System.out.print(" * ");
                } else if ((i != 0 || i != a - 1) || (j != 0 || j != b - 1)) {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
    
    public int calcularSuperficie (int b, int a){
        return b * a;
    }
    
    public double calcularPerimetro (int b, int a){
        return (b + a) * 2;
    }
}
