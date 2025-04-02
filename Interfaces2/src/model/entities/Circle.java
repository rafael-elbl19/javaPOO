package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape{

    private Double raio;
    public static final Double PI = 3.1415;

    public Circle(Color color, Double raio) {
        super(color);
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI*raio*raio;
    }
}
