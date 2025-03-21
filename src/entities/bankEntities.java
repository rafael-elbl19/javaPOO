package entities;

public class bankEntities {

    public final int TAX = 5;
    public String account;
    public String name;
    private double money;
    public double putMoney;
    public double getMoney;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void calculate() {
        this.money = this.money + putMoney;
        System.out.println("Hi, " + this.name);
        System.out.println("Your account is: " +  account);
        System.out.println("You have $" + this.money);
    }
}
