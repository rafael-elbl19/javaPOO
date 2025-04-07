package model.entities;

public class Product {

    private String name;
    private Double quantity;

    public Product(Double quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double value) {
        this.quantity = value;
    }
}
