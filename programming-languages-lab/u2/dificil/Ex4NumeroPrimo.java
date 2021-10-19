package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Dado um número inteiro N, informar se ele é PRIMO
 *
 * @author yuri-italo
 */

public class Ex4NumeroPrimo {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um número inteiro: ");
        int numero = Integer.parseInt(entrada);
        boolean primo = true;

        for (int i = 2; i <= numero; i++) {
            if (i < numero && numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo)
            JOptionPane.showMessageDialog(null,"O número " + numero + " é primo!");
        else
            JOptionPane.showMessageDialog(null,"O número " + numero + " não é primo!");
    }
}
