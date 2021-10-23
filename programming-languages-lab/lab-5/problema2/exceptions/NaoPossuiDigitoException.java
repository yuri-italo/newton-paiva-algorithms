package problema2.exceptions;

public class NaoPossuiDigitoException extends Exception {
    public NaoPossuiDigitoException() {
        super("A senha deve conter pelo menos um dígito (0-9).");
    }
}
