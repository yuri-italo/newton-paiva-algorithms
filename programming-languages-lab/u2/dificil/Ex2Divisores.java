package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Dado um número inteiro N,
 * informar todos os divisores de N.
 *
 * @author yuri-italo
 */

public class Ex2Divisores {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");
        int valor = Integer.parseInt(entrada);
        StringBuilder divisores = new StringBuilder();

        for (int i = 1; i <= valor; i++)
            if (valor % i == 0)
                divisores.append(i).append("\n");

        JOptionPane.showMessageDialog(null,"Os divisores de " + valor + " são:\n" + divisores);
    }
}
