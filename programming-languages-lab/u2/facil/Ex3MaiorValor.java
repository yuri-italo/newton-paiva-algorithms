package edu.newton.ldp.u2.facil;

import javax.swing.*;

/**
 * Problema
 *
 * Entrada: três números inteiros digitados pelo usuário
 * Saída: informar qual é o maior valor dos números digitados
 *
 * @author yuri-italo
 *
 */
public class Ex3MaiorValor {
    public static void main(String[] args) {
        int[] n = new int[3];
        int maior = 0;

        for (int i = 0; i < 3; i++) {
            String valor = JOptionPane.showInputDialog("Número inteiro [" + (i+1) + "]:");
            n[i] = Integer.parseInt(valor);
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0)
                maior = n[i];
            else {
                if (n[i] > maior)
                    maior = n[i];
            }
        }

        JOptionPane.showMessageDialog(null,"O maior número é: " + maior);
    }
}
