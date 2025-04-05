package Services;

import java.security.InvalidParameterException;

public interface JurosService {

    double getJuros();

    default double valorTotal(double quantia, int qtdParcelas) {
        if (qtdParcelas < 1) {
            throw new InvalidParameterException("Deve ser igual ou maior do que um");
        }
        return quantia*Math.pow(1.0 + getJuros() / 100.0, qtdParcelas);
    }
}

/*-------------------------------------------------ANOTAÇÕES------------------------------------------------------
* 1) Quando as classes serão muito parecidas, usa o método default para evitar repetição de código.
* 2) Mesmo assim, a classe não pode iniciar nenhum parâmetro, então estes devem ficar em suas classes.
* */


