package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    protected Integer hours;
    protected Double valuePerHours;

    public Employee(String name, Double valuePerHours, Integer hours) {
        this.name = name;
        this.valuePerHours = valuePerHours;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public Double payment () {
        return valuePerHours * hours;
    }

}
