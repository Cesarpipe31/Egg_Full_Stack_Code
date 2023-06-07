package model;

public class Ahorcado {

    private char[] palabra;
    private int encontradas;
    private int jugadasMaximas;

    
    
    public Ahorcado(){
        palabra = null;
        encontradas = 0;
        jugadasMaximas = 0;
    }

    public Ahorcado(char[] palabra, int encontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ahorcado{");
        sb.append("palabra=").append(palabra);
        sb.append(", encontradas=").append(encontradas);
        sb.append(", jugadasMaximas=").append(jugadasMaximas);
        sb.append('}');
        return sb.toString();
    }
}
