package entities;

public class marketStock {

    public String name;
    public double price;
    public int quantity;

    public marketStock(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double value () {
        return price * quantity;
    }

    public int newItems(int quantityToAdd) {
        this.quantity += quantityToAdd;  // Adiciona a quantidade fornecida ao estoque
        return this.quantity;  // Retorna a nova quantidade total
    }

    public String toString() {
        return "Nome: " + name + ", Preço: R$" + String.format("%.2f", price) + ", Quantidade: " + quantity;
    }
}