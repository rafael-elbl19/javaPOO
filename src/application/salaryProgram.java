package application;

import entities.salaryIncrease;

import java.util.Scanner;

public class salaryProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        salaryIncrease person1;
        person1 = new salaryIncrease();

        System.out.println("Enter the employee name:");
        person1.name = sc.nextLine();
        System.out.println("Enter the employee salary");
        person1.salary = sc.nextDouble();

        System.out.println("Name: " + person1.name + " Salary before taxes: R$" + person1.salary);

        System.out.println("Enter the salary discount in %");
        person1.discount = sc.nextDouble();

        Double totalSalary = person1.finalSalary();

        System.out.println("Updated informations:");
        System.out.println("Name:" + person1.name + " Final salary: R$" + totalSalary);
    }

}
