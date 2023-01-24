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
    public boolean esVertical() {
        boolean respuesta = false;
        if (posInicial.getColumna() == posFinal.getColumna()) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean esHorizontal() {
        boolean respuesta = false;
        if (posInicial.getFila() == posFinal.getFila()) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean esDiagonal() {
        boolean respuesta = false;
        int diferF = posInicial.getFila() - posFinal.getFila();
        int diferC = posInicial.getColumna() - posFinal.getColumna();
        Math.abs(diferF);
        Math.abs(diferC);
        if (diferF == diferC) {
            respuesta = true;
        }
        return respuesta;
    } //absoluto llamando a los de las abajo



    public int saltoHorizontal() {
        return 0;
    }

    public int saltoVertical() {
        return 0;
    }

}
