package Base;

// %.2f es para la media, 2 significa los decimales que va a coger
//Foreach[recorre los arrays] ( En la primero parte es Int Ejemplo : El arrays que quieras recorrer)

public class treitaNumeros_guardadosRray {

    public static void main(String[] args) {

        int[] numeros = new int[30];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            System.out.println(numeros[i]);
            suma += numeros[i];


        }

        double media = (double)suma/ (double)numeros.length;

        System.out.printf("La media es: %.3f%n", media);
        System.out.println("La suma es: " + suma);

    }

}

