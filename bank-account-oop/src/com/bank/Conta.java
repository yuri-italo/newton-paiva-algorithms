package com.bank;

public abstract class Conta {
    private int numeroConta;
    private float saldoInicial;
    private float movimentacao;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(float movimentacao) {
        this.movimentacao = movimentacao;
    }
}
