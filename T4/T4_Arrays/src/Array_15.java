public class Array_15 {

    public static void main(String[] args) {

        int par = 0;
        int Impar = 0;
        int[] numero = new int[15];

        for (int i = 0; i < 15; i++) {
            numero[i] = (int) (Math.random() * 51);
            System.out.println(numero[i]);

            if (numero[i] % 2 == 0) {
                par++;
            } else {
                Impar++;
            }

        }
        System.out.println("hay " + par + "numero pares");
        System.out.println("hay " + Impar + "numero Impares");


    }
}
