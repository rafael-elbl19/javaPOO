package model.applications;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos do curso A");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.print("Digite o número de alunos do curso B");
        n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            b.add(sc.nextInt());
        }
        System.out.print("Digite o número de alunos do curso C");
        n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            c.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de alunos: " + total.size());

        sc.close();
    }
}