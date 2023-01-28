package PrimeraVersion;

public class Dama extends Pieza {

    public Dama(String color, String nombre) {
        super(color, nombre);
    }

    public Dama(String colorP) {
        super(colorP);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
