package Base;

import java.util.Scanner;

public class Arrays_par_y_impar {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);

        int numero[] = new int[8];


        for (int i = 0; i < numero.length; i++) {
            System.out.println("Dime un numero");
            numero[i] =lecturaTeclado.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println("par: " + numero[i]);
            } else {
                System.out.println("impar: " + numero[i]);
            }
        }



    }

}


