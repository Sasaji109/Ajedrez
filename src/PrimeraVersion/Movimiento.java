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
        int diferF = saltoVertical();
        int diferC = saltoHorizontal();
        diferF=Math.abs(diferF);
        diferC=Math.abs(diferC);
        if (diferF == diferC) {
            respuesta = true;
        }
        return respuesta;
        //return Math.abs(saltoHorizontal())==Math.abs(saltoVertical());

    } //absoluto llamando a los de las abajo



    public int saltoHorizontal() {
        return posInicial.getColumna() - posFinal.getColumna();
    }

    public int saltoVertical() {
        return posInicial.getFila() - posFinal.getFila();
    }

}
