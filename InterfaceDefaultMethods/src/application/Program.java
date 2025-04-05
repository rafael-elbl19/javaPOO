package application;

import Services.JurosAmericanosService;
import Services.JurosBrasileirosService;
import Services.JurosService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double quantia = sc.nextDouble();
        System.out.print("Meses: ");
        int qtdMeses = sc.nextInt();
        System.out.print("Qual o país (a:américa/b:brasil): ");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a':
                JurosService jsa = new JurosAmericanosService(3.0);
                System.out.println("Valor final: ");
                System.out.println(String.format("%.2f", jsa.valorTotal(quantia, qtdMeses)));
                break;
            case 'b':
                JurosService jsb = new JurosBrasileirosService(2.0);
                System.out.println("Valor final: ");
                System.out.println(String.format("%.2f", jsb.valorTotal(quantia, qtdMeses)));
        }
        sc.close();
    }
}