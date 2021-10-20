import java.util.Scanner;
import java.util.Stack;
/**
 * Problema
 *
 * Pesquisa sequencial de uma chave de dentro da pilha
 *
 * @author yuri-italo
 */
public class Ex3PesquisaSequencial {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.push(9);
        pilha.push(10);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        buscaSequencial(numero,pilha);
    }

    public static void buscaSequencial(int numero, Stack<Integer> pilha) {
        while (!pilha.isEmpty())
            if (pilha.pop() == numero)
                break;

        if (pilha.isEmpty())
            System.out.println("O número " + numero + " não existe na pilha.");
        else
            System.out.println("O número " + numero + " existe na pilha.");
    }
}
