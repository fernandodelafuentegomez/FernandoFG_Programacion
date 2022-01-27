package Asignatura;

public class Alumno {

    private Asignatura sociales;
    private Asignatura lengua;
    private Asignatura programacion;


    public Alumno(Asignatura sociales, Asignatura lengua,
                  Asignatura programacion) {
        this.sociales = sociales;
        this.lengua = lengua;
        this.programacion = programacion;
    }
    public Alumno(int idSociales, int idLengua,
                  int idProgramacion) {

        this.sociales = new Asignatura(idSociales);
        this.lengua = new Asignatura(idLengua);;
        this.programacion = new Asignatura(idProgramacion);;
    }
    public Asignatura getSociales() {
        return sociales;
    }
    public Asignatura getLengua() {
        return lengua;
    }
    public Asignatura getProgramacion() {
        return programacion;
    }
    public void setSociales(Asignatura sociales) {
        this.sociales = sociales;
    }
    public void setLengua(Asignatura lengua) {
        this.lengua = lengua;
    }
    public void setProgramacion(Asignatura programacion) {
        this.programacion = programacion;
    }
}
