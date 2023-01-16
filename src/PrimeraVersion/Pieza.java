package PrimeraVersion;

public class Pieza {

    //Atributos
    private String color;
    private String nombre;

    //Constructores
    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public boolean validoMovimiento (Movimiento mov) {
        boolean respuesta = false;
        if (mov.esVertical() || mov.esVertical())
            respuesta = true;
        return respuesta;
    }

    public boolean validoMovimiento (Movimiento mov) {
        return mov.esVertical() || mov.esVertical();
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
