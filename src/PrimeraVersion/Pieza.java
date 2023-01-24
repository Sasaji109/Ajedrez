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

    public Pieza(String colorP) {
        color = colorP;
        if (color.equals("colorP"))
            nombre = this.getClass().getSimpleName().charAt(0)+"n";
        else
            nombre = this.getClass().getSimpleName().charAt(0)+"b";
    }

    //Getters
    public String getColor() {
        return color;
    }
    public String getNombre() {
        return nombre;
    }

    //Métodos
    public abstract boolean validoMovimiento (Movimiento mov);

    @Override
    public String toString() {
        return nombre;
    }
}
