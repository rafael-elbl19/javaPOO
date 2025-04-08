package models.applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\rafae\\OneDrive\\Área de Trabalho\\javaStudies\\Java\\MapExercise\\votos.txt";

        Map<String, Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(", ");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    //pega o conteúdo da key "name" e implementa com a variável votosAteAgora
                    int votosAteAgora = votes.get(name);
                    votes.put(name, count + votosAteAgora);
                } else {
                    votes.put(name, count);
                }

                line = br.readLine();
            }
            for(String f : votes.keySet()) {
                System.out.println("Votos de " + f + " - " + votes.get(f));
            }

        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }

    }
}