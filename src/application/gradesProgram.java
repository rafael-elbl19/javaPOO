package application;

import entities.GradesCalculate;

import java.util.Scanner;

public class gradesProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GradesCalculate x;
        x = new GradesCalculate();

        System.out.println("Digite seu nome");
        x.name = sc.nextLine();
        System.out.println("Enter your first note");
        x.firstGrade = sc.nextInt();
        System.out.println("Enter your second note");
        x.secondGrade = sc.nextInt();
        System.out.println("Enter your third note");
        x.thirdGrade = sc.nextInt();

        int finalGrade = x.calculate();

        if (finalGrade < 60) {
            System.out.println(x.name);
            System.out.println("FAILED");
            int restGrade = 60 - finalGrade;
            System.out.printf("Reached %d points", finalGrade);
            System.out.printf("Missing %d points", restGrade);
        } else {
            System.out.println(x.name);
            System.out.println("PASS");
            System.out.printf("Final grade = %d", finalGrade);
        }

    }
}
