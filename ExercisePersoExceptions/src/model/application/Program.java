package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int room = sc.nextInt();
            System.out.print("Data de CheckIn: ");
            sc.nextLine();
            Date checkin = sdf.parse(sc.nextLine());
            System.out.print("Data de CheckOut: ");
            Date checkout = sdf.parse(sc.nextLine());

            Reservation r = new Reservation(room, checkin, checkout);
            System.out.println(r.toString());

            System.out.println("Atualize a reserva: ");
            System.out.print("Data de CheckIn atualizada: ");
            Date checkinAT = sdf.parse(sc.nextLine());
            System.out.print("Data de CheckOut atualizada: ");
            Date checkoutAT = sdf.parse(sc.nextLine());

            r.updateDates(checkinAT, checkoutAT);
            System.out.println(r);

        //TRATAMENTO DO ERRO PARSE
        } catch (ParseException e1) {
            System.out.println("Formato de data inválido!");
        //TRATANDO ERRO COM MENSAGEM PERSONALIZADA
        } catch (DomainException e2) {
            System.out.println(e2.getMessage());
        //CASO HAJA QUAISQUER OUTROS ERROS INESPERADOS
        //Qualquer erro ele dará Upcasting para RuntimeException e mostrará a mensagem
        } catch (RuntimeException e3) {
            System.out.println("Erro inesperado. RuntimeException");
        }
        sc.close();
    }

}
