package PrimeraVersion;

/**
 * Dama: Clase de la pieza hija Dama
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Dama extends Pieza {

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Dama(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     * @param colorP
     */
    public Dama(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Dama
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        return mov.esVertical() || mov.esHorizontal() || mov.esDiagonal();
    }
}
