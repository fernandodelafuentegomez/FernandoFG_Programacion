package trigonometria;

public class Triangulo {

    public int base, altura, area;

    // constructor

    public Triangulo(){}

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //metodo

    public void CalcularAreaT(int base, int altura, int area){
        this.base = base;
        this.altura = altura;
        this.area = area;

        area = (base * altura) / 2;
    }
}
