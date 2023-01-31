package PrimeraVersion;

/**
 * Peon: Clase de la pieza hija Peon
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Peon extends Pieza {

    /**
     * Constructor por defecto
     *
     * @param color
     * @param nombre
     */
    public Peon(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     *
     * @param colorP
     */
    public Peon(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Peón
     *
     * @param mov
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {

        if (getColor() == "negro") {

            if (mov.getPosInicial().getFila() == 1 && mov.esVertical() && (mov.saltoVertical()==-1 || mov.saltoVertical()==-2) && !tablero.hayPieza(mov.getPosFinal())) {
                return true;
            } else if (mov.getPosInicial().getFila() != 1 && mov.esVertical() && mov.saltoVertical()==1 && !tablero.hayPieza(mov.getPosFinal())) {
                return true;
                } else {return false;}

        } else if (mov.getPosInicial().getFila() == 6 && mov.esVertical() && (mov.saltoVertical()==1 || mov.saltoVertical()==2) && !tablero.hayPieza(mov.getPosFinal())) {
                return true;
            } else if (mov.getPosInicial().getFila() != 6 && mov.esVertical() && mov.saltoVertical()==1 && !tablero.hayPieza(mov.getPosFinal())) {
                return true;
                } else {return false;}
    }
}
