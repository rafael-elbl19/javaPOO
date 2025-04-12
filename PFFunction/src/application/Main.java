package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 200.00));
        list.add(new Product("rack", 300.00));
        list.add(new Product("som", 400.00));

        /*FUNÇÃO map
        * APLICA UMA FUNÇÃO A CADA ELEMENTO DE UMA STREAM, GERANDO UMA NOVA STREAM COM OS ELEMENTOS NOVOS
        * list para stream: .stream()
        * stream para list: .collect(Collectors.toList())
        * */

        List <String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

        names.forEach(System.out::println);

    }
}