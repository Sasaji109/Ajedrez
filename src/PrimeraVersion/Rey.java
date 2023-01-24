package PrimeraVersion;

public class Rey extends Pieza {

    public Rey(String color, String nombre) {
        super(color, nombre);
    }

    public Rey(String colorP) {
        super(colorP);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }


}
