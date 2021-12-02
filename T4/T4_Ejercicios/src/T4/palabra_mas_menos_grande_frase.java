package T4;

import java.util.Scanner;

public class palabra_mas_menos_grande_frase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nombre = "La frase es un ejemplo para el ejercicio 8";
        String palabraPequena = " ejercicio ";
        String palabraGrande = "8";

        //nombre.split *regex --> quitar los espacios

        String[] arrays = nombre.split(" ");


        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);

            if (arrays[i].length() < palabraPequena.length()) {
                palabraPequena = arrays[i];
            }
            if (arrays[i].length() > palabraGrande.length()) {
                palabraGrande = arrays[i];
            }
        }

        System.out.println("La palabra mas grande es: " + palabraGrande);
        System.out.println("La palabra mas pequeña es: " + palabraPequena);

        for (String item : arrays) {

            if (item.length() == 4) {
                System.out.println("La palabra con 4 letras es: "+item);
            }
        }
    }
}
