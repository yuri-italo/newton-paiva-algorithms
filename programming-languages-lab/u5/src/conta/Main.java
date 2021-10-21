package conta;

public class Main {
    public static void main(String[] args) {
        var conta = new ContaBancaria();
        conta.saldo = 100.0f;
        conta.estado = 1;

        try {
            conta.efetuarDeposito(101.01f);
            conta.efetuarSaque(50.50f);
        } catch (ValorInvalidoException | ContaBloqueadaParaOperacoesException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sessão finalizada.");
        }
    }
}
