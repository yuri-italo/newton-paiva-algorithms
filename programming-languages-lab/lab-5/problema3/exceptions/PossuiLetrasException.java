package problema3.exceptions;

public class PossuiLetrasException extends Exception {
    public PossuiLetrasException() {
        super("Apenas números são permitidos.");
    }
}
