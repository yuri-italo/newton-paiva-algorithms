package edu.newton.ldp.u2.medio;

import javax.swing.*;

/**
 * Problema
 *
 * Dada uma frase F informada pelo usuário,
 * exibir somente as consoantes da frase na tela
 *
 * @author yuri-italo
 *
 */
public class Ex1SomenteConsoantes {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Digite uma frase:");
            if (frase.equals(""))
                JOptionPane.showMessageDialog(null,"Não houve entrada!", "ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                frase = frase.replaceAll("[AEIOUaeiouÁÉÍÓÚáéíóú0123456789]","");
                JOptionPane.showMessageDialog(null,"Frase com apenas consoantes: \n" + frase);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Volte sempre!");
        }
    }
}
