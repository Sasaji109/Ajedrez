package PrimeraVersion;

public class Juego {

    private boolean Turno; //false negras, true blancas

    //Constructor
    public Juego(boolean turno) {
        Turno = turno;
    }

    //Getter y Setter
    public boolean isTurno() {
        return Turno;
    }
    public void setTurno(boolean turno) {
        Turno = turno;
    }

    //Métodos
    public String toString() {
        String cadena = "Blancas";
        if (Turno == false)
            cadena = "Negras";
        return cadena;
    }

    public Movimiento validar(String jugada, Tablero tablero) {
        return null;
    }



}
