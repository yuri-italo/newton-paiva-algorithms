import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * Problema
 *
 * Dada uma fila, pesquisar por uma chave dentro dela
 *
 * @author yuri-italo
 */
public class Ex1Pesquisa {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
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

        System.out.print("Digite um time: ");
        String time = entrada.nextLine();

        if (fila.contains(time))
            System.out.println(time + " existe na fila.");
        else
            System.out.println(time + " não existe na fila.");
    }
}
