package models.applications;

import models.entities.Client;

public class Program {
    public static void main(String[] args) {
        /*
        * hashCode = MAIS RÁPIDO, MAS TEM UMA CHANCE MUITO RARA DE DAR COLISÃO
        * equals = SEMPRE VAI DAR CERTO, MAS É MAIS LENTO
        * */

        Client c1 = new Client("Rafael", "rafael.elbl@hotmail.com");
        Client c2 = new Client("Isabella", "rafael.elbl@hotmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));


    }
}