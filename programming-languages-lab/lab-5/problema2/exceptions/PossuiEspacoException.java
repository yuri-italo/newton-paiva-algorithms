package problema2.exceptions;

public class PossuiEspacoException extends Exception {
    public PossuiEspacoException() {
        super("Não são permitidos espaços.");
    }
}
