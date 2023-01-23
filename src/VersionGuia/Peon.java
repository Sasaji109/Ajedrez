package VersionGuia;

public class Peon extends Pieza {

    public Peon(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }

}
