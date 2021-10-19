package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Implementar um validador de senhas do usuário
 * Pelo menos uma letra minúscula
 * Pelo menos uma letra maiúscula
 * Pelo menos 1 caractere de [$#@]
 * Mínimo: 6 caracteres
 * Máximo: 16 caracteres
 *
 * @author yuri-italo
 */

public class Ex9ValidadorDeSenha {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite uma senha:");
        if (senhaAprovada(senha))
            JOptionPane.showMessageDialog(null,"Senha válida!");
        else
            JOptionPane.showMessageDialog(null,"Senha inválida!");
    }

    public static boolean senhaAprovada(String senha) {
        boolean temMaiusculo = false;
        boolean temMinusculo = false;
        boolean temDigito = false;
        boolean temCarectereEspecial = false;

        if (senha.length() < 6)
            return false;

        if (senha.length() > 16)
            return false;

        for (var ch : senha.toCharArray()) {
            if (Character.isUpperCase(ch))
                temMaiusculo = true;
            if (Character.isUpperCase(ch))
                temMinusculo = true;
            if (Character.isDigit(ch))
                temDigito = true;
            if (ch == '$' || ch == '#' || ch == '@')
                temCarectereEspecial = true;
        }

        return temMinusculo && temMaiusculo && temDigito && temCarectereEspecial;
    }
}
