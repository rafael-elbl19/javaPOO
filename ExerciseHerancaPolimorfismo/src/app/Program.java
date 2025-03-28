package app;

import entities.Employee;
import entities.OutsorceredEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {

            System.out.println("Funcionário #" + i);
            System.out.print("Funcionário terceiro? (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            Integer hours = sc.nextInt();
            System.out.print("Valor por hora: ");
            Double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Taxa adicional: ");
                Double additionalCharge = sc.nextDouble();
                sc.nextLine();
                list.add(new OutsorceredEmployee(name, valuePerHour, hours, additionalCharge));
            } else {
                list.add(new Employee(name, valuePerHour, hours));
            }

        }

        System.out.println(" ");
        System.out.println("-----PAGAMENTOS-----");
        for (Employee e : list) {
            System.out.println("Nome: " + e.getName() + " - " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }

}
