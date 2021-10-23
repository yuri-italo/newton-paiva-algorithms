package problema2.exceptions;

public class NaoPossuiSimboloException extends Exception {
    public NaoPossuiSimboloException() {
        super("A senha deve conter pelo menos um dos símbolos.\n    ! @ # ? ]");
    }
}
