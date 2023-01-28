package PrimeraVersion;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego(true);
        Movimiento mov = null;
        int fin = 0;

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

            //if (mov != null)
            //preguntar al tablero a la pieza que hay en la posicion inicial si puede realizar movimiento
            //si es que sí, mover en el tablero

            if (juego.equals(true)) {
                juego.setTurno(false);
            } else {
                juego.setTurno(true);
            } //cambiar turno

        } while (fin == 0);



    }
}