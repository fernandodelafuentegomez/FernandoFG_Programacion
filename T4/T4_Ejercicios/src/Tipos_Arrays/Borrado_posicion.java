package Tipos_Arrays;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Borrado_posicion {

    public static void main(String[] args) {

        ArrayList listaCosas = new ArrayList();


        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("hola");
        listaCosas.add("true");
        listaCosas.add(34567);
        listaCosas.add("Fernando");
        listaCosas.add("Borja");

        System.out.println("ArrayList sin tocar: " + listaCosas);

        listaCosas.removeIf(new Predicate() {
            @Override
            public boolean test(Object item) {
                return item.equals(34567);
            }
        });
        System.out.println(" ");
        System.out.println("ArrayList quitando 34567: " + listaCosas);
    }
}
