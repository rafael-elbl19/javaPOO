package application;

import util.encapsulamentoUtil;

public class encapsulamento {
    public static void main(String[] args) {

        encapsulamentoUtil conta = new encapsulamentoUtil();

        conta.name = "Rafael";
        conta.cpf = "120.222.222-32";
        conta.setMoney(0.00);

        System.out.println(conta.cpf);
        System.out.println(conta.name);
        System.out.println(conta.getMoney());

    }

}
