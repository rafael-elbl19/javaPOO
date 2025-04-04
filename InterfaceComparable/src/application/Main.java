package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\rafae\\Documents\\listTeste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeData = br.readLine();
            while (employeeData != null) {
                String[] fields = employeeData.split(", ");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeData = br.readLine();
            }
            /*Serve para ordenar uma lista
            * Só funciona se a classe Employee for do tipo Comparable
            * */
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + " - R$" + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        sc.close();
    }
}