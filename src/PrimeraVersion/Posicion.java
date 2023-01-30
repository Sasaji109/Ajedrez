package PrimeraVersion;

/**
 * Posicion: Clase que genera posiciones mediante filas y columnas, para asignarselas al tablero y los movimientos
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Posicion {

    /**
     * Atributo: eje y
     */
    private int fila;
    /**
     * Atributo: eje x
     */
    private int columna;

    /**
     * Constructor por defecto
     * @param fila
     * @param columna
     */
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    /**
     * Getter de fila
     * @return fila
     */
    public int getFila() {
        return fila;
    }
    /**
     * Setter de fila
     * @param fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }
    /**
     * Getter de columna
     * @return columna
     */
    public int getColumna() {
        return columna;
    }
    /**
     * Setter de columna
     * @param columna
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * Método toString, que devuelve en texto la posición
     * @return
     */
    @Override
    public String toString() {
        return "Posicion{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
