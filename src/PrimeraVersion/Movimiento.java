package PrimeraVersion;

/**
 * Movimiento: Clase que genera movimientos
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Movimiento {

    /**
     * Atributo: posición inicial
     */
    private Posicion posInicial;
    /**
     * Atributo: posición final
     */
    private Posicion posFinal;

    /**
     * Constructor por defecto
     * @param posInicial
     * @param posFinal
     */
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    /**
     * Método que pregunta si el movimiento que se ha realizado ha sido vertical
     * @return respuesta
     */
    public boolean esVertical() {
        boolean respuesta = false;
        if (posInicial.getColumna() == posFinal.getColumna()) {
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Método que pregunta si el movimiento que se ha realizado ha sido horizontal
     * @return respuesta
     */
    public boolean esHorizontal() {
        boolean respuesta = false;
        if (posInicial.getFila() == posFinal.getFila()) {
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Método que pregunta si el movimiento que se ha realizado ha sido diagonal
     * @return respuesta
     */
    public boolean esDiagonal() {
        boolean respuesta = false;
        int diferF = saltoVertical();
        int diferC = saltoHorizontal();
        diferF = Math.abs(diferF);
        diferC = Math.abs(diferC);
        if (diferF == diferC) {
            respuesta = true;
        }
        return respuesta;
        //return Math.abs(saltoHorizontal()) == Math.abs(saltoVertical());
    }

    /**
     * Método que nos confirma el salto horizontal realizado por una pieza
     * @return
     */
    public int saltoHorizontal() {
        return posInicial.getColumna() - posFinal.getColumna();
    }

    /**
     * Método que nos confirma el salto vertical realizado por una pieza
     * @return
     */
    public int saltoVertical() {
        return posInicial.getFila() - posFinal.getFila();
    }

    /**
     * Método toString, que devuelve en texto el movimiento
     * @return
     */
    @Override
    public String toString() {
        return "Movimiento{" +
                "posInicial=" + posInicial +
                ", posFinal=" + posFinal +
                '}';
    }
}
