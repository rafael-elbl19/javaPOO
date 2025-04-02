package model.applications;

import model.entities.Contrato;
import model.entities.Parcelamentos;
import model.services.ContratoService;
import model.services.PagamentoOnlineServices;
import model.services.PaypalServices;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato: ");
        System.out.print("Número: ");
        Integer numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data do contrato (DIA/MÊS/ANO): ");
        Date data = sdf.parse(sc.nextLine());
        System.out.print("Valor total do contrato: ");
        Double valorTotal = sc.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        Integer qtdParcelas = sc.nextInt();

        //NOVO CONTRATINHO
        Contrato c = new Contrato(numero, data, valorTotal);
        //INSTANCIO UM NOVO SERVIÇO DE CONTRATO PASSANDO UM NOVO SERVICO DO BANCO
        ContratoService cs = new ContratoService(new PaypalServices());
        cs.divisorParcelas(c, qtdParcelas);

        System.out.println("Parcelamento: ");
        for (Parcelamentos p : c.getList()) {
            System.out.println(p);
        }
    }
}