package model.application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws DomainException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta --------");
            System.out.print("Número: ");
            Integer numero = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldoInicial = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteSaque = sc.nextDouble();

            Account ac = new Account(numero, nome, saldoInicial, limiteSaque);
            System.out.println("Saldo antes do saque: " + ac.getSaldo());
            System.out.println("------------------------------------");

            System.out.print("Quanto deseja sacar: ");
            Double amount = sc.nextDouble();
            ac.withdraw(amount);
            System.out.println("Saldo após saque: " + ac.getSaldo());

        } catch (DomainException e1) {
            System.out.println(e1.getMessage());
        }
        sc.close();
    }

}
