package problema2.exceptions;

public class NaoPossuiMaiusculoException extends Exception {
    public NaoPossuiMaiusculoException() {
        super("A senha deve ter pelo menos uma letra maiúscula.");
    }
}
