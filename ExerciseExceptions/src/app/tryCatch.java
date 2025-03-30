package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os elementos separados por espaço: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Digite a posição: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Digite um número válido");
        } catch (InputMismatchException e2) {
            System.out.println("Não é um número");
        } finally {
            System.out.println("Programa finalizado ");
        }

        sc.close();
    }

}
