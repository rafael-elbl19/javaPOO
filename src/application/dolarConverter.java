package application;

import java.util.Scanner;
import util.currencyConverter;

public class dolarConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of reais you want to convert to dollars");
        double reais = sc.nextDouble();
        double total = currencyConverter.finalAmount(reais);
        System.out.printf("Your money is $%.2f", total);

    }

}
