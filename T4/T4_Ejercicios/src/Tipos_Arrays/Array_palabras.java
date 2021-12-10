package Tipos_Arrays;

import java.util.ArrayList;

public class Array_palabras {

    public static void main(String[] args) {

        ArrayList <String> ListaPalabras = new ArrayList();

        ListaPalabras.add("Fernando");
        ListaPalabras.add("Luismi");
        ListaPalabras.add("Mario");
        ListaPalabras.add("Alvaro");
        ListaPalabras.add("Andrea");
        ListaPalabras.add("Nicolas");
        ListaPalabras.add("Dani");
        ListaPalabras.add("Dani.mar");
        ListaPalabras.add("Zama");
        ListaPalabras.add("Arturo");


        for (int i = 0; i < ListaPalabras.size(); i++) {
            System.out.println(i + 1 + " - " + ListaPalabras.get(i));

        }
    }
}
