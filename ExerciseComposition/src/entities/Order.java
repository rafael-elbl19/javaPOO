package entities;

import entities.enumeracao.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    //INSTANCIAÇÕES
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itemsList = new ArrayList<OrderItem>(); //Transforma os itens enviados para OrderItem em uma lista

    //FORMATAÇÃO DE DATA
    LocalDateTime ldt1 = LocalDateTime.now();
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String momentoPedido = dtf1.format(ldt1);

    public Order(OrderStatus status, Client client) {
        this.client = client;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return itemsList;
    }

    public void addItems(OrderItem item) {
        itemsList.add(item);
    }

    public void removeItems(OrderItem item) {
        itemsList.remove(item);
    }

    double sum = 0;
    public double total() {
        for (OrderItem it : itemsList) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----HISTÓRICO DE PEDIDO:-----\n");
        sb.append("Momento do pedido: " + momentoPedido + "\n");
        sb.append("Status da ordem: " + status + "\n");
        sb.append(client);
        for (OrderItem item : itemsList) {
            sb.append(item + "\n");
        }
        sb.append("\n" + "Valor total: " + String.format("%.2f", total()));
        return sb.toString();

    }
}
