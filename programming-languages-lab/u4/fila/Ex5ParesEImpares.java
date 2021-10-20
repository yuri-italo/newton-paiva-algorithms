import java.util.LinkedList;
import java.util.Queue;
/**
 * Problema
 *
 * Dada uma fila de inteiros, dividir a ﬁla em duas: pares e ímpares
 *
 * @author yuri-italo
 */
public class Ex5ParesEImpares {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Queue<Integer> pares = new LinkedList<>();
        Queue<Integer> impares = new LinkedList<>();

        fila.offer(1);
        fila.offer(2);
        fila.offer(3);
        fila.offer(4);
        fila.offer(5);
        fila.offer(6);
        fila.offer(7);
        fila.offer(8);
        fila.offer(9);
        fila.offer(10);

        for (var numero : fila)
            if (numero % 2 == 0)
                pares.offer(numero);
            else
                impares.offer(numero);
        System.out.println("Fila: " + fila);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
