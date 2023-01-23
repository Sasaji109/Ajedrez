package VersionGuia;

public class Movimiento {

    private Posicion posInicial;
    private Posicion posFinal;

    public Movimiento() {

    }

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public boolean esVertical() {
        return false;
    }

    public boolean esHorizontal() {
        return false;
    }

    public boolean esDiagonal() {
        return false;
    }

    public int saltoHorizontal() {
        return 0;
    }

    public int saltoVertical() {
        return 0;
    }
}
