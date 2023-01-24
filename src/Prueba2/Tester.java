package Prueba2;

public class Tester {

    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Figura listadoFiguras[][] = new Figura[2][2];

        listadoFiguras[0][0] = new Figura(" T1 ", "blanco");
        listadoFiguras[0][1] = new Figura(" T2 ", "blanco");
        listadoFiguras[1][1] = new Figura(" T4 ", "negro");


        for (int i = 0; i < listadoFiguras.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ANSI_WHITE + listadoFiguras[i][j] + ANSI_RESET);
            }
            System.out.print("\n");
        }

    }
}
