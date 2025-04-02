package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamentos {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataParcelas;
    private Double quantia;

    public Parcelamentos(Date dataParcelas, Double quantia) {
        this.dataParcelas = dataParcelas;
        this.quantia = quantia;
    }

    public Date getDataParcelas() {
        return dataParcelas;
    }

    public void setDataParcelas(Date dataParcelas) {
        this.dataParcelas = dataParcelas;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    public String toString() {
        return sdf.format(dataParcelas) + " - R$" + String.format("%.2f", quantia);
    }

}
