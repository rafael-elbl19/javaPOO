package application;

import java.util.Scanner;

public class matrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas e colunas ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        int cont = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j <mat[i].length; j++) {
                System.out.printf("Digite o elemento da linha %d coluna %d ", i+1, j+1);
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        for (int i=0; i<mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }

        System.out.println("Números negativos: " + cont);

        sc.close();
    }

}
