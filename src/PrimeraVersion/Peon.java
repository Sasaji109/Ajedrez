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
     * @param color
     * @param nombre
     */
    public Peon(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     * @param colorP
     */
    public Peon(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Peon
     * @param mov
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) { /*
        if (columna varía) {
            return false;
        } else if (filas no son iguales) {

        }

        if (color = negro) {
            if () {

            } else {
                return false;
            }
        } else { //color = blanco
            if () {

            } else {
                return false;
            }
        } */
        return true;
    }
}
