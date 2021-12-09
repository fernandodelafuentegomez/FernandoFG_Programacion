package Tipos_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {

    //propiedad si no tiene parentesis y si los tiene es un metodo

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Lista para cualquier tipo <OBJECT>
        ArrayList listaCosas = new ArrayList();

        //Para poder ver su tamaño
        int tamanio = listaCosas.size();
        System.out.println(tamanio);

        //añado un elemento a la lista
        listaCosas.add(5);
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("Borja");
        listaCosas.add("Fernando");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        System.out.println(listaCosas);

        //Nombrar un String de la lista y que lo saque en pantalla
        String palabra = String.valueOf(listaCosas.get(1));
        System.out.println("El valor es: " + palabra);

        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("hola");
        listaCosas.add("true");
        listaCosas.add(34567);

        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i + 1 + " - " + listaCosas.get(i));

        }


        /*int posiciones = 1;
        for (Object item : listaCosas) {
            System.out.println(posiciones + "-" + item);
            posiciones++;
        }*/

        //para sacar la palabra que busco y me diga la posicion
        int posiciones = 0;
        for (Object item : listaCosas) {

            if (item.equals("Borja")) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posicion " + posiciones);
            }
            posiciones++;
        }

        System.out.println("dime un nombre para buscar: ");
        String nombre = in.next();

        for (Object item : listaCosas) {
            if (item.equals(nombre)) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posicion " + posiciones);
            }
            posiciones++;
        }
    }
}
