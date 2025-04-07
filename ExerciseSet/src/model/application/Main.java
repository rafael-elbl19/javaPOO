package model.application;

import model.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the file path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logs = new HashSet<>();

            //LEMOS A PRIMEIRA LINHA DO ARQUIVO
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                //Declara uma data de um instante declarado como fields[1]
                Date moment = Date.from(Instant.parse(fields[1]));
                logs.add(new LogEntry(username, moment));
                //Manda ler a próxima linha
                line = br.readLine();
            }
            System.out.println("Total users: " + logs.size());

        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }

        sc.close();
    }
}