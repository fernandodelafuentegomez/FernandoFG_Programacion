package agenda;

import java.util.Scanner;

public class entrada {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner (System.in);
        int opcion = 0;


        System.out.println("--------------------------------------------------------");
        System.out.println("1º Agregar persona a la agenda ");
        System.out.println("2º Borrar persona a la agenda ");
        System.out.println("3º Editar persona a la agenda ");
        System.out.println("4º Recuperar persona que tenga el DNI intruducido ");
        System.out.println("5º Listar la agenda ");
        System.out.println("--------------------------------------------------------");

        System.out.println("Elije una opcion");
        opcion = lecturaTeclado.nextInt();


        if (opcion == 1){
            System.out.println("Vamos a agragar a una persona a la agenda");
            System.out.println("--------------------------------------------");
        }
        else if (opcion == 2){
            System.out.println("Vamos a borrar a una persona de la agenda");
        }
        else if (opcion == 3){
            System.out.println("Vamos a editar a una persona de la agenda");
        }
        else if (opcion == 4){
            System.out.println("Vamos a recuperar persona que tenga el DNI intruducido");
        }
        else if(opcion == 5){
            System.out.println("Vamos a listar la agenda");
        }
        else{
            System.out.println("El valor no es correcto ");
        }


    }
}
