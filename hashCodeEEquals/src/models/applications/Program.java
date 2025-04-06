package models.applications;

import models.entities.Client;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        /*
        * hashCode = MAIS RÁPIDO, MAS TEM UMA CHANCE MUITO RARA DE DAR COLISÃO
        * equals = SEMPRE VAI DAR CERTO, MAS É MAIS LENTO
        * */

        Client c1 = new Client("Rafael", "rafael.elbl@hotmail.com");
        Client c2 = new Client("Rafael", "rafael.elbl@hotmail.com");

        System.out.println("HashCode do primeiro objeto: " + c1.hashCode());
        System.out.println("HashCode do segundo objeto: " + c2.hashCode());
        System.out.println("Comparação de igualdade do conteúdo: " + c1.equals(c2));
        System.out.print("Comparação de alocação de memória: ");
        System.out.print(c1 == c2);
        System.out.println("\nAcontece pois o equals compara o conteúdo dos objetos, e o == compara a alocação de memória do objeto, e não do conteúdo");

        String a = "Teste";
        String b = "Teste";

        System.out.println(a == b);
        System.out.println("Acontece pois a expressão literal é tratada de forma especial pelo compilador");


    }
}