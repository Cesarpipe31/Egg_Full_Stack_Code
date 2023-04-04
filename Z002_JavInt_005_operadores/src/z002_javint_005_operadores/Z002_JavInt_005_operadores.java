//Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.

/*
Los operadores son símbolos especiales de la plataforma que permiten especificar operaciones 
en uno, dos o tres operandos y retornar un resultado. También aprenderemos qué operadores 
poseen mayor orden de precedencia. Los operadores con mayor orden de precedencia se evalúan siempre primero.
Primeramente, proceden los operadores unarios, luego los aritméticos, después los de bits, 
posteriormente los relacionales, detrás vienen los booleanos y por último el operador de asignación. 
La regla de precedencia establece que los operadores de mayor nivel se ejecuten primero. 
Cuando dos operadores poseen el mismo nivel de prioridad los mismos se evalúan de izquierda 
a derecha. Operadores Aritméticos
*/


package z002_javint_005_operadores;

public class Z002_JavInt_005_operadores {
  
    public static void main(String[] args) {
        String nombre = "César";
        int edad = 47;
        int masEdad = 43;
        int edadFallecimiento = edad + masEdad;
        System.out.println("edadFallecimiento es " + edadFallecimiento + ", pues edad actual " + edad + " y mas anhos a vivir " + masEdad);
        int edadRealFallecimiento = 93;
        boolean edadPartida = edadFallecimiento > edadRealFallecimiento;
        if (edadPartida){
            System.out.println("Fallecio en la edad proyectada");
            }
        else{
            System.out.println("No fallecio cuando se esperaba.");
            }        
    }   
}
