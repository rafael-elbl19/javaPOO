package application;

import entities.testeT;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        testeT i = new testeT();

        System.out.println("digite o nome");
        String name = sc.nextLine();
        i.setName(name);

        System.out.println(i.getName());

    }

}
