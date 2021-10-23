package problema1;

import java.util.*;
/**
 * Problema 1
 *
 * Exibir um conjunto de números inteiros informados pelo usuário
 *
 * @author yuri-italo
 */
public class Problema1 {
    public static void main(String[] args) {
        int quantidade = 0;

        while (true) {
            try {
                quantidade = validarQuantidade();
                break;
            } catch (InputMismatchException e) {
                System.out.println("[ERRO] Entrada inválida.");
            } catch (NegativeArraySizeException e) {
                System.out.println("[ERRO] Quantidade não pode ser negativa");
            }
        }
        visualizarConjunto(quantidade);
    }

    private static int validarQuantidade() {
        var entrada = new Scanner(System.in);
        int quantidade;

        System.out.print("Informe a quantidade de números inteiros: ");
        quantidade = entrada.nextInt();

        if (quantidade < 0)
            throw new NegativeArraySizeException();
        else
            return quantidade;
    }

    private static void visualizarConjunto(int quantidade) {
        if (quantidade == 0)
            System.out.println("Conjunto vazio.");
        else {
            var entrada = new Scanner(System.in);
            List<Integer> conjunto = new ArrayList<>();

            System.out.println("Informe " + quantidade + " números inteiros: ");
            while (true) {
                try {
                    for (int i = 0; i < quantidade; i++) {
                        conjunto.add(entrada.nextInt());
                        if (conjunto.size() == quantidade)
                            break;
                    }
                    break;
                } catch (InputMismatchException e) {
                    entrada.nextLine();
                    System.out.println("[ERRO] Entrada inválida.");
                }
            }
            System.out.println("Conjunto: " + conjunto);
        }
    }
}
