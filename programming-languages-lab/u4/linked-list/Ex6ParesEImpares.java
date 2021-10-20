import java.util.LinkedList;

public class Ex6ParesEImpares {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        LinkedList<Integer> pares = new LinkedList<>();
        LinkedList<Integer> impares = new LinkedList<>();
        lista.add(0,10);
        lista.add(1,11);
        lista.add(1,12);
        lista.offerLast(13);
        lista.add(2,14);
        lista.offerFirst(15);
        lista.add(4,16);
        lista.add(6,17);
        lista.add(7,18);
        lista.add(8,19);
        lista.add(10,20);

        for (var numero : lista)
            if (numero % 2 == 0)
                pares.add(numero);
            else
                impares.add(numero);

        System.out.println("Lista: " + lista + "\nPares: " + pares + "\nÍmpares: " + impares);
    }
}
