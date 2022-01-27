package Asignatura;

public class Asignatura {

    private int id;
    private double calificacion;

    public Asignatura(int id) {
        this.id = id;
    }


    public int getId(){
        return id;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}

