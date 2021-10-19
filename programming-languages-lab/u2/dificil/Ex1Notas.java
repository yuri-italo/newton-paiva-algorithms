package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Dado um conjunto de notas (real),
 * informar a média de notas, a maior e menor nota
 *
 * @author yuri-italo
 */

public class Ex1Notas {
    public static void main(String[] args) {
        float[] notas = {100, 50, 20, 10, 5, 2};
        float soma = 0;

        for (var nota : notas)
            soma += nota;
        float media = soma / notas.length;

        float maiorNota = 0;
        for (var nota : notas)
            if (nota > maiorNota)
                maiorNota = nota;

        float menorNota = notas[0];
        for (var nota : notas)
            if (nota < menorNota)
                menorNota = nota;

        JOptionPane.showMessageDialog(null,"Média das notas: " + String.format("%.2f", media)
        + "\nMaior nota: " + String.format("%.2f", maiorNota) + "\nMenor nota: " + String.format("%.2f", menorNota));
    }
}
