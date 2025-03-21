package application;

import java.util.Scanner;
import util.staticCalculator;

public class staticMembers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = sc.nextInt();

        System.out.println(staticCalculator.circumference(radius));
        System.out.println(staticCalculator.volume(radius));

    }

}
