package application;

import entities.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        //CONSUMINDO QUEBRA DE LINHA PÓS LER INTEIRO
        sc.nextLine();
        for (int i=0; i<n; i++) {
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            Double price = sc.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();
            Product p = new Product(name, price, quantity);
            list.add(p);
        }
        System.out.print("Digite o caminho que deseja criar a pasta: ");
        String caminho = sc.nextLine();

        File path = new File(caminho);

        if (!path.exists() || !path.isDirectory()) {
            System.out.println("Erro: Diretório inválido ou sem permissão de escrita.");
            return;
        }

        boolean success = new File(path + "\\pastaExerciseArquivosEPastas").mkdir();
        String subpasta = "pastaExerciseArquivosEPastas";
        File pasta = new File(path, subpasta);

        File file = new File(pasta, "produtos.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Product l : list) {
                bw.write(l.toString());
                bw.newLine();
            }
            System.out.println("Arquivo criado com sucesso: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }



        sc.close();
    }
}