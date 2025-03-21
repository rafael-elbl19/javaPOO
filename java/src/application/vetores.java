package application;

import java.util.Scanner;
import entities.vetoresEntities;

public class vetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de produtos:");
        int n = sc.nextInt();
        vetoresEntities[] vect = new vetoresEntities[n];
        /*
        o primeiro vetorEntities está referenciando a classe
        O segundo vetorEntities está referenciando o construtor, dando a ele um número de "slots" a serem criados
        */

        for (int i=0; i< vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            double preco = sc.nextDouble();
            vect[i] = new vetoresEntities(nome, preco); //chama o construtor passando nome e preço lidos
        }

        double sum = 0;
        for (int i=0; i< vect.length; i++) {
            sum += vect[i].getPreco();
        } //soma recebe cada índice do vetor vect, pois é um loop que aumenta o índice conforme a variável i

        double avg = sum/ vect.length;

        System.out.printf("Média = %.2f", avg);

        sc.close();

    }

}
