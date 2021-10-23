package problema3.exceptions;

public class CpfInvalidoException extends Exception{
    public CpfInvalidoException() {
        super("O CPF informado é inválido.");
    }
}
