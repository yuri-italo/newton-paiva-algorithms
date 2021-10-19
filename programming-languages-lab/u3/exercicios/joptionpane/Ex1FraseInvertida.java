package edu.newton.ldp.u3.exercicios.joptionpane;

import javax.swing.*;
import java.util.Stack;

/**
 * Problema
 *
 * Ler do usuário uma frase e exibir a frase invertida
 *
 * @author yuri-italo
 */

public class Ex1FraseInvertida {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String entrada = JOptionPane.showInputDialog("Digite uma frase: ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (var letra : entrada.toCharArray()) {
            stack.push(letra);
        }

        for (int i = 0; i < entrada.length(); i++) {
            fraseInvertida.append(stack.pop());
        }
        JOptionPane.showMessageDialog(null,"Frase invertida:\n" + fraseInvertida);
    }
}
