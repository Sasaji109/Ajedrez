package PrimeraVersion;
/**
 * Tablero: Clase para generar el tablero y gestionar las piezas.
 *
 * @author Samuel Sánchez Jiménez
 * @version 29.1.2023
 */
public class Tablero {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Pieza tablero[][];

    /**
     * Constructor del Tablero
     */
    public Tablero() {

        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre("negro");
        tablero[0][1] = new Caballo("negro");
        tablero[0][2] = new Alfil("negro");
        tablero[0][3] = new Dama("negro");
        tablero[0][4] = new Rey("negro");
        tablero[0][5] = new Alfil("negro");
        tablero[0][6] = new Caballo("negro");
        tablero[0][7] = new Torre("negro");
        tablero[7][0] = new Torre("blanco");
        tablero[7][1] = new Caballo("blanco");
        tablero[7][2] = new Alfil("blanco");
        tablero[7][3] = new Dama("blanco");
        tablero[7][4] = new Rey("blanco");
        tablero[7][5] = new Alfil("blanco");
        tablero[7][6] = new Caballo("blanco");
        tablero[7][7] = new Torre("blanco");

        for (int j = 0; j < tablero[0].length; j++) {
            tablero[1][j] = new Peon("negro");
            tablero[6][j] = new Peon("blanco");
        }
    }

    /**
     * Pinta el tablero con corchetes y colores
     */
    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("[  ]");
                } else if (i == 0 | i == 1) {
                    System.out.print(ANSI_BLACK + "[" + tablero[i][j] + "]" + ANSI_RESET);
                } else if (i == 6 | i == 7) {
                    System.out.print(ANSI_WHITE + "[" + tablero[i][j] + "]" + ANSI_RESET);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /**
     * Comprueba si hay pieza en la fila y columna indicadas
     * @param fila
     * @param columna
     * @return <ul>
     * <li>true: hay pieza</li>
     * <li>false: no hay pieza</li>
     * </ul>
     */
    public boolean hayPieza(int fila,int columna) {
        if (tablero[fila][columna] == null) {
            return false;
        }
        return true;
    }

    /**
     * Comprueba si hay pieza en la posición indicada
     * @param pos
     * @return hayPieza
     */
    public boolean hayPieza(Posicion pos) {
        return hayPieza(pos.getFila(),pos.getColumna());
    }

    /**
     * Comprueba si hay hay piezas entre las dos posiciones indicadas
     * @param mov
     * @return <ul>
     * <li>true: hay piezas</li>
     * <li>false: no hay piezas</li>
     * </ul>
     */
    public boolean hayPiezasEntre(Movimiento mov) {
        return true;
    }

    /**
     * Pone una figura concreta en la fila y columna indicadas
     * @param figura
     * @param fila
     * @param columna
     */
    public void ponPieza(Pieza figura, int fila, int columna) {
        tablero[fila][columna] = figura;
    }

    /**
     * Pone una figura concreta en la posición indicada
     * @param figura
     * @param pos
     */
    public void ponPieza(Pieza figura, Posicion pos) {
        ponPieza(figura, pos.getFila(), pos.getColumna());
    }

    /**
     * Quita la figura en la fila y columna indicadas
     * @param fila
     * @param columna
     */
    public void quitaPieza(int fila,int columna) {
        tablero[fila][columna] = null;
    }

    /**
     * Quita la figura en la posición indicado
     * @param pos
     */
    public void quitaPieza(Posicion pos) {
        quitaPieza(pos.getFila(), pos.getColumna());
    }

    /**
     * Devuelve la pieza que se encuentra en la fila y columna indicadas
     * @param fila
     * @param columna
     * @return tablero[][]
     */
    public Pieza DevuelvePieza(int fila, int columna) {return tablero[fila][columna];}

    /**
     * Devuelve la pieza que se encuentra en la posición indicada
     * @param pos
     * @return
     */
    public Pieza DevuelvePieza(Posicion pos) {return DevuelvePieza(pos.getFila(), pos.getColumna());}
}
