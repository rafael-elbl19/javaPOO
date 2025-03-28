package entities;

public class OutsorceredEmployee extends Employee {

    private Double additionalCharge;

    public OutsorceredEmployee(String name, Double valuePerHours, Integer hours, Double additionalCharge) {
        super(name, valuePerHours, hours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment () {
        return super.payment() + 1.1 * additionalCharge;
    }

}
