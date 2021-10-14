package av1.Problema2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problema 2:
 *
 * Entrada: um conjunto de valores predefinidos (inteiro) num vetor.
 *
 * Saída:
 * a) Gerar um novo vetor que NÃO permite valores duplicados.
 * b) Exibir o novo vetor na ordem invertida do original.
 *
 * @author yuri-italo
 *
 */

public class Main {
    public static void main(String[] args) {
        int [] valores = {3, 8, 2, 6, 4, 1, 9, 8, 4};
        List<Integer> lista = new ArrayList<>();
        List<Integer> aux;

        Arrays.stream(valores)
                .forEach(lista::add);

        aux = lista.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.print("Vetor gerado: ");
        for (var num : aux)
            System.out.print(num + " ");


        System.out.print("\nVetor invertido: ");
        for (int i = aux.size() - 1; i >= 0  ; i--)
            System.out.print(aux.get(i) + " ");

        System.out.print("\nValores duplicados: ");
        Set<Integer> repetidos = lista.stream()
                .filter(x -> Collections.frequency(lista, x) > 1)
                .collect(Collectors.toSet());

        for (var numero : repetidos)
            System.out.print(numero + " ");
    }
}
