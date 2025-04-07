package model.applications;

import model.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    /*MAP
    * Estrutura de dados genérica, mas com objeto chave e objeto valor
    * elementos sem posição, indexados pelo objeto chave
    * Como o set, HashMap, TreeMap, LinkedHashMap
    * put, remove, contaisKey, getKey
    * keySet() - retorna um Set com as chaves do Map
    * values() - retorna um Collection<V> coleção do tipo valor
    * */
    public static void main(String[] args) {
        Map<Product, Double> products = new HashMap<>();

        Product p1 = new Product(900.00, "Rack");
        Product p2 = new Product(299.00, "Blanket");
        Product p3 = new Product(3999.00, "TV");

        products.put(p1, 2000.00);
        products.put(p2, 3000.00);
        products.put(p3, 4000.00);

        System.out.println("Contains p3 key = " + products.containsKey(p3));

    }
}