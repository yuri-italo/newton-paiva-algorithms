package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Dado um número inteiro N (ano),
 * informar se o ano é bissexto ou não.
 *
 * @author yuri-italo
 */

public class Ex3AnoBissexto {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um ano: ");
        int ano = Integer.parseInt(entrada);

        if (ano % 4 == 0)
            if (ano % 100 == 0)
                if (ano % 400 == 0)
                    JOptionPane.showMessageDialog(null,ano + " é um ano bissexto (tem 366 dias)");
                else
                    JOptionPane.showMessageDialog(null,ano + " não é um ano bissexto (tem 365 dias)");
            else
                JOptionPane.showMessageDialog(null,ano + " é um ano bissexto (tem 366 dias)");
        else
            JOptionPane.showMessageDialog(null,ano + " não é um ano bissexto (tem 365 dias)");
    }
}
