package application;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
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

        /* FILEWRITER: Escrevendo em arquivos
        *  new FileWriter(path) - cria um novo arquivo ou recria o mesmo
        *  new FileWriter(path, true) - acrescenta a um arquivo existente
        *  BufferedWriter - deixa a leitura mais rápida
        * */

        //PRÉ-SETANDO O CONTEÚDO DAS LINHAS DO ARQUIVO COM VETOR
        String[] linhas = new String[] {"Linha 1", "Linha 2", "Linha 3"};
        String path2 = "C:\\Users\\rafae\\OneDrive\\Documentos\\out.txt";

        //O TRUE GARANTE QUE UM NOVO ARQUIVO NÃO SEJA CRIADO
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))){
            //PERCORRER O VETOR LINHAS
            for (String linha : linhas) {
                //ESCREVENDO O ELEMENTO DA STRING NO ARQUIVO
                bw.write(linha);
                //QUEBRA DE LINHA
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }

}
