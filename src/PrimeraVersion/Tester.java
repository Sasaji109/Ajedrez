package PrimeraVersion;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Tablero tablero = new Tablero();
        Juego juego = new Juego(true);

        //Bucle de juego
        tablero.pintarTablero();
        System.out.println("Turno de:" + juego + ": Introduce jugada.");
        String jugada = lector.nextLine();

        //traducir jugada->movimiento válido, si no es válido que devuelva null
        Movimiento mov = juego.validar(jugada,tablero);
        if (mov != null);
        //preguntar al tablero a la pieza que hay en la posicion inicial si puede realizar movimiento
    }
}
