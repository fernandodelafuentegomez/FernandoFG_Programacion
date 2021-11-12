public class Arrays {

        public static void main(String[] args) {

            int par = 0;
            int [] numero = new int[15];

            for (int i = 0; i<15; i++) {
                numero[i] = (int)(Math.random()*51);
                System.out.println(numero[i]);

                if(numero[i] % 2 == 0) {
                    par++;
                }
            }

            System.out.println("hay " + par + "numero pares");

        }
    }