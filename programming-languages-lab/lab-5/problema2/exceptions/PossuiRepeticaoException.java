package problema2.exceptions;

public class PossuiRepeticaoException extends Exception{
    public PossuiRepeticaoException() {
        super("Não é permitido repetições.\n ex: AA, cc");
    }
}
