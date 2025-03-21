package entities;

public class salaryIncrease {

    public String name;
    public double salary;
    public double discount;

    public double finalSalary() {
        return this.salary - (this.salary*(this.discount/100));
    }
}
