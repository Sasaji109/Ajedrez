package PrimeraVersion;

public class Torre extends Pieza {

    public Torre(String color, String nombre) {
        super(color, nombre);
    }

    public Torre(String colorP) {
        super(colorP);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal();
    }


}
