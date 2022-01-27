public class Entrada {



    public static void main(String[] args) {

        Persona persona1 = new Persona("Mario", "Olmos", "47544796R", 19, 175, 82);
        Persona persona2 = new Persona("Nicolas", "Jimenez", "53900238Z", 18);
        Persona persona3 = new Persona("Fernando", "De la Fuente", "111111111X", 0, 0, 0);
        Persona persona4 = new Persona("Datos por defecto", "Datos por defecto", "Datos por defecto", 0, 0, 0);

        persona1.mostrarDatos();
        System.out.println("-------------------------");
        persona2.mostrarDatos();
        System.out.println("-------------------------");
        persona3.mostrarDatos();
        System.out.println("-------------------------");
        persona4.mostrarDatos();

    }
}
