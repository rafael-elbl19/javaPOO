package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.reservation;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int room = sc.nextInt();
        System.out.print("Data de CheckIn: ");
        sc.nextLine();
        Date checkin = sdf.parse(sc.nextLine());
        System.out.print("Data de CheckOut: ");
        Date checkout = sdf.parse(sc.nextLine());

        reservation r = new reservation(room, checkin, checkout);

        System.out.println(r.toString());

        sc.close();
    }

}
