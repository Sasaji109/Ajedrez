package PrimeraVersion;

public class Alfil extends Pieza {

    public Alfil(String color, String nombre) {
        super(color, nombre);
    }

    public Alfil(String colorP) {
        super(colorP);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esDiagonal();
    }


}
