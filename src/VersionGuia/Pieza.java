package VersionGuia;

public abstract class Pieza {

    private String color;
    private String nombre;

    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }
    public String getNombre() {
        return nombre;
    }

    public abstract boolean validoMovimiento(Movimiento mov);

    @Override
    public String toString() {
        return nombre;
    }

}


