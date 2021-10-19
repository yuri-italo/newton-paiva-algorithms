package edu.newton.ldp.u3.exercicios.joptionpane;

import javax.swing.*;

/**
 * Problema
 *
 * Ler do usuário um número inteiro positivo N
 * e exibir todos os múltiplos de N de 1 a 100
 *
 * @author yuri-italo
 *
 */

public class Ex3Multiplos {
    public static void main(String[] args) {
        boolean ehInteiro = false;
        int numero;
        StringBuilder sb = new StringBuilder();

        while (!ehInteiro) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null,"Volte sempre!");
                    break;
                }
                numero = Integer.parseInt(entrada);
                ehInteiro = true;

                for (int i = 1; i <= 100 ; i++) {
                    sb.append(numero*i).append("  ");
                    if (i % 10 == 0)
                        sb.append("\n");
                }
                JOptionPane.showMessageDialog(
                        null,"Múltiplos de " + numero + " (1 a 100):\n" + sb
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,"Somente números inteiros são permitidos!",
                        "Entrada inválida",JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
