package br.com.contaBancaria.model;

public class ContaBancariaModel {
    private int numeroDaConta;
    private Float saldoDaConta;
    private String titular;

    public ContaBancariaModel(String titular, int numeroDaConta, Float saldoDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Float getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Float saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }
}
