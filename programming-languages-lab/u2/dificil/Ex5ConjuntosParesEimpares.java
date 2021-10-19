package edu.newton.ldp.u2.dificil;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Problema
 *
 * Dado um conjunto de números inteiros,
 * dividi-lo em dois conjuntos: pares e ímpares
 *
 * @author yuri-italo
 */

public class Ex5ConjuntosParesEimpares {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 5, 6, 8, 31, 887, 95, 42, 63, 55, 47, 64, 58, 93, 101, 54, 67, 10, 27, 32};
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (var numero : numeros) {
            if (numero % 2 == 0)
                pares.add(numero);
            else
                impares.add(numero);
        }

        JOptionPane.showMessageDialog(null, "Números pares:\n" + pares
                + "\nNúmeros ímpares:\n" + impares);
    }
}
