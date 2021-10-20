import java.util.LinkedList;
/**
 * Problema
 *
 * Listagem das chaves numa lista encadeada em ordem invertida (final primeiro)
 *
 * @author yuri-italo
 */
public class Ex2ListagemInvertida {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add(0,"Cristiano Ronaldo");
        lista.add(1,"Kaká");
        lista.add(1,"Messi");
        lista.offerLast("Ronaldo Fenômeno");
        lista.add(2,"Zidane");
        lista.offerFirst("Ronaldinho Gaúcho");
        lista.add(4,"Roberto Carlos");

        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
}
