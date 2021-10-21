package conta;

public class ContaBancaria {
    float saldo;
    int estado; // 0 - inativo, 1 - bloqueado, 2 - ativo

    public void efetuarSaque(float valor) throws ContaBloqueadaParaOperacoesException, ValorInvalidoException, SaldoInsuficienteException {
        validarOperacao(valor);
        validarSaque(valor);

        // caso de sucesso
        saldo = saldo - valor;
        System.out.println("Saque de " + String.format("%.2f",valor) + " realizado com sucesso.");
        System.out.println("Saldo disponível: R$" + String.format("%.2f",saldo));
        System.out.println("-------------------------------------------------------");
    }

    public void efetuarDeposito(float valor) throws ContaBloqueadaParaOperacoesException, ValorInvalidoException {
        validarOperacao(valor);

        // caso de sucesso
        saldo = saldo + valor;
        System.out.println("Depósito de R$" + String.format("%.2f",valor) + " realizado com sucesso.");
        System.out.println("Saldo disponível: R$" + String.format("%.2f",saldo));
        System.out.println("-------------------------------------------------------");
    }

    private void validarOperacao(float valor) throws ValorInvalidoException, ContaBloqueadaParaOperacoesException {
        // valor invalido (menor que zero)
        if (valor <= 0)
            throw new ValorInvalidoException(valor);

        // estado inválido (inativa, bloqueada)
        if (estado != 2)
            throw new ContaBloqueadaParaOperacoesException(estado);
    }

    private void validarSaque(float valor) throws SaldoInsuficienteException {
        // saldo insuficiente
        if (saldo < valor)
            throw new SaldoInsuficienteException(saldo, valor);
    }
}