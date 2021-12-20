package baseHashTable;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class hastTableSacarDatos {

    public static void main(String[] args) {


        Object[] coche1 = new Object[]{"Mercedes", "c220", 250};
        Object[] coche2 = new Object[]{"Audi", "A5", 350};
        Object[] coche3 = new Object[]{"BMW", "M3", 188};

        Hashtable<String, Object[]> listaCoches = new Hashtable<>();
        listaCoches.put("5487F", coche1);
        listaCoches.put("9865G", coche2);
        listaCoches.put("2154S", coche3);
        listaCoches.put("5421C", new Object[]{"Ford", "Focus", 150});

        //para sacar las keys
        Enumeration<String> listaMatriculas = listaCoches.keys();
        while (listaMatriculas.hasMoreElements()) {
            String matricula = listaMatriculas.nextElement();
            Object[] cocheActual = listaCoches.get(matricula);

            for (int i = 0; i < cocheActual.length; i++) {
                System.out.println(cocheActual[i]);
            }
            //Otra manera
            /*for ( Object item : cocheActual ) {
                System.out.println(item);
            }*/
        }



        //para sacar los elementos sin pedirme las keys
        Enumeration<Object[]> listaCochesEnum = listaCoches.elements();
        while (listaCochesEnum.hasMoreElements()) {
            Object[] cocheActual = listaCochesEnum.nextElement();
            for (Object item : cocheActual) {
                System.out.println(item);

            }
        }
    }
}
