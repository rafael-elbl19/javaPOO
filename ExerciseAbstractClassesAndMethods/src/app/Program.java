package app;

import entities.Shape;
import entities.enums.Color;
import entities.Circle;
import entities.Rectangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        Double raio = sc.nextDouble();
        System.out.print("Digite a cor do círculo: ");
        sc.nextLine();
        String colorCircle = sc.nextLine();
        Shape sh1 = new Circle(Color.valueOf(colorCircle), raio);
        System.out.print("Digite a altura do retângulo: ");
        Double altura = sc.nextDouble();
        System.out.print("Digite a largura do retângulo: ");
        Double largura = sc.nextDouble();
        System.out.print("Digite a cor do retângulo: ");
        String colorRetangle = sc.nextLine();
        Shape sh2 = new Rectangle(Color.valueOf(colorRetangle), altura, largura);

        System.out.println("Área do círculo: " + sh1.area());
        System.out.println("Área do retângulo: " + sh2.area());

    }

}
