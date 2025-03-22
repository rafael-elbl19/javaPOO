package entities;

public class entidadesListas1 {

    private String name;
    private int id;
    private double salary;

    public entidadesListas1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void percentageSalary (double percentage) {
        salary += salary * (percentage/100.00);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", R$" + salary;
    }
}
