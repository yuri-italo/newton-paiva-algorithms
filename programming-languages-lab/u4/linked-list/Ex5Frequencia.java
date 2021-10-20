import java.util.LinkedList;
import java.util.Scanner;

/**
 * Problema
 *
 * Contabilizar a frequência de uma chave numa lista encadeada
 *
 * @author yuri-italo
 */
public class Ex5Frequencia {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int frequencia = 0;
        LinkedList<String> lista = new LinkedList<>();
        lista.add(0,"Cristiano Ronaldo");
        lista.add(1,"Kaká");
        lista.add(1,"Messi");
        lista.offerLast("Ronaldo Fenômeno");
        lista.add(2,"Zidane");
        lista.offerFirst("Ronaldinho Gaúcho");
        lista.add(4,"Roberto Carlos");
        lista.add(6,"Messi");
        lista.add(7,"Messi");
        lista.add(8,"Cristiano Ronaldo");
        lista.add(9,"Cristiano Ronaldo");
        lista.add(10,"Cristiano Ronaldo");

        System.out.print("Digite um nome: ");
        String nome = entrada.nextLine();
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).equals(nome))
                frequencia++;

        System.out.println(nome + " aparece " + frequencia + " vez(es).");
    }
}
