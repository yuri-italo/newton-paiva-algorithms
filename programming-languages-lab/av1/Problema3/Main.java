package av1.Problema3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        Produto p1 = new Produto("Bola","Topper", LocalDate.now(),100);
        list.add(p1);
        Produto p2 = new Produto("Boneca","HappyKids",LocalDate.now(),500);
        list.add(p2);
        Produto p3 = new Produto("Chinelo","Havaiana",LocalDate.now(),20);
        list.add(p3);
        Produto p4 = new Produto("Videogame","Xbox",LocalDate.now(),500);
        list.add(p4);
        Produto p5 = new Produto("Fone de ouvido","Xing Ling",LocalDate.now(),20);
        list.add(p5);

        float somaTotal = Produto.somaTotal(list);
        System.out.printf("%.2f", somaTotal);

        float media = Produto.media(list,somaTotal);
        System.out.printf("%.2f", media);

        Produto.maisCaros(list);
        Produto.maisBaratos(list);
    }
}
