package trigonometria;

public class Circulo {

    public double radio, area;

    public Circulo() {
    }

    public Circulo(double radio) {
    }

    //metodo

    public void CalcularAreaC( double area, double radio) {
        this.radio = radio;
        this.area = area;

        area = (Math.PI * Math.pow(radio,2));
    }
}
