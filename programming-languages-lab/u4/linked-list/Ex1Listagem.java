import java.util.LinkedList;
/**
 * Problema
 *
 * Listagem das chaves numa lista encadeada pela ordem de encadeamento
 *
 * @author yuri-italo
 */
public class Ex1Listagem {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add(0,"Cristiano Ronaldo");
        lista.add(1,"Kaká");
        lista.add(1,"Messi");
        lista.offerLast("Ronaldo Fenômeno");
        lista.add(2,"Zidane");
        lista.offerFirst("Ronaldinho Gaúcho");
        lista.add(4,"Roberto Carlos");

        for (var nome : lista) {
            System.out.println(nome);
        }
    }
}
