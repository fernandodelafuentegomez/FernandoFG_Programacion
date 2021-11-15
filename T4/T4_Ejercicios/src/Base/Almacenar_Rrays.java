package Base;

import java.util.Scanner;

public class Almacenar_Rrays {

    public static void main(String[] args) {

        int [] numeros = new int[10];
        Scanner LecturaTeclado = new Scanner(System.in);

        // .length sirve para coger los numeros que tu le hayas dado en el Int

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero a guardar");
            int numero = LecturaTeclado.nextInt();
            numeros[i] = numero;
        }

        for (int i = 0; i < numeros.length ; i++) {
            System.out.printf("%d : %d%n", i, numeros[i]);

        }



    }
}
