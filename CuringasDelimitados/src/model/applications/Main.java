package model.applications;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(2.0, 2.0));
        myShapes.add(new Circle(3.0));


        System.out.println("Soma total das áreas: " + String.format("%.2f", totalArea(myShapes)));

    }

    public static double totalArea(List<Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum+=s.area();
        }
        return sum;
    }
}