package edu.newton.ldp.u2.medio;

import javax.swing.*;

/**
 * Problema
 *
 * Dada uma frase F informada pelo usuário,
 * exibir a quantidade de palavras na tela
 *
 * @author yuri-italo
 *
 */

public class Ex3QtdPalavras {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Digite uma frase:");
            if (frase.equals(""))
                JOptionPane.showMessageDialog(null,"Não houve entrada!", "ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                String[] numeroDePalavras = frase.split(" ");
                JOptionPane.showMessageDialog(null,"Número de palavras: " + numeroDePalavras.length);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Volte sempre!");
        }
    }
}
