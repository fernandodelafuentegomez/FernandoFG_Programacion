package Fernando_delaFuente;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numeros = null;
        int NumeroArrays = 0;
        int Eleccion = 0;


        do {
            System.out.println("Dime tu opcion que quieres elejir");
            Eleccion = in.nextInt();
            if (Eleccion == 1) {
                System.out.println("Dime la longitud del Arrays");
                NumeroArrays = in.nextInt();

                if (NumeroArrays > 0) {
                    System.out.println("Tu Arrays se a almacenado");
                    numeros = new int[NumeroArrays];
                } else {
                    System.out.println("El tamano del Arrays es negativa o su valor es 0");

                }
            } else if (Eleccion == 2) {
                if (NumeroArrays == 0) {
                    System.out.println("El arrays no tienen longitud");

                } else {

                    for (int j = 0; j < numeros.length; j++) {
                        numeros[j] = (int) (Math.random() * 101);
                        System.out.println(numeros[j]);

                    }
                }
            } else if (Eleccion == 3) {

                if (NumeroArrays == 0) {
                    System.out.println("El arrays no tienen longitud");
                }

                for (int i = 0; i < numeros.length; i++) {
                    int npar = numeros[i] % 2;
                    if (numeros[i] > 10 && (npar == 0)) {
                        System.out.println(numeros[i]);
                    }

                }


            } else if (Eleccion == 4) {
                if (NumeroArrays == 0) {
                    System.out.println("El arrays no tienen longitud");
                }
            } else if (Eleccion == 5) {
                for (int j = 0; j < numeros.length; j++) {
                    System.out.println(numeros[j]);

                }
            }

        } while (Eleccion != 0);


    }
}
