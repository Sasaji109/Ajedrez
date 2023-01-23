package VersionGuia;

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
        tablero[1][0] = new Peon("negro", "P");
        tablero[1][1] = new Peon("negro", "P");
        tablero[1][2] = new Peon("negro", "P");
        tablero[1][3] = new Peon("negro", "P");
        tablero[1][4] = new Peon("negro", "P");
        tablero[1][5] = new Peon("negro", "P");
        tablero[1][6] = new Peon("negro", "P");
        tablero[1][7] = new Peon("negro", "P");

        tablero[6][0] = new Peon("blanco", "P");
        tablero[6][1] = new Peon("blanco", "P");
        tablero[6][2] = new Peon("blanco", "P");
        tablero[6][3] = new Peon("blanco", "P");
        tablero[6][4] = new Peon("blanco", "P");
        tablero[6][5] = new Peon("blanco", "P");
        tablero[6][6] = new Peon("blanco", "P");
        tablero[6][7] = new Peon("blanco", "P");
        tablero[7][0] = new Torre("blanco", "T");
        tablero[7][1] = new Caballo("blanco", "C");
        tablero[7][2] = new Alfil("blanco", "A");
        tablero[7][3] = new Dama("blanco", "D");
        tablero[7][4] = new Rey("blanco", "R");
        tablero[7][5] = new Alfil("blanco", "A");
        tablero[7][6] = new Caballo("blanco", "C");
        tablero[7][7] = new Torre("blanco", "T");
    }

    public void pintarTablero() {


        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 2; j++) {
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

    public boolean hayPieza(int fila,int columna) {

        return false;
    }
    public boolean hayPieza(Posicion pos) {

        return false;
    }
    public boolean hayPiezasEntre(Movimiento mov) {

        return false;
    }
    public void ponPieza(Pieza figura, int fila, int columna) {

    }
    public void ponPieza(Pieza figura, Posicion Pos) {

    }
    public void quitaPieza(int fila,int columna) {

    }
    public void QuitaPieza(Posicion pos) {

    }
    public Pieza DevuelvePieza(int fila,int columna){
        return null;
    }
    public Pieza DevuelvePieza(Posicion pos) {

        return null;
    }


}
