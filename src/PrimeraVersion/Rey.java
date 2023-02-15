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
     * Metodo para comprobar la posiblidad del enroque
     * @param mov
     * @param tablero
     * @return
     */
    private boolean enroque(Movimiento mov, Tablero tablero) {
        if (getColor().equals("negro")) {
            if (mov.getPosInicial().getFila() == 3 && mov.getPosInicial().getColumna() == 3) {
                return true;
            }
        } else if (mov.getPosInicial().getFila() == 3 && mov.getPosInicial().getColumna() == 3) {
            return true;
        }
        return false;
    }


    /**
     * Método para validad los movimientos del Rey
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        if (Math.abs(mov.saltoVertical()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 || (Math.abs(mov.saltoHorizontal()) == 1 && Math.abs(mov.saltoHorizontal()) == 1))
                return true;
        else if (enroque() == true) {
            return true;
        }
        return false;
    }
}
