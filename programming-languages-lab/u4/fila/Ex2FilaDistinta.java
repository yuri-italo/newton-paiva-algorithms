import java.util.LinkedList;
import java.util.Queue;
/**
 * Problema
 *
 * Implementar uma fila que não permite chaves duplicadas
 *
 * @author yuri-italo
 */
public class Ex2FilaDistinta {
    public static void main(String[] args) {
        int[] numeros  = {1,5,6,8,9,10,20,1,6,20,7,60,20,41,1,35,10,6,78,10,1,6,20,57,60};
        Queue<Integer> fila = new LinkedList<>();

        System.out.print("Entrada: ");
        for (var numero : numeros) {
            System.out.print(numero + " ");
        }

        for (var numero : numeros)
            if (!fila.contains(numero))
                fila.offer(numero);
        System.out.println("\nFila distinta: " + fila);
    }
}
