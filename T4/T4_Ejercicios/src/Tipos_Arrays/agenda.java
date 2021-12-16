package Tipos_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class agenda {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int menu = 0;
        int opcion = 0;
        ArrayList <Object[]> listaPersonas = new ArrayList();

        String nombre;
        String apellido;
        int telefono;
        String dni;
        String dniNuevo;

        while (menu != 5) {
            System.out.println("1. Agregar personas");
            System.out.println("2. Buscar personas");
            System.out.println("3. Borrar personas");
            System.out.println("4. Lista de personas");

            try {
                System.out.println(" ");
                System.out.println("Introduce la opcion que va a querer ");
                opcion = in.nextInt();

            }finally {

                switch (opcion) {
                    case 1:
                        System.out.println("Vamos a agregar una persona ");
                        System.out.println(" ");
                        System.out.println("Dime su nombre: ");
                        nombre = in.next();
                        System.out.println("Dime su apellido: ");
                        apellido = in.next();
                        System.out.println("Dime su telefono: ");
                        telefono = in.nextInt();
                        System.out.println("Dime su DNI: ");
                        dni = in.next();
                        System.out.println(" ");
                        System.out.println("Datos guardados correctamente");
                        System.out.println(" ");

                        listaPersonas.add(new Object[]{nombre, apellido, dni, telefono});



                    case 2:
                        System.out.println("Que dni quieres buscar");
                         dniNuevo = in.next();
                        boolean encontrado = false;

                        for ( Object[] item : listaPersonas ) {

                            if (item[2].toString().equalsIgnoreCase(dniNuevo)){
                                encontrado = true;
                                System.out.println("Nombre: "+ item[0]
                                        +"\tApellido: "+ item[1]
                                        +"\tDNI: " + item[2]
                                        +"\tTeléfono: "+ item [3]);


                            }
                        }

                        if (!encontrado){
                            System.out.println("La persona no esta en la lista");
                        }

                        break;

                    case 3:
                        System.out.println("Que dni quieres borrar");
                        dni = in.next();
                        encontrado = false;

                        for (int i = 0; i < listaPersonas.size(); i++) {
                            if (listaPersonas.get(i)[2].toString().equalsIgnoreCase(dni)){
                                System.out.println("Persona borrada");
                                encontrado=true;
                                listaPersonas.remove(i);
                                break;
                            }
                        }

                        if(!encontrado){
                            System.out.println("La persona no esta en la lista");
                        }

                        break;
                    case 4:
                        if (listaPersonas.size()>0){
                            for ( Object[] item : listaPersonas ) {
                                System.out.println("Nombre: "+ item [0]
                                        +"\tApellido: "+ item [1]
                                        +"\tDNI: " + item [2]
                                        +"\tTeléfono: "+ item [3]);
                            }
                        } else {
                            System.out.println("No hay personas en la lista");
                        }

                        break;
                }

            }

        }
    }
}
