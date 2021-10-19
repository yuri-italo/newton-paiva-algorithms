package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Implementar a Tabuada de N
 *
 * @author yuri-italo
 */

public class Ex8Tabuada {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Entre com um número:");
        int n = Integer.parseInt(valor);

        StringBuilder msg = new StringBuilder("Tabuada do " + n + "\n====================\n");

        for (int i = 1; i <= 10; i++) {
            int n2 = n * i;
            msg.append(n).append(" * ").append(i).append(" = ").append(n2).append("\n");
        }

        JOptionPane.showMessageDialog(null,msg);
    }
}
