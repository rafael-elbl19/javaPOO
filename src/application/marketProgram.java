package application;

import entities.marketStock;

import java.util.Scanner;

public class marketProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chose = 1;

        System.out.println("Enter the product name: ");
        String name = sc.nextLine();

        System.out.println("Enter the price: ");
        double price = sc.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

        marketStock i = new marketStock(name, price, quantity);

        while (chose != 3) {

            System.out.println("Select the desired option: ");
            System.out.println("1. See product stock");
            System.out.println("2. Enter more products");
            System.out.println("3. Quit");
            chose = sc.nextInt();

            if (chose == 1) {

                /*System.out.println("Product name: " + i.name);
                System.out.println("Product price: " + i.price);
                System.out.println("Product quantity: " + i.quantity);
                System.out.println("Stock value: " + i.value());*/
                System.out.println(i);

            } else if (chose == 2) {

                System.out.println("How many items do you want to add to the stock?");
                int quantityToAdd = sc.nextInt();  // Recebe o número de itens a ser adicionado
                int totalItems = i.newItems(quantityToAdd);  // Atualiza a quantidade no estoque
                System.out.println("Updated stock quantity: " + totalItems);

            }
        }

        sc.close();
    }
}