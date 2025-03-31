package application;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class archives {

    public static void main(String[] args) {

        String path = "C:\\Program Files\\in.txt";

        //FILEREADER = LEITOR DE ARQUIVO
        //BUFFEREDREADER = DEIXA A LEITURA MAIS RÁPIDA
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //CRIA UM LEITOR DE LINHA NA VARIÁVEL
            String line = br.readLine();

            //ENQUANTO A LINHA NÃO FOR NULL (ARQUIVO ACABADO) FAZ O PRINT E LÊ A LINHA
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }

}
