package model.services;

//ENGRENAGENS/CONTAS QUE FARÃO O VALOR TOTAL E A DATA INICIAL VIRAREM AS PARCELAS E A DATA DE CADA PARCELA
//VAI ANEXADA À INTERFACE, POIS A CLASSE DEVE SER ABERTA PARA EXTENSÃO E FECHADA PARA ALTERAÇÃO

    /*INVERSÃO DE CONTROLE
    1) Alguém de fora deve injetar a dependência aqui dentro (dependência = "new" Pagamento....)
    2) A classe ContratoService estar deixando outra classe dar o "new" é uma inversão de controle
    3) Outro cara de fora controla sua dependência específica
    * */

import model.entities.Contrato;
import model.entities.Parcelamentos;

import java.util.Calendar;
import java.util.Date;

public class ContratoService {

    private PagamentoOnlineServices pagamentoOnlineService;

    //CONSTRUTOR QUE OBRIGA A INJETAR DE FORA A DEPENDENCIA new
    public ContratoService(PagamentoOnlineServices pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    private Date adicionarMesesAsParcelas(Date data, int N) {
        //INSTANCIADO CALENDARIO CONFORME A DATA INFORMADA, TIPO UM CONSTRUTOR DA DATA :)
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        //ADICIONA AO CALENDÁRIO EM SUA ABA MÊS UM VALOR N
        c.add(Calendar.MONTH, N);
        //FAZER O CALENDÁRIO VOLTAR A VALER UM DATE
        return c.getTime();
    }

    //PROCESSO QUE VAI CRIAR A PARCELA BASE
    public void divisorParcelas(Contrato contrato, Integer qtdParcelas) {

        //CONTA QUE DÁ A PARCELA BASE
        double cotaBase = contrato.getValorContrato() / qtdParcelas;
        for (int i=1; i<=qtdParcelas; i++) {
            double valorDaParcelaComJuros = cotaBase + //COTA BASICA
                    pagamentoOnlineService.juros(cotaBase, i); //ADIÇÃO DOS JUROS
                     //ADIÇÃO DA TAXA
            double valorDaParcelaComJurosETaxa = valorDaParcelaComJuros + pagamentoOnlineService.taxaDePagamento(valorDaParcelaComJuros);
            //PEGA A DATA DO CONTRATO E COLOCA E INCREMENTA OS MESES CONFORME INCREMENTA O PARCELAMENTO
            Date dataDaParcelaFinal = adicionarMesesAsParcelas(contrato.getData(), i);
            contrato.getList().add( new Parcelamentos(dataDaParcelaFinal, valorDaParcelaComJurosETaxa));
        }
    }


}
