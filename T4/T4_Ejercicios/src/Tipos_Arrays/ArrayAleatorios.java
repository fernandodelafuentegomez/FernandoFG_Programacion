package Tipos_Arrays;

import java.util.ArrayList;

public class ArrayAleatorios {

    public static void main(String[] args) {

        ArrayList <Integer> numeros = new ArrayList();

        int suma = 0;
        int maximo = 0;
        int minimo = 100;
        int tamanio = 10;

        for (int i = 0; i < tamanio; i++) {
            numeros.add((int) (Math.random() * 101));
        }

        System.out.println("Este es el arraylist");
        System.out.println(numeros);

        for (int n : numeros) {
            suma += n;
        }
        int media = (suma/tamanio);
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);

        for (int n : numeros) {
            if (n > maximo) {
                maximo = n;
            }

            if (n < minimo) {
                minimo = n;
            }
        }
        System.out.println("El número mínimo del arraylist es: " + minimo);
        System.out.println("El número máximo del arraylist es: " + maximo);
    }

}