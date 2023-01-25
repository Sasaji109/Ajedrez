package PrimeraVersion;

public class Caballo extends Pieza {

    public Caballo(String color, String nombre) {
        super(color, nombre);
    }

    public Caballo(String colorP) {
        super(colorP);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
