package PrimeraVersion;

public class Tablero {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Pieza tablero[][] = new Pieza[8][8];

    public Tablero() {
        tablero[0][0] = new Torre("negro", "T");
        tablero[0][1] = new Caballo("negro", "C");
        tablero[0][2] = new Alfil("negro", "A");
        tablero[0][3] = new Dama("negro", "D");
        tablero[0][4] = new Rey("negro", "R");
        tablero[0][5] = new Alfil("negro", "A");
        tablero[0][6] = new Caballo("negro", "C");
        tablero[0][7] = new Torre("negro", "T");
        tablero[7][0] = new Torre("blanco", "T");
        tablero[7][1] = new Caballo("blanco", "C");
        tablero[7][2] = new Alfil("blanco", "A");
        tablero[7][3] = new Dama("blanco", "D");
        tablero[7][4] = new Rey("blanco", "R");
        tablero[7][5] = new Alfil("blanco", "A");
        tablero[7][6] = new Caballo("blanco", "C");
        tablero[7][7] = new Torre("blanco", "T");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 1) {
                    tablero[i][j] = new Peon("negro", "P");;
                }
                if (i == 6) {
                    tablero[i][j] = new Peon("blanco", "P");;
                }
            }
        }

    }

    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("[ ]");
                }
                else if (i == 0 | i == 1) {
                        System.out.print(ANSI_BLACK + "[" + tablero[i][j] + "]" + ANSI_RESET);
                    }
                else if (i == 6 | i == 7) {
                        System.out.print(ANSI_WHITE + "[" + tablero[i][j] + "]" + ANSI_RESET);
                    }
                }
            }
            System.out.print("\n");
        }

}
