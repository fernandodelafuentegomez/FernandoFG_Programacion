package Fernando_delaFuente;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        final double precioRefresco = 1.20;
        final double precioCafe = 1;
        final double precioBocadillo = 3.20;
        final double precioMenu = 9.50;

        int numeroRefresco = 0;
        int numeroCafe = 0;
        int numeroBocadillo = 0;
        int numeroMenu = 0;
        int numeroComensales = 0;

        while (!salir) {

            System.out.println("1. Pedir cafe");
            System.out.println("2. Pedir refresco");
            System.out.println("3. Pedir bocadillo");
            System.out.println("4. Pedir menu");
            System.out.println("5. Sacar cuenta");

            try {

                System.out.println("Introduce la opcion que va a querer ");
                opcion = in.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuantos cafe quiere?");
                        numeroCafe = in.nextInt();
                        if (numeroCafe == 0) {
                            System.out.println("La cantidad es incorrecta");
                        }
                        break;
                    case 2:
                        System.out.println("¿Cuantos refrescos quiere?");
                        numeroRefresco = in.nextInt();
                        if (numeroRefresco == 0) {
                            System.out.println("La cantidad es incorrecta");
                        }
                        break;
                    case 3:
                        System.out.println("¿Cuantos bocadillos quiere?");
                        numeroBocadillo = in.nextInt();
                        if (numeroBocadillo == 0) {
                            System.out.println("La cantidad es incorrecta");
                        }
                        break;
                    case 4:
                        System.out.println("¿Cuantos menus quiere?");
                        numeroMenu = in.nextInt();
                        if (numeroMenu == 0) {
                            System.out.println("La cantidad es incorrecta");
                        }
                        break;
                    case 5:
                        System.out.println("Sacar cuenta");
                        System.out.println("¿Cuantos comensales son?");
                        numeroComensales = in.nextInt();
                        double pTotal = (precioRefresco * numeroRefresco) + (precioCafe*numeroCafe) + (precioBocadillo*numeroBocadillo) + (precioMenu*numeroMenu);
                        double pCabeza = (pTotal / numeroComensales);
                        System.out.println("Cafes: " + numeroCafe);
                        System.out.println("Refrescos: " + numeroRefresco);
                        System.out.println("Bocadillos: " + numeroBocadillo);
                        System.out.println("Menus: " + numeroMenu);
                        System.out.println("El precio total es: " + pTotal);
                        System.out.println("El precio por persona es: " + pCabeza);
                        salir = true;

                }
                } finally {


            }
        }
    }
}


