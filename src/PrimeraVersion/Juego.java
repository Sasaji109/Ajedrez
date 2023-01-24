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
        int filaInicial,filaFinal,columnaInicial,columnaFinal;
        jugada = jugada.toUpperCase();
        char[] letras = jugada.toCharArray();
        /*for (int i = 0; i < jugada.length(); i++) {
            letras[i] = jugada.charAt(i);
        }*/
        if (jugada.length()!=4)
            System.out.println("Error: la jugada tiene que ser del tipo a2a3");
        else if (letras[0]<'A' || letras[0]>'H') {//, || con los otros tres char más errores
            System.out.println("Error: debe estar entre A y H, y 1 y 8");
        }else{  //tablero
            filaInicial = letras[1]-49;//para que se queda de 0..7, al tener el ascii >=49
            columnaInicial = letras[0]-65;//para que se queda de 0..7, al tener el ascii >=49
            //haz lo mismo con la final
            if(tablero.tablero[filaInicial][columnaInicial]==null){
                System.out.println("Error: no hay pieza en posición inicial");


            } else if(true) { //más errores del tablero

            }
            else{//ya no hay errores

                    mov = new Movimiento(new Posicion(filaInicial,columnaInicial), new Posicion(filaFinal,columnaFinal))
            }


        }

        return mov;
    }



}
