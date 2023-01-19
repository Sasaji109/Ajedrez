package PrimeraVersion;

public abstract class Pieza {

    //Atributos
    private String color;
    private String nombre;

    //Constructores
    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    //Getters
    public String getColor() {
        return color;
    }
    public String getNombre() {
        return nombre;
    }

    public abstract boolean validoMovimiento (Movimiento mov);
}
