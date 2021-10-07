package av1.Problema1;

/**
 * Problema 1:
 *
 * Entrada: um vetor de palavras previamente preenchido.
 * Saída: informar qual é a maior palavra do conjunto e o seu tamanho.
 *
 * @author yuri-italo
 *
 */

public class Main {
    public static void main(String[] args) {
        String [] palavras = {"the", "book", "table", "orange", "football"};
        int maior = 0;

        for (var palavra : palavras)
            if (palavra.length() > maior)
                maior = palavra.length();

        System.out.print("A(s) maior(es) palavra(s) do conjunto é(são): ");
        for (var palavra : palavras)
            if (palavra.length() == maior)
                System.out.print(palavra + " ");

        System.out.println("\nTamanho: " + maior);
    }
}
