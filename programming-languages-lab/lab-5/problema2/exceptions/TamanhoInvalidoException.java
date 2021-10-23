package problema2.exceptions;

public class TamanhoInvalidoException extends Exception {
    public TamanhoInvalidoException() {
        super("A senha deve ter entre 8 e 12 caracteres.");
    }
}
