package model.application;

import model.Services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AGORA PARA LER OUTROS TIPOS DE DADOS NAO PRECISO MUDAR TODO O PROGRAMA, APENAS AS VARIÁVEIS DE ENVIO!!
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>(); //PODE MUDAR

        System.out.print("Quantos? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            String value = sc.next(); //PODE MUDAR
            ps.addValue(value);
        }

        System.out.println(ps.print());
        System.out.println("First: " + ps.first());

        sc.close();
    }
}