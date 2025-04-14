package application;

import entities.Personal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\rafae\\OneDrive\\Área de Trabalho\\javaStudies\\Java\\ExerciseSoloFunctionalProgramming\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Personal> list = new ArrayList<>();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Personal(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

            System.out.println("Email of those with salary above $10.000,00");
            List<String> email = list.stream()
                    .filter(p -> p.getSalary() > 10000.00)
                    .map(x -> x.getEmail())
                    .toList();
            email.forEach(System.out::println);

            double sum = list.stream()
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x+y) / list.size();

            System.out.println("Média dos salários de todos: R$" + String.format("%.2f", sum));

        //TRATAMENTO DE INPUT, MAS PREFERI DEIXAR O PROGRAMA SEM INPUT PARA NÃO TER QUE TRATAR O PATH
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}