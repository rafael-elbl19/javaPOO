package util;

public class currencyConverter {

    public final double iof = 0.06;

    public static double finalAmount(double reais) {
        return (reais/5.74) - (0.06*(reais/5.74));
    }

}
