package Services;

public class JurosBrasileirosService implements JurosService{

    private final double jurosBrasileiros;

    public JurosBrasileirosService(double jurosBrasileiros) {
        this.jurosBrasileiros = jurosBrasileiros;
    }

    @Override
    public double getJuros() {
        return jurosBrasileiros;
    }

}
