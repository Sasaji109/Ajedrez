package PrimeraVersion;

/**
 * Torre: Clase de la pieza hija Torre
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Torre extends Pieza {

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Torre(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     * @param colorP
     */
    public Torre(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Torre
     * @param mov
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal();
    }
}
