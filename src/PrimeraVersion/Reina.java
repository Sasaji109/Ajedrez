package PrimeraVersion;

public class Reina extends Pieza {

    public Reina(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
