package application;

import entities.Enum.OrderStatus;
import entities.OrderClient;
import entities.OrderItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderProgram {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Aniversário (dd/MM/aaaa): ");
        String aniversario = sc.next();
        sc.close();

        OrderClient client = new OrderClient(nome, email, sdf.parse(aniversario));

        System.out.println("Digite o status do cliente: ");
        System.out.print("Status:");
        String status = sc.next();
        OrderStatus.valueOf(status);

        System.out.println();
        System.out.print("Quantos pedidos na ordem?");
        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            System.out.println("Digite os dados do #" + i + "item");
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.next();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextInt();
            System.out.println("Quantidade: ");
            int quantidadeProduto = sc.nextInt();


        }



    }

}
