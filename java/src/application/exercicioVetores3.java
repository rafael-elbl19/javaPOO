package application;

import entities.entidadesVetores3;

import java.util.Scanner;

public class exercicioVetores3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        entidadesVetores3[] rooms = new entidadesVetores3[10];

        System.out.println("how many rooms will be rented?");
        int n = sc.nextInt();

        for(int i=0; i < n; i++) {

            System.out.println("Rent #" + i+1);
            sc.nextLine();
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter email:");
            String email = sc.nextLine();
            System.out.println("Enter room:");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new entidadesVetores3(name, email);
        }

        System.out.println("");
        System.out.println("Busy rooms: ");
        for (int i=0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }

}
