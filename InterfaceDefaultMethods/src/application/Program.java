package application;

import Services.JurosBrasileirosService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        Double quantia = sc.nextDouble();
        System.out.print("Meses: ");
        int qtdMeses = sc.nextInt();
        JurosBrasileirosService jbs = new JurosBrasileirosService(2.0);

        System.out.println("Valor final: ");
        System.out.println(String.format("%.2f", jbs.valorFinal(quantia, qtdMeses)));


        sc.close();
    }
}