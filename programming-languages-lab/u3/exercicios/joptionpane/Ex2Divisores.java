package edu.newton.ldp.u3.exercicios.joptionpane;

import javax.swing.*;

/**
 * Problema
 *
 * Ler do usuário um número inteiro positivo M
 * e informar todos os divisores de M
 *
 * @author yuri-italo
 *
 */

public class Ex2Divisores {
    public static void main(String[] args) {
        boolean ehInteiro = false;
        StringBuilder sb = new StringBuilder();
        int numero = 0;

        while (!ehInteiro) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null,"Volte sempre!");
                    break;
                }
                numero = Integer.parseInt(entrada);
                ehInteiro = true;

                for (int i = 1; i <= numero; i++)
                    if (numero % i == 0)
                        sb.append(i).append("\n");
                JOptionPane.showMessageDialog(null,"Os divisores de " + numero + " são:\n" + sb);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,"Somente números inteiros são permitidos!",
                        "Entrada inválida",JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
