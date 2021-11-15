package Base;

//modificar todos los 6 por 8
//modificar todos los 7 por 15
//modificar todos los 20 por 10


public class Cambio_numero_rrays {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int sumaModificaciones = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6){
                numeros[i] = 8;
                sumaModificaciones++;
            } else if (numeros[i] == 7){
                numeros[i] = 15;
                sumaModificaciones++;
            } else if (numeros[i] == 20){
                numeros[i] = 10;
                sumaModificaciones++;
            }

            System.out.println(numeros[i]);

        }
        System.out.printf("El numero de modificaciones es: %d%n",sumaModificaciones);
    }
}

