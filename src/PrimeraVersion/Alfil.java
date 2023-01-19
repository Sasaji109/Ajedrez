package PrimeraVersion;

public class Alfil extends Pieza {

    public Alfil(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
