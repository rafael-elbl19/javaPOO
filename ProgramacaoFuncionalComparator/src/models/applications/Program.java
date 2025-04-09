package models.applications;

import models.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 4200.00));
        list.add(new Product("Rack", 430.00));

        //variável anônima dentro do código, melhor para expressoes lambda
        //Comparator<Product> comp = Comparator.comparing(p -> p.getName().toUpperCase());

        //mas, caso precise de uma lógica atrás do compare, usa normal
        /* Comparator<Product> comp = new Comparator<Product>() {
        *   return p1.getName().toUpperCase.compareTo(p2.getName().toUpperCase);
        * };
        * */

        //ou até mesmo, se nao precisar do toUpperCase
        /*Comparator<Product> comp = Comparator.comparing(Product::getName);
        * */

        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product s : list) {
            System.out.println(s);
        }


    }
}