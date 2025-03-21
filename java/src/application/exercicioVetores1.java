package application;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioVetores1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("quantos números quer digitar?");
        n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] < 0) {
                System.out.println("POSITIVO: " + numbers[i]);
            } else {
                System.out.println("NEGATIVO: " + numbers[i]);
            }
        }

        sc.close();

    }

}
