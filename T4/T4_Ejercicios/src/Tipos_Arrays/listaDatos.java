package Tipos_Arrays;

import java.util.ArrayList;

public class listaDatos {

    public static void main(String[] args) {

        Object[] coche1 = new Object[]{"Mercedes", "c220", 250};
        Object[] coche2 = new Object[]{"Audi", "A5", 350};
        Object[] coche3 = new Object[]{"BMW", "M3", 188};

        ArrayList<Object[]> listaCoches = new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(new Object[] {"Ford", "Focus", 150});

        //obtener coches

        /*Object[] cochesSelecionados = listaCoches.get(0);*/
        /*System.out.println(cochesSelecionados[1]);*/

        for (int i = 0; i < listaCoches.size() ; i++) {

            Object[] cochesSelecionados = listaCoches.get(i);

            System.out.println("Marca: " + cochesSelecionados[0] + "   Modelo: " + cochesSelecionados[1] + "   CV: " + cochesSelecionados[2]);

        }
    }
}
