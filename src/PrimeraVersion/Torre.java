package PrimeraVersion;

/**
 * Torre: Clase de la pieza hija Torre
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Torre extends Pieza {

    /**
     * Atributo para corroborar que la pieza se ha movido
     */
    private boolean semovio;

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Torre(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor para confirmar color y si se ha movido
     * @param colorP
     * @param semovio
     */
    public Torre(String colorP, boolean semovio) {
        super(colorP);
        this.semovio = semovio;
    }

    /**
     * Método para validad los movimientos del Torre
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov,Tablero tablero) {
        return mov.esVertical() || mov.esHorizontal();

    }
}
