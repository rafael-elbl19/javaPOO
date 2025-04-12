package applications;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 400.00));
        list.add(new Product("Sofá", 280.00));
        list.add(new Product("Rack", 300.00));

        double min = 300.00;

        System.out.println("Removidos menores que 300");
        list.removeIf(p -> p.getPrice() < min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}