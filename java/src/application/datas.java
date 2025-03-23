package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datas {

    public static void main(String[] args) {

        //Data de hoje no local que estou
        LocalDate d1 = LocalDate.now();

        //Com tempo
        LocalDateTime d2 = LocalDateTime.now();

        //Data e horário em Londres
        Instant d3 = Instant.now();

        System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n");

        //Formatação de data para o padrão desejado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d4 = LocalDate.parse("22/03/2025", fmt1);

        //Pegando a data e hora do sistema do usuário
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d5 = LocalDateTime.now();

        System.out.println("Data: " + d4.format(fmt1));
        System.out.println("Data com horário: " + d5.format(fmt2));

        //Operações com data e hora
        LocalDateTime pastWeek = d5.minusDays(7);
        System.out.println("Semana passada: " + pastWeek.format(fmt2));

        //Diferenca ente datas
        Duration t1 = Duration.between(d5.minusDays(7), d5);
        System.out.println("Diferença entre os dias: " + t1.toDays());

    }

}
