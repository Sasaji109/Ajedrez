package PrimeraVersion;

/**
 * Pieza: Clase que genera piezas, con su propio color y nombre
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public abstract class Pieza {

    /**
     * Atributo: color de la pieza
     */
    private String color;
    /**
     * Atributo: nombre de la pieza
     */
    private String nombre;

    /**
     * Constructor por defecto
     * @param color
     * @param nombre
     */
    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    /**
     * Constructor que asigna un sufijo a cada pieza para especificar su color
     * @param colorP
     */
    public Pieza(String colorP) {
        color = colorP;
        if (color.equals("negro"))
            nombre = this.getClass().getSimpleName().charAt(0)+"n";
        else
            nombre = this.getClass().getSimpleName().charAt(0)+"b";
    }

    /**
     * Getter de color
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * Getter de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método abstracto para validad los movimientos de cada pieza por separado
     * @param mov
     * @param tablero
     * @return
     */
    public abstract boolean validoMovimiento (Movimiento mov,Tablero tablero);

    /**
     * Método toString, que devuelve en texto la pieza
     * @return
     */
    @Override
    public String toString() {
        return nombre;
    }
}
