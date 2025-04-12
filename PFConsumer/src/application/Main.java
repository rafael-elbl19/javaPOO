package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 300.00));
        list.add(new Product("rack", 420.00));
        list.add(new Product("mesa", 500.00));
        list.add(new Product("pano", 10.00));

        list.forEach(p -> p.setPrice(p.getPrice() * 2));

        //percorro a minha lista
        list.forEach(System.out::println);

    }
}