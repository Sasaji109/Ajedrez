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

        Movimiento mov = null;
        int filaInicial, columnaInicial, filaFinal, columnaFinal;
        jugada = jugada.toUpperCase(); // Pasarlo a mayúscula para trabajar solo con mayúsculas
        char[] letras = jugada.toCharArray(); //Recorrer con toCharArray la jugada, sacando las 4 letras

        if (jugada.length()!=4) {
            System.out.println("Error: la jugada tiene que ser del tipo a2a3");
        } else if (letras[0]<'A' || letras[0]>'H' || letras[1]<'1' || letras[1]>'8' || letras[2]<'A' || letras[2]>'H' || letras[3]<'1' || letras[3]>'8') {
            System.out.println("Error: debe estar entre A y H, y 1 y 8");
        } else {  //tablero

            filaInicial = letras[0]-49;//para que se queda de 0..7, al tener el ascii >=49
            columnaInicial = letras[1]-65;//para que se queda de 0..7, al tener el ascii >=49
            filaFinal = letras[2]-49;//para que se queda de 0..7, al tener el ascii >=49
            columnaFinal = letras[3]-65;//para que se queda de 0..7, al tener el ascii >=49

            //https://www.delftstack.com/es/howto/java/how-to-convert-character-to-ascii-numeric-value-in-java/

            if (tablero.tablero[filaInicial][columnaInicial]==null) {
                System.out.println("Error: no hay pieza en posición inicial");
            } else if(tablero.tablero[filaFinal][columnaFinal]==null) {
                System.out.println("Error: no hay pieza en posición final");
            } else if(Turno == false) { // && color de pieza blanca
                System.out.println("Error: el color de la pieza no coincide con el turno");
            } else if(Turno == true) { // && color de pieza negra
                System.out.println("Error: el color de la pieza no coincide con el turno");
            } else { //ya no hay errores
                mov = new Movimiento(new Posicion(filaInicial,columnaInicial), new Posicion(filaFinal,columnaFinal));
            }
        }
        return mov;
    }

}
