package conta;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(float saldo, float valor) {
        super("Saldo da conta (" + String.format("%.2f",saldo) + ") insuficiente para saque: " + String.format("%.2f",valor));
    }
}