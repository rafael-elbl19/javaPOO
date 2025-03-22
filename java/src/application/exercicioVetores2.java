package application;

import java.util.Scanner;
import entities.entidadesVetores2;

public class exercicioVetores2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Quantas pessoas serão inseridas?");
            int n = sc.nextInt();

        entidadesVetores2[] vect = new entidadesVetores2[n];

        for (int i=0; i< vect.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome da %da pessoa: ", i+1);
            String name = sc.nextLine();
            System.out.printf("Digite a idade da %da pessoa: ", i+1);
            int age = sc.nextInt();
            System.out.printf("Digite a altura da %da pessoa: ", i+1);
            double height = sc.nextDouble();
            vect[i] = new entidadesVetores2(name, age, height);
        }

        double ageAvg = 0;
        for (int i=0; i< vect.length; i++) {
            ageAvg += (double) vect[i].getAge() / vect.length;
        }

        if(vect.length > 1) {
            System.out.println("Média das idades: " + ageAvg);
        }

        int cont = 0;
        for (int i=0; i< vect.length; i++) {
            if (vect[i].getAge() < 16) {
                cont += 1;
            }
        }

        double percent = (cont * 100.0) / vect.length;
        System.out.printf("%.1f%% pessoas menores de 16 anos", percent);

        sc.close();

    }
}
