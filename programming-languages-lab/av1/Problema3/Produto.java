package av1.Problema3;

import java.time.LocalDate;
import java.util.List;

public class Produto {
    private final String nome;
    private final String marca;
    private final LocalDate dataDeFabricacao;
    private final float valor;

    public Produto(String nome, String marca, LocalDate dataDeFabricacao, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.dataDeFabricacao = dataDeFabricacao;
        this.valor = valor;
    }

    public static float somaTotal(List<Produto> lista) {
        float somaTotal = 0;
        System.out.print("A soma total dos produtos: R$");
        for (var produto: lista)
            somaTotal += produto.getValor();

        return somaTotal;
    }

    public static float media(List<Produto> lista, float somaTotal) {
        System.out.print("\nO valor médio dos produtos: R$");

        return somaTotal / lista.size();
    }

    public static void maisCaros(List<Produto> lista) {
        float maiorValor = 0;
        System.out.print("\n\nProduto(s) mais caro(s):\n");
        for (var produto: lista)
            if (produto.getValor() > maiorValor)
                maiorValor = produto.getValor();

        for (var produto: lista)
            if (produto.getValor() == maiorValor)
                System.out.println(produto);
    }

    public static void maisBaratos(List<Produto> lista) {
        float menorValor = lista.get(0).getValor();
        System.out.print("\nProduto(s) mais barato(s):\n");
        for (var produto: lista)
            if (produto.getValor() < menorValor)
                menorValor = produto.getValor();

        for (var produto: lista)
            if (produto.getValor() == menorValor)
                System.out.println(produto);
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto = " + nome +
                ", Marca = " + marca +
                ", Data de Fabricação = " + dataDeFabricacao +
                ", Valor = " + "R$ " + String.format("%.2f",valor);
    }
}
