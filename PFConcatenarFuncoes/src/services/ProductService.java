package services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criterio) {
        double cont = 0;
        for (Product p : list) {
            if (criterio.test(p)) {
                cont += p.getPrice();
            }
        }
        return cont;
    }
}
