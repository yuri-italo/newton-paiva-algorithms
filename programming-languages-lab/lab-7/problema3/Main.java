import java.util.Scanner;
/**
 * Problema 3:
 *
 * Entrada: uma frase digitada pelo usuário
 * Saída: exibir a frase invertida usando recursão
 */
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        var phrase = sc.nextLine();

        System.out.println(reverse(phrase));
    }

    public static String reverse(String phrase) {
        return !phrase.equals("") ? reverse(phrase.substring(1)) + phrase.charAt(0) : phrase;
    }
}
