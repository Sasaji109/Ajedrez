package Prueba;

public class EmpleadoApp {

    public static void main(String[] args) {

        Empleado tablero[][]=new Empleado[8][8];

        int fila = 0;
        int columna = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = new Empleado(fila, columna);
                columna ++;
            }
            fila++;
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(tablero[i][j]);
            }
            System.out.print("\n");
        }


    }

}
