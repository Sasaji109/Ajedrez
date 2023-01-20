package Prueba;

public class Tester {

    public static void main(String[] args) {

        //Nombre Clase + Nombre Asignado + [] = new Nombre Clase + [Dimension]
        //Primero creamos un array de objetos
        Persona listadoPersona[] = new Persona[3];

        //Segundo introducimos los datos de los objetos ya creados
        listadoPersona[0] = new Persona ("Pepe",26,1.73);
        listadoPersona[1] = new Persona ("Marta",52,1.57);
        listadoPersona[2] = new Persona ("Alex",83,1.65);

        //Tercero recorremos el array de objetos a través de un bucle
        for (int i = 0; i < listadoPersona.length; i++) {
            System.out.println(listadoPersona[i]);
        }
    }

}
