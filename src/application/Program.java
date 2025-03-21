package application;

import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y; //Chama o objeto
        x = new Triangle(); //Instancia o objeto triangulo 1
        y = new Triangle(); //Instancia o objeto triangulo 2

        System.out.println("Write the A triangle measures:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        Double resultA = x.area();

        System.out.println("Write the B triangle measures:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        Double resultB = y.area();
        System.out.printf("Triangle A area = %.4f%n", resultA);
        System.out.printf("Triangle A area = %.4f%n", resultB);

        sc.close();
    }
}

