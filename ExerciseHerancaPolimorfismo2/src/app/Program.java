package app;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            System.out.println("---Entre os dados do produto #" + i + "---");
            System.out.print("Comum, usado ou importado (c/u/i): ");
            char ch = sc.next().charAt(0);

            if (ch == 'c') {
                System.out.print("Digite o nome do produto: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Digite o preço do produto: ");
                Double price = sc.nextDouble();
                Product prod = new Product(name, price);
                list.add(prod);

            } else if (ch == 'u') {
                System.out.print("Digite o nome do produto: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Digite o preço do produto: ");
                Double price = sc.nextDouble();
                System.out.print("Digite a data de manufatura: ");
                sc.nextLine();
                String dateManufact = sc.nextLine();
                Product prod = new UsedProduct(name, price, sdf.parse(dateManufact));
                list.add(prod);

            } else if (ch == 'i') {
                System.out.print("Digite o nome do produto: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Digite o preço do produto: ");
                Double price = sc.nextDouble();
                System.out.print("Digite a taxa alfandegaria: ");
                Double taxa = sc.nextDouble();
                Product prod = new ImportedProduct(name, price, taxa);
                list.add(prod);

            } else {
                System.out.println("Opção não encontrada");
                System.out.println("Finalizando programa.....");
            }
        }

        System.out.println(" ");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }

}
