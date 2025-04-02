package model.services;

public interface PagamentoOnlineServices {
    //NA INTERFACE APENAS DECLARA A ASSINATURA DOS MÉTODOS
    //SE A CLASSE FOR PAGAMENTO ONLINE, OBRIGA A IMPLEMENTAR ESSES MÉTODOS

    Double taxaDePagamento(Double quantia);
    Double juros(Double quantia, Integer qtdParcelas);

}
