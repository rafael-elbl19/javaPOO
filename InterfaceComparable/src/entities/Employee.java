package entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    //COMPARA DOIS OBJETOS E RETORNA UM NUMERO INTEIRO RELACIONANDO OS OBJETOS
    public int compareTo(Employee other) {
        //PARA ORDENAR POR SALARIO, SÓ TROCAR DE name PARA salary!
        return name.compareTo(other.getName());
    }
}
