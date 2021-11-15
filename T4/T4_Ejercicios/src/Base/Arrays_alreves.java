package Base;

import java.util.Scanner;

public class Arrays_alreves {

    public static void main(String[] args) {

        int [] numeros = new int[10];
        Scanner LecturaTeclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numeros a guardar");
            int numero = LecturaTeclado.nextInt();
            numeros[i] = numero;
        }


        System.out.println("Orden inverso");
        for (int i = 9; i >-1; i--) {
            if (i == 0){
                System.out.println(numeros[i]);
            }else if (i <= 9)
                System.out.print(numeros[i]+",");
        }


        System.out.printf("\nOrden normal\n");
        for (int i = 0; i < numeros.length; i++) {
            if (i<9){
                System.out.print(numeros[i]+",");
            }else
                System.out.println(numeros[i]);


        }
    }
}
