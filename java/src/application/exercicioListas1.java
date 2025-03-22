package application;

import entities.entidadesListas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercicioListas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos empregados serão registrados? ");
        int n = sc.nextInt();
        List<entidadesListas1> list = new ArrayList<>();

        for (int i=0; i < n; i++) {
            System.out.printf("%d# Employee\n", i+1);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            entidadesListas1 emp = new entidadesListas1(name, id, salary);
            list.add(emp);
        }

        System.out.println("Digite o ID do empregado que terá aumento de salário");
        int idIncrease = sc.nextInt();

        entidadesListas1 emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("ID inválido.");
        } else {
            System.out.println("Digite a porcentagem: ");
            int percentage = sc.nextInt();
            emp.percentageSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (entidadesListas1 x : list) {
            System.out.println(x);
        }

    }

}
