package applications;

import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 200.00));
        list.add(new Product("Track", 300.00));
        list.add(new Product("som", 400.00));

        //SE O NOME COMEÇAR COM T, SOMAR

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println(String.format("%.2f", sum));
    }
}