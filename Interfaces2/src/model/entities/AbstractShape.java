package model.entities;

import model.enums.Color;
//PRECISA TRANSFORMAR EM ABSTRATA PARA NAO PRECISAR RETORNAR
public abstract class AbstractShape implements Shape{

    private Color color;

    private Rectangle rectangle;
    private Circle circle;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
