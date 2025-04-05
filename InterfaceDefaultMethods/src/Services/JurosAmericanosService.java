package Services;

public class JurosAmericanosService implements JurosService{

    private final double jurosAmericanos;

    public JurosAmericanosService(double jurosAmericanos) {
        this.jurosAmericanos = jurosAmericanos;
    }

    @Override
    public double getJuros() {
        return jurosAmericanos;
    }
}
