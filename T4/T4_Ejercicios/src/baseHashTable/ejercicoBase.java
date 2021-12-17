package baseHashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class ejercicoBase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String matricula = "";

        Hashtable<String, Object[]> listaCoches = new Hashtable();

        listaCoches.put("1234A", new Object[]{"1234A", "Mercedes", "C220"});
        listaCoches.put("8794C", new Object[]{"8794C", "BMW", "M3"});
        listaCoches.put("8794C", new Object[]{"8794C", "Fiat", "Punto"});

        //os pida una matricula por teclado t saques todos los datos del coche encontrados
        //en caso de no encotrar la maricula saltara un aviso

        System.out.println("Dime una matricula para buscar");
        matricula = in.next();

        boolean encontrado = false;

        for (Object[] item: listaCoches.get(matricula)) {

            if (item.equals(matricula)) {
                encontrado = true;
                System.out.println("Marca: " + item[1]
                            + "\t Modelo: " + item[2]);
            }

        }



        /*for (Object[] item : listaCoches.get(matricula)) {

            if (item.equalsIgnoreCase(matricula)) {
                encontrado = true;
                System.out.println("Marca: " + item[1]
                        + "\tModelo: " + item[2]);

            }
        }*/
    }
}