import java.util.Scanner;
import java.util.Stack;
/**
 * Problema
 *
 * Inverter uma frase usando uma pilha
 *
 * @author yuri-italo
 */
public class Ex4FraseInvertida {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++)
            pilha.push(frase.charAt(i));

        while (!pilha.isEmpty())
            System.out.print(pilha.pop());
    }
}
