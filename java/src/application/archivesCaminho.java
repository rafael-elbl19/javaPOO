package application;

import java.io.File;
import java.util.Scanner;

public class archivesCaminho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de um arquivo que deseja saber o nome: ");
        String caminho = sc.nextLine();

        File path = new File(caminho);

        System.out.println("Função getName: " + path.getName());
        System.out.println("Função getParent: " + path.getParent());
        System.out.println("Função getPath: " + path.getPath());

        sc.close();
    }
}
