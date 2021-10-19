package edu.newton.ldp.u2.medio;

import javax.swing.*;

/**
 * Problema
 *
 * Dada uma frase F informada pelo usuário,
 * exibir a frase invertida na tela
 *
 * @author yuri-italo
 *
 */

public class Ex2FraseInvertida {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Digite uma frase:");
            if (frase.equals(""))
                JOptionPane.showMessageDialog(null,"Não houve entrada!", "ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                StringBuilder fraseInvertida = new StringBuilder();

                for (int i = frase.length() - 1; 0 <= i ; i--) {
                    fraseInvertida.append(frase.charAt(i));
                }

                JOptionPane.showMessageDialog(null,"Frase invertida: \n" + fraseInvertida);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Volte sempre!");
        }
    }
}
