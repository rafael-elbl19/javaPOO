package model.Applications;

import model.Entities.Product;
import model.Service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\rafae\\OneDrive\\Área de Trabalho\\javaStudies\\Java\\GenericsReadingArchive\\teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); //VARIÁVEL APENAS PARA INSERIR E ADICIONAR O CONTEÚDO DE UMA LINHA
            while(line != null) {
                String[] fields = line.split(", ");
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); //adiciona a linha ä list
                line = br.readLine(); //lê a próxima linha
            }

            Product x = CalculationService.max(list);
            System.out.println("Mais caro: " + x);

        } catch (IOException e) {
            throw new IllegalStateException("ERRO: valor inválido");
        }

        sc.close();

        sc.close();
    }
}