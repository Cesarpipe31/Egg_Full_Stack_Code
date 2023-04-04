//¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.

package z002_javint_004_deteccionerrores;


public class Z002_JavInt_004_deteccionErrores {
    
    public static void main(String[] args) {
        
    String nombre = "César";  //falta el ; y String es con S mayúscula
    boolean bandera = false; // falta la letra o en boolean y el ; al final de la sentencia. No se utiliza la -> sino el =
    char char1 = 'a';//  la palabra reservada char no se puede utilizar para crear un identificador, por tanto, se adicionó el número 1 a dicho identificador    
    int numero = 48;  // el 48 estaba entre comillas y como no es String sino entero entonces se quitan las comillas
    double decimales = 3.55; // el double se delimita con el . y no con la , por tanto se cambia 3,55 por 3.55
    boolean bandera1 = false;  // falta la o para boolean , = en vez de -> y false no necesita las comillas  
    
    }    
}
