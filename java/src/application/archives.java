package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class archives {

    public static void main(String[] args) {

        File file = new File("C:\\Program Files\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            //ENQUANTO O ARQUIVO TIVER UMA NOVA LINHA
            while (sc.hasNextLine()) {
                //LEIA ESSA LINHA E PRINTE
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }

}
