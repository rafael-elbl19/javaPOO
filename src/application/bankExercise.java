package application;

import entities.bankEntities;

import java.util.Scanner;

public class bankExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        bankEntities person = new bankEntities();

        System.out.println("Enter your name:");
        person.name = sc.nextLine();
        System.out.println("Enter your bank account:");
        String account = sc.nextLine();
        person.setAccount(account);
        System.out.println("Do you want to put some initial money? (y/n)");
        String parameter = sc.nextLine();
        switch (parameter) {
            case "y":
                System.out.println("Enter the amount of money you want to put in");
                person.putMoney = sc.nextDouble();
                person.calculate();
                break;
        }

    }
}
