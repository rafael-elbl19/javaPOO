package model.services;

public class PaypalServices implements PagamentoOnlineServices {
    //SERVE PARA QUE, EM UM SISTEMA GRANDE, ELE POSSA SER ALTERADO POR OUTRO BANCO E SÓ "ANEXAR" À INTERFACE
    //UMA CLASSE QUE MODIFICA UMA INTERFACE DEVE IMPLEMENTALA COM "implement"

    private static final double TAXA_DE_PAGAMENTO = 0.02;
    private static final double JURO_MENSAL = 0.01;

    @Override
    public Double taxaDePagamento(Double cotaBase) {
        return TAXA_DE_PAGAMENTO * cotaBase;
    }

    @Override
    public Double juros(Double cotaBase, Integer qtdParcelas) {
        return cotaBase * qtdParcelas * JURO_MENSAL;
    }

}
