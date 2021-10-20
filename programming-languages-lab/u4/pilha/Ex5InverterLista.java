import java.util.LinkedList;
import java.util.Stack;
/**
 * Problema
 *
 * Inverter uma lista encadeada usando uma pilha intermediária
 *
 * @author yuri-italo
 */
public class Ex5InverterLista {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        LinkedList<String> lista = new LinkedList<>();
        lista.add(0,"Cristiano Ronaldo");
        lista.add(1,"Kaká");
        lista.add(2,"Messi");
        lista.add(3,"Ronaldo Fenômeno");
        lista.add(4,"Zidane");
        lista.add(5,"Ronaldinho Gaúcho");
        lista.add(6,"Roberto Carlos");

        System.out.println("Lista: " + lista);

        while (!lista.isEmpty())
            pilha.push(lista.remove());

        while (!pilha.isEmpty())
            lista.add(pilha.pop());

        System.out.println("Lista invertida: " + lista);
    }
}
