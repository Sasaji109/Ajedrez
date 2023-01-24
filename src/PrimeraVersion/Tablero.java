package PrimeraVersion;

public class Tablero {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Pieza tablero[][];

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

}
