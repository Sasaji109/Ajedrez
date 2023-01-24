package PrimeraVersion;

public class Posicion {

    //Atributos
    private int fila;
    private int columna;

    //Constructores
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    //Getters y Setters
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }

    //Métodos
    @Override
    public String toString() {
        return "Posicion{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
