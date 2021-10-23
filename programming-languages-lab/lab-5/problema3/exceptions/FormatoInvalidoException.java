package problema3.exceptions;

public class FormatoInvalidoException extends Exception{
    public FormatoInvalidoException() {
        super("O formato deve seguir o seguinte padrão:\n###.###.###-##");
    }
}
