import java.util.Stack;
/**
 * Problema
 *
 * Informar o elemento no fundo
 *
 * @author yuri-italo
 */
public class Ex7ElementoDoFundo {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.push(9);
        pilha.push(10);

        System.out.println("Pilha: " + pilha);
        System.out.println("Elemento no fundo: " + pilha.firstElement());
    }
}
