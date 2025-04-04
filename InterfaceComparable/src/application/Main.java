package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\rafae\\Documents\\listTeste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }
            for (String s : list) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        sc.close();
    }
}