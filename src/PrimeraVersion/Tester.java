package PrimeraVersion;

import java.util.Scanner;

/**
 * Tester: Clase para probar el juego
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Tester {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego(true);
        Movimiento mov = null;
        boolean fin = false;

        //Bucle de juego
        do {
            do {
                tablero.pintarTablero();
                System.out.println("Turno de: " + juego + ": Introduce jugada.");
                String jugada = lector.nextLine();
                //traducir jugada->movimiento válido, si no es válido que devuelva null
                mov = juego.validar(jugada, tablero);

            } while (mov == null);

            System.out.println(mov);
            if (tablero.DevuelvePieza(mov.getPosInicial()).validoMovimiento(mov,tablero) && !tablero.hayPiezasEntre(mov)) {
                tablero.enroque(mov, juego.isTurno());
                tablero.mover(mov);
                if (juego.isTurno()) {
                    juego.setTurno(false);
                } else {
                    juego.setTurno(true);
                }
            }else
                System.out.println("La pieza no puede realizar ese movimiento");
        } while (fin == false);



    }
}