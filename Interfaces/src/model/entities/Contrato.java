package model.entities;

import model.services.ContratoService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer numero;
    private Date data;
    private Double valorContrato;

    List<Parcelamentos> lista = new ArrayList<>();

    public Contrato(Integer numero, Date data, Double valorContrato) {
        this.numero = numero;
        this.data = data;
        this.valorContrato = valorContrato;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcelamentos> getList() {
        return lista;
    }
}
