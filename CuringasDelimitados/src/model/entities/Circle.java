package model.entities;

public class Circle implements Shape{

    private Double raio;

    public Circle(Double raio) {
        super();
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(raio, 2);
    }
}
