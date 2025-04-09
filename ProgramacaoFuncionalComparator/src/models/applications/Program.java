package models.applications;

import models.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 4200.00));
        list.add(new Product("Rack", 430.00));

        Collections.sort(list);

        for (Product s : list) {
            System.out.println(s);
        }


    }
}