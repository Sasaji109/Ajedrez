package PrimeraVersion;

/**
 * Caballo: Clase de la pieza hija Caballo
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Caballo extends Pieza {

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Caballo(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     * @param colorP
     */
    public Caballo(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Caballo
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        if ((Math.abs(mov.saltoHorizontal()) == 1 && Math.abs(mov.saltoVertical()) == 2) || (Math.abs(mov.saltoHorizontal()) == 2 && Math.abs(mov.saltoVertical()) == 1)) {
            return true;
        } else {
            return false;
        }
    }
}
