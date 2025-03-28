
//EXTENDE A CLASSE herancaAccount
//ESPECIALIZAÇÃO DA CLASSE GENÉRICA
//ASSOCIAÇÃO ENTRE CLASSES, E NÃO ENTRE OBJETOS

package entities;

public class herancaAccountBusiness extends herancaAccount{

    private Double loanLimit;

    public herancaAccountBusiness(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //Chama os argumentos da superclasse
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan (Double amount) {
        if (amount <= loanLimit) {
            //deposit(amount);
            balance += amount - 10.00;
        } else {
            System.out.println("No limit for this operation");
        }
    }

    @Override
    public void withdraw (Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
