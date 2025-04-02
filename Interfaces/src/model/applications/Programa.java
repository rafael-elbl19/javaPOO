package model.applications;

import model.services.PagamentoOnlineServices;
import model.services.PaypalServices;

public class Programa {
    public static void main(String[] args) {

        PagamentoOnlineServices p1 = new PaypalServices();
        System.out.println(p1.juros(200.00, 3));

    }
}