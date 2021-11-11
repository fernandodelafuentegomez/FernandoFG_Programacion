public class Arrays {

    public static void main(String[] args) {
        //array de numeros, esto es meter en una variable varios datos
        int[] numeros = new int[10];
        int[] numerosDos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

        boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double[] decimales = {1.25, 2.69, 7.58};

        //ver numero de elementos que tiene
        int longitudArray = numerosDos.length;
        System.out.println("La longitus de numerosDos es: " + longitudArray);

        //Para sacar una posicion concreta del Arrays
        System.out.printf("La posicion 7 del Arrays es: " + numerosDos[7]);

        //Sacar todas las posiciones

        for (int i = 0; i < numerosDos.length; i++){
            System.out.println(numerosDos[i]);
        }

    }
