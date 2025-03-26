package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private workerDepartment department; //Um trabalhador tem um departamento
    private List<HourContract> contracts = new ArrayList<>();


    public Worker(String name, WorkerLevel level, Double baseSalary, workerDepartment department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public workerDepartment getDepartment() {
        return department;
    }

    public void setDepartment(workerDepartment department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    } //nao pode ter um setList pq a lista so é movimentada pelo add e pelo remove

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public String income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract cont : contracts) {
            cal.setTime(cont.getDate());
            int cont_year = cal.get(Calendar.YEAR);
            int cont_month = 1 + cal.get(Calendar.MONTH); //mês do calendar comeca com zero
            if (year == cont_year && month == cont_month) {
                sum += cont.totalValue();
            }
        }
        return "Salário em " + month + "/" + year + ": " + sum;
    }
}
