package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        price += customsFee;
        return price;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" R$" + String.format("%.2f", totalPrice()));
        sb.append(" (Taxa de alfândega: " + getCustomsFee() + ")");
        return sb.toString();
    }
}
