package model.applications;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        List<Rectangle> myRectangles = new ArrayList<>();
        myRectangles.add(new Rectangle(2.0, 2.0));
        myRectangles.add(new Rectangle(3.0, 3.0));

        System.out.println("Soma total das áreas dos círculos: " + String.format("%.2f", totalArea(myCircles)));
        System.out.println("Soma total das áreas dos retângulos: " + String.format("%.2f", totalArea(myRectangles)));

    }

    /*POR QUE OCORRE?
    * Mesmo o tipo Circle sendo subclasse do tipo Shape, a List Circle não é subclasse da List Shape
    * Está dizendo "Aceito uma lista de qualquer coisa que estenda Shape"
    * */
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum+=s.area();
        }
        return sum;
    }
}