package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        String path = "C:\\Users\\rafae\\OneDrive\\Área de Trabalho\\javaStudies\\Java\\ExercisePipelines1\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice()) //cria um novo stream só com os preços
                    .reduce(0.0, (x,y) -> x + y) / list.size(); //acumula os valores lidos

            System.out.println("Média: R$" + String.format("%.2f", avg));
            List<String> namesBelowAverage = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(Comparator.<String, String>comparing(String::toUpperCase).reversed())
                    .toList();

            System.out.println(namesBelowAverage);

        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
e
    }
}