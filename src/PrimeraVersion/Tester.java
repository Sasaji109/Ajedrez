package PrimeraVersion;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Tablero tablero = new Tablero();
        Juego juego = new Juego(true);

        Movimiento mov = null;

        //Bucle de juego

        do {
            tablero.pintarTablero();
            System.out.println("Turno de:" + juego + ": Introduce jugada.");
            String jugada = lector.nextLine();
            //traducir jugada->movimiento válido, si no es válido que devuelva null
            mov = juego.validar(jugada, tablero);

        }while(mov==null);

        //if (mov != null)
        //preguntar al tablero a la pieza que hay en la posicion inicial si puede realizar movimiento
        //si es que sí, mover en el tablero
        //cambiar turno
        // volver a pedir a jugada
    }
}



//Convertir char en int, dos primeros valores para posicion inicial, los dos ultimos para
//posicion final. Crear movimiento, con sendas posiciones. Validar esa jugada, metodo que
//se encuentra en Juego.