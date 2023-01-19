package PrimeraVersion;

public class Movimiento {

    //Atributos
    private Posicion posInicial;
    private Posicion posFinal;

    //Constructores
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    //Métodos
    public static boolean esVertical() {
        return false;
    }

    public static boolean esHorizontal() {
        return false;
    }

    public static boolean esDiagonal() {
        return false;
    }

    public static int saltoHorizontal() {
        return 0;
    }

    public static int saltoVertical() {
        return 0;
    }

}
