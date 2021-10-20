import java.util.Stack;
/**
 * Problema
 *
 * Dada uma pilha de números naturais, dividir a pilha em duas: pares e ímpares
 *
 * @author yuri-italo
 */
public class Ex2ParesEImpares {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> pares = new Stack<>();
        Stack<Integer> impares = new Stack<>();

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

        while (!pilha.isEmpty())
            if (pilha.peek() % 2 == 0)
                pares.push(pilha.pop());
            else
                impares.push(pilha.pop());

        System.out.println("Pares: " + pares + "\nÍmpares: " + impares);
    }
}
