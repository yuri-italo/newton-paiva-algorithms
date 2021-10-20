import java.util.PriorityQueue;
import java.util.Queue;
/**
 * Problema
 *
 * Dada uma fila, implementar a lógica de prioridade no atendimento
 *
 * @author yuri-italo
 */
public class Ex4Prioridade {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
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

        System.out.println("Ordem de atendimento: ");
        int i = 1;
        for (var time : fila)
            System.out.println(i++ + "º " + time);
    }
}
