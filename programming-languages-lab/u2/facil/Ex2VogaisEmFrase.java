package edu.newton.ldp.u2.facil;

import javax.swing.*;

/**
 * Problema
 *
 * Dada uma frase F informada pelo usuário,
 * informar a quantidade de vogais na frase.
 *
 * @author yuri-italo
 *
 */

public class Ex2VogaisEmFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Entre com uma frase");
        char[] vogais = {'A','E','I','O','U','a','e','i','o','u','Á','É','Í','Ó','Ú','á','é','í','ó','ú'};
        int qtt = 0;

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (frase.charAt(i) == vogais[j])
                    qtt++;
            }
        }

        JOptionPane.showMessageDialog(null, "A frase possui " + qtt + " vogal(is)");
    }
}
