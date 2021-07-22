package com.bank;

public interface Operacoes {
    public void escolherConta(Corrente CC, Poupanca CP);
    public void escolherTransferencia(Corrente CC, Poupanca CP);
    public void fazerCadastro(Corrente CC, Poupanca CP);
    public void mostrarMenuPrincipal();
    public void creditar(Corrente CC, Poupanca CP);
    public void debitar(Corrente CC, Poupanca CP);
    public void transferir(Corrente CC, Poupanca CP);
    public void verExtrato(Corrente CC, Poupanca CP);
}
