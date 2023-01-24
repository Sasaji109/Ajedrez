package PrimeraVersion;

public class Tablero {

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
            for (int j = 0; j < 8; j++) {
                if (i == 1) {
                    tablero[i][j] = new Peon("negro", "P");
                }
                if (i == 6) {
                    tablero[i][j] = new Peon("blanco", "P");
                }
            }
        }

    }

    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("[ ]");
                }
                else {
                    System.out.print("[" + tablero[i][j] + "]");
                }
            }
            System.out.print("\n");
        }
    }

}
