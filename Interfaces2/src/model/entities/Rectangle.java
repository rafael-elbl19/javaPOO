package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape{

    private Double largura;
    private Double altura;

    public Rectangle(Color color, Double largura, Double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return altura*largura;
    }
}
