package Asignatura;

public class Profesor {

    public void ponerNotas(Alumno x) {

        x.getCiencias().setCalificacion(Math.random()*10);

        x.getHistoria().setCalificacion(Math.random()*10);

        x.getProgramacion().setCalificacion(Math.random()*10);

    }

    public double calcularMedia(Alumno x) {

        double nota1 = x.getCiencias().getCalificacion();

        double nota2 = x.getProgramacion().();

        double nota3 = x.getProgramacion().getCalificacion();

        double media = (nota1 + nota2 + nota3) / 3;

        return media;

    }

}

