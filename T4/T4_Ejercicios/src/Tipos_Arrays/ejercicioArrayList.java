package Tipos_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioArrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int menu = 0;
        int opcion = 0;
        String datos = " ";
        ArrayList<Object[]> listaCoches = new ArrayList();


        String marca;
        String modelo;
        int coste;
        String matricula;


        while (menu != 7) {
            System.out.println("1. Añadir coches");
            System.out.println("2. Lista de coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Mostrar coches");
            System.out.println("5. Eliminar coche");
            System.out.println("5. Vaciar garaje ");

            try {

                System.out.println("Introduce la opcion que va a querer ");
                opcion = in.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Dime estos datos para añadirlo");
                        System.out.println(" ");

                        System.out.println("Dime la marca");
                        marca = in.next();

                        System.out.println("Dime la modelo");
                        modelo = in.next();

                        System.out.println("Dime la coste");
                        coste = in.nextInt();

                        System.out.println("Dime la matricula");
                        matricula = in.next();

                        listaCoches.add(new Object[]{marca, modelo, coste, matricula});

                        System.out.println("Datos guardados correctamente");
                        System.out.println(" ");

                        if (datos == null) {
                            System.out.println("La informacion es incorrecta");
                        }
                        break;
                    case 2:
                        System.out.println("La lista de coches es: ");
                        System.out.println(" ");
                        for (int i = 0; i < listaCoches.size(); i++) {

                            Object[] mostrarLista = listaCoches.get(i);

                            System.out.println("Marca: " + mostrarLista[0] + "   Modelo: " + mostrarLista[1] + "   Coste: " + mostrarLista[2] + "  Matricula" + mostrarLista[3]);
                            System.out.println("");
                            System.out.println("Estos son todos los coches del garaje");
                            break;
                        }

                }

                }finally{

            }
        }
    }
}

