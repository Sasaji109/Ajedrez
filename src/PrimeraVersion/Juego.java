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
        String cadena = "blanco";
        if (Turno == false)
            cadena = "negro";
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

            filaInicial = letras[1]-49;//para que se queda de 0..7, al tener el ascii >=49
            columnaInicial = letras[0]-65;//para que se queda de 0..7, al tener el ascii >=49
            filaFinal = letras[3]-49;//para que se queda de 0..7, al tener el ascii >=49
            columnaFinal = letras[2]-65;//para que se queda de 0..7, al tener el ascii >=49

            if (tablero.hayPieza(filaInicial,columnaInicial)==false) { //!tablero.hayPieza(filaInicial,columnaInicial)
                System.out.println("Error: no hay pieza en posición inicial");
            } else if ((tablero.tablero[filaFinal][columnaFinal]!=null) && (tablero.tablero[filaFinal][columnaFinal].getColor().equals(this.toString()))) {
                System.out.println("Error: la casilla donde quieres llevarlo ya está ocupada");
            } else if ((tablero.tablero[filaInicial][columnaInicial]!=null) && (!tablero.tablero[filaInicial][columnaInicial].getColor().equals(this.toString()))) { // && color !=turno
                System.out.println("Error: el color de la pieza no coincide con el turno");
            } else { //ya no hay errores
                mov = new Movimiento(new Posicion(filaInicial,columnaInicial), new Posicion(filaFinal,columnaFinal));
            }
        }
        return mov;
    }

}
