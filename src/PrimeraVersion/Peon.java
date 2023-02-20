package PrimeraVersion;

import java.util.Scanner;

/**
 * Peon: Clase de la pieza hija Peon
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Peon extends Pieza {

    /**
     * Constructor por defecto
     *
     * @param color
     * @param nombre
     */
    public Peon(String color, String nombre) {
        super(color, nombre);
    }

    /**
     * Constructor pata confirmar color
     *
     * @param colorP
     */
    public Peon(String colorP) {
        super(colorP);
    }

    /**
     * Método para validad los movimientos del Peón
     *
     * @param mov
     * @param tablero
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        Scanner lector = new Scanner(System.in);
        if (getColor().equals("negro")) {
            if (mov.getPosFinal().getFila() == 7) {
                System.out.println("¿A qué pieza deseas promocionar el peón, al caballo, al alfil, a la torre o a la dama?");
                int op = 0;
                do {
                    String opcion = lector.nextLine();
                    System.out.println(Integer.parseInt(opcion));
                    switch (opcion) {
                        case "caballo":
                            tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Caballo(this.getColor());
                            break;
                        case "alfil":
                            tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Alfil(this.getColor());
                            break;
                        case "torre":
                            tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Torre(this.getColor(),true);
                            break;
                        case "dama":
                            tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Dama(this.getColor());
                            break;
                        default:
                            System.out.println("El nombre introducido es incorrecto");
                            op = 1;
                            break;
                    }
                } while (op == 1);
                tablero.quitaPieza(mov.getPosInicial());
            } else if (mov.esDiagonal() && mov.saltoVertical() == -1 && (mov.saltoHorizontal() == -1 || mov.saltoHorizontal() == 1)) {
                return true;
            } else if (mov.getPosInicial().getFila() == 1 && mov.esVertical() && (mov.saltoVertical() == -1 || mov.saltoVertical() == -2) && !tablero.hayPieza(mov.getPosFinal())) {
                return true;
            } else if (mov.getPosInicial().getFila() != 1 && mov.esVertical() && mov.saltoVertical() == -1 && !tablero.hayPieza(mov.getPosFinal())) {
                return true;
            } else {return false;}
        } else if (mov.getPosFinal().getFila() == 0) {
            System.out.println("¿A qué pieza deseas promocionar el peón, al caballo, al alfil, a la torre o a la dama?");
            int op = 0;
            do {
                String opcion = lector.nextLine();
                switch (opcion) {
                    case "caballo":
                        tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Caballo(this.getColor());
                        break;
                    case "alfil":
                        tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Alfil(this.getColor());
                        break;
                    case "torre":
                        tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Torre(this.getColor(),true);
                        break;
                    case "dama":
                        tablero.tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = new Dama(this.getColor());
                        break;
                    default:
                        System.out.println("El nombre introducido es incorrecto");
                        op = 1;
                        break;
                }
            } while (op == 1);
            tablero.quitaPieza(mov.getPosInicial());
        } else if (mov.esDiagonal() && mov.saltoVertical() == 1 && (mov.saltoHorizontal() == -1 || mov.saltoHorizontal() == 1)) {
            return true;
        } else if (mov.getPosInicial().getFila() == 6 && mov.esVertical() && (mov.saltoVertical() == 1 || mov.saltoVertical() == 2) && !tablero.hayPieza(mov.getPosFinal())) {
            return true;
        } else if (mov.getPosInicial().getFila() != 6 && mov.esVertical() && mov.saltoVertical() == 1 && !tablero.hayPieza(mov.getPosFinal())) {
            return true;
        } else {return false;}
        return false;
    }
}
