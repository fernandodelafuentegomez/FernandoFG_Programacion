public class Entrada {

    //ambito de clase
    //String nombre = "Borja";

    public static void main(String[] args) {

        //ambito de metodo - local
        //String nombre = "Borja";

        Usuario usuario1 = new Usuario();
        // nombre=null, password=null, correo=null, edad=0, fecha=null

        Usuario usuario2 = new Usuario();
        // nombre=null, password=null, correo=null, edad=0, fecha=null

        Usuario usuario3 = new Usuario("Borja", "Borja.martinez@ces.es", "1234");
        // nombre=borja, password=1234, correo=Borja.martinez@ces.es, edad=0, fecha=null

        Usuario usuario4 = new Usuario("fernando.delafuente@gmail.com", "12345", 20);
        // nombre=null, password=12345, correo=fernando.delafuente@gmail.com, edad=20, fecha=null

        //editar un valor ya dado
        System.out.println(usuario1.password);
        usuario1.password = "contraseña";
        System.out.println(usuario1.password);

        usuario1.setPassword("contraseña");
        System.out.println(usuario1.getPassword());

        usuario1.setNombre("Fernando");
        System.out.println(usuario1.getNombre());




    }
}
