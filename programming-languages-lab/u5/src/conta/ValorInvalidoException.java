package conta;

public class ValorInvalidoException extends Exception{

    public ValorInvalidoException(float valor) {
        super("Valor inválido, apenas valores positivos são permitidos: R$" + String.format("%.2f",valor));
    }
}