import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * Problema
 *
 * Dada uma fila, retornar a fila invertida
 *
 * @author yuri-italo
 */
public class Ex3FilaInvertida {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Queue<String> fila = new LinkedList<>();
        fila.offer("Cruzeiro");
        fila.offer("Atlético");
        fila.offer("América");
        fila.offer("Ipatinga");
        fila.offer("Vila Nova");
        fila.offer("Patrocinense");
        fila.offer("Tupi");
        fila.offer("Caldense");
        fila.offer("URT");
        fila.offer("Coimbra");

        System.out.println("Fila: " + fila);
        while (!fila.isEmpty())
            pilha.push(fila.poll());

        while (!pilha.isEmpty())
            fila.offer(pilha.pop());

        System.out.println("Fila invertida: " + fila);
    }
}
