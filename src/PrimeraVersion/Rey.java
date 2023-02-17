package PrimeraVersion;

/**
 * Rey: Clase de la pieza hija Rey
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Rey extends Pieza {

    /**
     * Atributo para corroborar que la pieza se ha movido
     */
    private boolean semovio;

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     * @param semovio
     */
    public Rey(String color, String nombre, boolean semovio) {
        super(color, nombre);
        this.semovio = semovio;
    }

    /**
     * Constructor para confirmar color y si se ha movido
     * @param colorP
     * @param semovio
     */
    public Rey(String colorP, boolean semovio) {
        super(colorP);
        this.semovio = semovio;
    }

    /**
     * Getter del atributo semovio
     * @return
     */
    public boolean isSemovio() {
        return semovio;
    }

    /**
     * Setter del atributo semovio
     * @param semovio
     */
    public void setSemovio(boolean semovio) {
        this.semovio = semovio;
    }


    /**
     * Método para validad los movimientos del Rey
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        if (Math.abs(mov.saltoVertical()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 || (Math.abs(mov.saltoHorizontal()) == 1 && Math.abs(mov.saltoHorizontal()) == 1)) {
            setSemovio(true);
            return true;
        } else if (semovio = false && Math.abs(mov.saltoHorizontal()) == 2) {
                return true;
                } else {
                    return false;
                }
    }
}
