package Base;

import java.util.Scanner;

public class SumasAristas {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int filas, columnas;
        int numerosAleatorios[][];
        int sumatorioFila1 = 0, sumatorioFilaN = 0, sumatoriocolumna1 = 0, sumatoriocolumnaN = 0;

        System.out.println("Cuantas filas tendra el arrays");
        filas = lecturaTeclado.nextInt();

        System.out.println("Cuantas columnas tendra el arrays");
        columnas = lecturaTeclado.nextInt();
        numerosAleatorios = new int[filas][columnas];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            //recorro la fila i
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                // recorro la columna j
                numerosAleatorios[i][j] = (int) (Math.random() * 21);
                System.out.print(numerosAleatorios[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                if (i == 0) {
                    sumatorioFila1 += numerosAleatorios[i][j];
                }

                if (i == filas - 1) {
                    sumatorioFilaN += numerosAleatorios[i][j];
                }
                if (j == 0) {
                    sumatoriocolumna1 += numerosAleatorios[i][j];
                }
                if (j == columnas - 1) {
                    sumatoriocolumnaN += numerosAleatorios[i][j];
                }
            }
        }


        int numeroFila = 0;
        for (int[] fila : numerosAleatorios) {
            // primera fila

            for (int columna : fila) {
                if (numeroFila == 0) {
                    sumatorioFila1 += columna;
                }

                if (numeroFila == filas-1) {
                    sumatorioFila1 += columna;
                }

            }
            // ultima fila

            // primera columna

            // ultima columna

            numeroFila++;

        }

        System.out.println("La suma de la primera fila es: " + sumatorioFila1);
        System.out.println("La suma de la ultima fila es: " + sumatorioFilaN);
        System.out.println("La suma de la primera columna es: " + sumatoriocolumna1);
        System.out.println("La suma de la ultima columna es: " + sumatoriocolumnaN);
    }
}
