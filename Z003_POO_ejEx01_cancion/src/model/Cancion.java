/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
*/
package model;

public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(){
        
    }
    
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append('}');
        return sb.toString();
    }
}
