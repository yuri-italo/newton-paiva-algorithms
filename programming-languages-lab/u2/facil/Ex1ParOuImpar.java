package edu.newton.ldp.u2.facil;

import javax.swing.*;

/**
 * Problema
 *
 * Entrada: um número inteiro digitado pelo usuário
 * Saída: informar se o número é par ou ímpar.
 *
 * @author yuri-italo
 *
 */

public class Ex1ParOuImpar {
    public static void main(String[] args) {
        int n,r;
        boolean ehPar = false;

        String valor = JOptionPane.showInputDialog("Digite um número inteiro: ");
        n = Integer.parseInt(valor);

        r = n % 2;

        if (r % 2 == 0)
            ehPar = true;

        JOptionPane.showMessageDialog(null,"O número é " + (ehPar?"Par":"ÍMPAR"));
    }
}
