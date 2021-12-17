package Tipos_Arrays;

import java.util.Hashtable;

public class ListasHash {

    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        //tamaño lista
        listaElementos.size();

        //guardar cosas en un hashtable (Primero key, luego lo que hay dentro)
        listaElementos.put(1, "Elemento 1");
        listaElementos.put(2, "Elemento 2");
        listaElementos.put(3, false);
        listaElementos.put(1, new String[]{"cosa 1", "cosa 2", "cosa 3"});

        System.out.println(listaElementos.size());

        //obtener elementos del hashtable

        String[] elemntosEncontrados = (String[]) listaElementos.get("4");
        elemntosEncontrados[0] = "nuevo valor";


        for (String item: elemntosEncontrados) {
            System.out.println(item);
        }

        //borrar elemento

        listaElementos.remove("1");
        System.out.println(listaElementos.get("1"));
        // si hago un sout me va a dar null porque se a borrado los datos
    }

}
