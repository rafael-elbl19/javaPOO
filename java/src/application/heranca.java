package application;

import entities.herancaAccount;
import entities.herancaAccountBusiness;
import entities.savingsAccount;

public class heranca {

    public static void main(String[] args) {

        herancaAccount acc = new herancaAccount(0001, "Rafael", 0.0);

        herancaAccountBusiness accB = new herancaAccountBusiness(0002, "Isabella", 0.0, 1000.0);

        /* UPCASTING ----------------------------------------------------------------------
        * Atribuir ao objeto acc o objeto accB
        * Alguns tipos de upcasting:
        * 1) Atribuir o objeto já criado à sua superclasse
        * 2) Criar novos objetos das subclasses e atribuir a superclasse
        * */
        herancaAccount acc1 = accB;
        herancaAccount acc2 = new herancaAccountBusiness(0003, "Bob", 0.0, 500.00);
        herancaAccount acc3 = new savingsAccount(0004, "Mary", 200.0, 0.01);


        /* DOWNCASTING ---------------------------------------------------------------------
        * Atribuir um objeto da superclasse à subclasse
        * Se quiser fazer um empréstimo numa conta Account, deve fazer o downcasting para a BusinessAccount e aí sim realizar a operação.
        * Exemplo de downcasting:
        * 1) Deve fazer um casting para forçar
        * 2) Nem toda vez dará certo e só aparece o erro na hora de compilar, como no exemplo dois tentando fazer um downcast de uma subclasse para outra subclasse não relacionada
        * */

        herancaAccountBusiness acc4 = (herancaAccountBusiness) acc2;
        acc4.loan(100.0);

        //herancaAccountBusiness acc5 = (herancaAccountBusiness) acc3;
        if (acc3 instanceof herancaAccountBusiness) {
            herancaAccountBusiness acc5 = (herancaAccountBusiness) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!" + acc5.getBalance());
        } else {
            System.out.println("O objeto acc3 não é uma instância de AccountBusiness, mas sim de SavingsBusiness");
        }

        if (acc3 instanceof savingsAccount) {
            savingsAccount acc5 = (savingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }
    }

}
