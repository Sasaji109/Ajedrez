package PrimeraVersion;

/**
 * Rey: Clase de la pieza hija Rey
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Rey extends Pieza {

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Rey(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     * @param colorP
     */
    public Rey(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Rey
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        if (Math.abs(mov.saltoHorizontal()) == 1 && mov.esVertical()
                || (Math.abs(mov.saltoHorizontal()) == 1 && mov.saltoVertical() == 1))//falta diagonal
                return true;
        else
            return false;
    }
}
