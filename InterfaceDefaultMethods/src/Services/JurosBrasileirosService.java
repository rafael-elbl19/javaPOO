package Services;

import java.security.InvalidParameterException;

public class JurosBrasileirosService {

    private Double juros;

    public JurosBrasileirosService(Double juros) {
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double valorFinal(Double quantia, int qtdParcelas) {
        if (qtdParcelas < 1) {
            throw new InvalidParameterException("Deve ser igual ou maior do que um");
        }
        return quantia*Math.pow(1.0 + juros / 100.0, qtdParcelas);
    }



}
