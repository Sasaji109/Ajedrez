package VersionGuia;

public class Caballo extends Pieza {

    public Caballo(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
