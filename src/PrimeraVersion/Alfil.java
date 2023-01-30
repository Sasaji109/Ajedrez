package PrimeraVersion;

/**
 * Alfil: Clase de la pieza hija Alfil
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Alfil extends Pieza {

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Alfil(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     * @param colorP
     */
    public Alfil(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Alfil
     * @param mov
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esDiagonal();
    }
}
