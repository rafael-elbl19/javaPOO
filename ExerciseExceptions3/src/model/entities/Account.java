package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer numero;
    private String nome;
    private Double saldo;
    private Double limiteSaque;

    public Account(Integer numero, String nome, Double saldo, Double limiteSaque) throws DomainException {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;

        if (saldo < limiteSaque) {
            throw new DomainException("ERRO: Limite de saque não pode ser maior do que o saldo!");
        }

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposit(Double amount) {
        saldo += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (saldo == 0) {
            throw new DomainException("ERRO: Não há saldo!");
        }
        if (saldo < amount) {
            throw new DomainException("ERRO: Saldo insuficiente!");
        }
        saldo -= amount;
    }
}
