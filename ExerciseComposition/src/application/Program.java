package application;

import entities.Order;
import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.enumeracao.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        /*//CRIEI UM PRODUTO
        Product p = new Product("TV", 1000.00);

        //PASSEI ESSE PRODUTO, QUE JÁ ESTÁ ASSOCIADO AO ORDERITEM
        OrderItem oi1 = new OrderItem(1, 1000.00, p);*/

        System.out.println("---- Entre com os dados do cliente ----");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Nascimento (DD/MM/AAAA): ");
        String aniversario = sc.nextLine();
        System.out.println("---------------------------------------\n");

        System.out.println("---- Entre com os dados do status ----");
        System.out.print("Qual o status do pedido? ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("Quantos produtos serão pedidos? ");
        int n = sc.nextInt();
        System.out.println("--------------------------------------\n");

        Order order = new Order(status, new Client(nome, email, sdf1.parse(aniversario)));

        for (int i = 1; i < n+1; i++) {
            System.out.println("Digite os dados do #" + i + " produto");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantidadeProduto = sc.nextInt();
            System.out.println("--------------------------------------");
            Product p = new Product(nomeProduto, precoProduto);
            OrderItem item = new OrderItem(quantidadeProduto, precoProduto, p);
            order.addItems(item); //nao esquecer de adicionar o objeto na lista
        }

        System.out.println();
        System.out.println(order);

    }

}
