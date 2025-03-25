package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class enumeracao {

    public static void main(String[] args) {

        /*
        * Um produto desde seu pedido passa por "processos" ou "situações"
        * Exemplo: Processando pedido -> Processando pagamento -> Despachando -> Entrega
        * Esses tipos são chamados enumerações
        * */

        //Passando parâmetros pelo construtor e imprimindo com toString
        Order order = new Order(1010, new Date(), OrderStatus.PROCESSANDO_PAGAMENTO);
        System.out.println(order);

        //Imprimindo valores criando um vetor
        OrderStatus[] status = OrderStatus.values();
        for (OrderStatus valores : status) {
            System.out.println(valores);
        }
        System.out.println(status[0]); //pegando de um índice do vetor



    }

}
