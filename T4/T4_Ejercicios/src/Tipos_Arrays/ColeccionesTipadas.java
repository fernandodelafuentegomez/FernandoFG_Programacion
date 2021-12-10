package Tipos_Arrays;

import java.util.ArrayList;

public class ColeccionesTipadas {

    public static void main(String[] args) {

        //Integer --> Solo numeros, String --> Solo letras
        ArrayList <Integer> listaNumeros = new ArrayList();
        ArrayList <String> listaPalabras = new ArrayList();

        listaNumeros.add(123);
        listaNumeros.get(9);
        listaNumeros.remove(1);

        listaPalabras.add("Hola");
        listaPalabras.get(0);
        listaPalabras.remove(6);

        for ( String item : listaPalabras) {

        }
    }
}
