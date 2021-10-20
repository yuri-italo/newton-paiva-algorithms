import java.util.Stack;
/**
 * Problema
 *
 * Dada uma pilha, imprimir o inverso dela na tela
 *
 * @author yuri-italo
 */
public class Ex1PilhaInvertida {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Sakura");
        pilha.push("Naruto");
        pilha.push("Sasuke");
        pilha.push("Kakashi");
        pilha.push("Shikamaru");
        pilha.push("Rock Lee");
        pilha.push("Shino");
        pilha.push("Jiraya");
        pilha.push("Maito Guy");
        pilha.push("Minato");

        for (var nome : pilha)
            System.out.println(nome);
    }
}
