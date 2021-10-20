import java.util.LinkedList;
import java.util.Scanner;
/**
 * Problema
 *
 * Busca por uma chave na lista encadeada
 *
 * @author yuri-italo
 */
public class Ex3Busca {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();
        lista.add(0,"Cristiano Ronaldo");
        lista.add(1,"Kaká");
        lista.add(1,"Messi");
        lista.offerLast("Ronaldo Fenômeno");
        lista.add(2,"Zidane");
        lista.offerFirst("Ronaldinho Gaúcho");
        lista.add(4,"Roberto Carlos");

        System.out.print("Digite um nome: ");
        String nome = entrada.nextLine();

        if (!lista.contains(nome))
            System.out.println("O nome não existe na lista");
        else
            System.out.println(nome + " se encontra no índice " + lista.indexOf(nome));
    }
}
