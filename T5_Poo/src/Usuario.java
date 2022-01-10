public class Usuario {

    //variables
    public String correoElectronico, nombre, apellidos, fecha, password;
    public int edad;


    //constructores
    //si no hay constructores escritos, hay un constructor vacioo (por defecto)
    //este constructor deja de existir en cuanto se escriba un constructor nuevo
    public Usuario(){
    }
    //Escribir el nuevo constructor, se a borrado por escribir otro (El de arriba)

    public Usuario(String nombre, String correoElectronico, String password){
        this.nombre= nombre;
        this.correoElectronico= correoElectronico;
        this.password= password;
    }

    public Usuario(String correoElectronico, String password, int edad){
        this.correoElectronico= correoElectronico;
        this.password= password;
        this.edad= edad;
    }
    // importante! no se puede repetir la estructura (String, String, String ya esta en uso, por eso el de abajo no funciona)

    /* public Usuario(String nombre, String apellidos, String correoElectronico){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
    }*/

    //metodos


    //metodos getters y setters


    //getter de contraseña (devuelva valor)

    public String getPassword(){
        return password;
    }

    public String getNombre(){
        return nombre;
    }


    //setter de contraseña (modifica valor)

    public void setPassword(String password){
        this.password = password;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }




}

