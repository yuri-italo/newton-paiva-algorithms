package edu.newton.ldp.u2.medio;

import javax.swing.*;
import java.util.Locale;

/**
 * Problema
 *
 * Data uma frase digitada pelo usuário e um caractere,
 * veriﬁcar se o caractere existe na frase.
 *
 * @author yuri-italo
 *
 */

public class Ex4ExisteCaractere {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Digite uma frase:");
            if (frase.trim().equals("") )
                JOptionPane.showMessageDialog(null,"Não houve entrada!", "ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                String character = JOptionPane.showInputDialog("Digite um caractere para verificar existência:");
                if (character.length() != 1) {
                    do {
                        JOptionPane.showMessageDialog(null, "Digite 1 caractere!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        character = JOptionPane.showInputDialog("Digite um caractere para verificar existência:");
                    } while (character.equals("") || character.length() > 1);
                }
                existeCaractere(frase,character);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Volte sempre!");
        }
    }

    public static void existeCaractere(String frase,String caractere) {
        if (frase.contains(caractere))
            JOptionPane.showMessageDialog(null,"O caractere '" + caractere + "' existe na frase.");
        else
            JOptionPane.showMessageDialog(null,"O caractere '" + caractere + "' não existe na frase.");
    }
}
