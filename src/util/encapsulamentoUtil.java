package util;

public class encapsulamentoUtil {

    public String cpf;
    public String name;
    private double money; //torna inacessível, dado só pode ser alterado na própria classe

    public encapsulamentoUtil() { //Como uma variável setada em 0.00 sempre que inicia o programa
        money = 0.00;
    }

    public encapsulamentoUtil(String name, String cpf) {
        this(); //para evitar instanciar o dinheiro como 0.00 dnv e repetir código, você chama o construtor que não possui argumentos, no caso o de cima.
        this.cpf = cpf;
        this.name = name;
    }

    public String getMoney() {
        if (money <= 0.00) {
            System.out.println("Insert some money to be up to date with your bank account");
        }
        return "Current money: " + money;

        //Apenas retorna o valor quando chamada a função
    }

    public void setMoney(double money) {

        this.money = money;

        /*Permite que você altere o saldo
        * Não é a mesma coisa que apenas mostrar o valor, possibilita você criar uma lógica em cima desse saldo do cliente
        * Um exemplo seria uma regra para não permitir inserir um valor negativo*/
    }

}
