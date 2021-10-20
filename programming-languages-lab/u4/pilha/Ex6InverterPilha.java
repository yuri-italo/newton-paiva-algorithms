import java.util.Stack;
/**
 * Problema
 *
 * Inverter pilha
 *
 * @author yuri-italo
 */
public class Ex6InverterPilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> aux = new Stack<>();

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
            aux.push(pilha.pop());

        for (var numero : aux) {
            pilha.push(numero);
        }

        System.out.println("Pilha invertida: " + pilha);
    }
}
