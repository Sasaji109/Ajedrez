package PrimeraVersion;

public class Torre extends Pieza {

    public Torre(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
