package Tipos_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Palabra_buscar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int posiciones = 0;
        ArrayList listaCosas = new ArrayList();


        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("hola");
        listaCosas.add("true");
        listaCosas.add(34567);
        listaCosas.add("Fernando");
        listaCosas.add("Borja");

        //Pedir palabra por pantalla y guardarla en una variable
        System.out.println("dime un nombre para buscar: ");
        String nombre = in.next();

        //Compara con la palabra pedida por teclado, si es igual te lo dice y te pone la posicion, sino, no hace nada
        for (Object item : listaCosas) {
            if (item.equals(nombre)) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posicion " + posiciones);
            }
            posiciones++;
        }

        //Me muestra la ArrayList en pantalla ordenada con (1 - Ejemplo)
        System.out.println("");
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i + 1 + " - " + listaCosas.get(i));

        }

    }
}
