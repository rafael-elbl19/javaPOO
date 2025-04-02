package model.application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
    public static void main(String[] args) {

        AbstractShape s1 = new Rectangle(Color.RED, 2.0, 2.0);
        AbstractShape s2 = new Circle(Color.BLUE, 2.0);

        System.out.println("Area circulo: " + String.format("%.2f", s2.area()));
        System.out.println("Area retangulo: " + s1.area());

    }
}