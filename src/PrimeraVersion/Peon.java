package PrimeraVersion;

public class Peon extends Pieza {

    public Peon(String color, String nombre) {
        super(color, nombre);
    }

    public Peon(String colorP) {
        super(colorP);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
