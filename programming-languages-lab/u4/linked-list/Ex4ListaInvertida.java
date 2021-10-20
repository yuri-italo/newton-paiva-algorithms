import java.util.LinkedList;
import java.util.Stack;
/**
 * Problema
 *
 * Inverter uma lista encadeada
 *
 * @author yuri-italo
 */
public class Ex4ListaInvertida {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        Stack<String> aux = new Stack<>();
        lista.add(0,"Cristiano Ronaldo");
        lista.add(1,"Kaká");
        lista.add(1,"Messi");
        lista.offerLast("Ronaldo Fenômeno");
        lista.add(2,"Zidane");
        lista.offerFirst("Ronaldinho Gaúcho");
        lista.add(4,"Roberto Carlos");

        System.out.println("Lista: " + lista);
        while (!lista.isEmpty())
            aux.push(lista.remove());

        while (!aux.isEmpty())
            lista.add(aux.pop());

        System.out.println("Lista invertida: " + lista);
    }
}
