package problema2;

import problema2.exceptions.*;

import javax.swing.*;
/**
 * Problema 2
 *
 * Entrada: uma senha (String) informada pelo usuário
 * Saída: informar se a senha está válida de acordo com as regras abaixo:
 *
 * Tamanho mínimo 8, máximo 12
 * Mínimo uma letra maiúscula
 * Mínimo um dígito (0-9)
 * Mínimo um dos símbolos ! @ # ? ]
 * Não pode haver repetições: ex AA, cc
 * Não pode ter espaços
 *
 * @author yuri-italo
 */
public class Problema2 {
    public static void main(String[] args) {
        while (true) {
            try {
                String senha = JOptionPane.showInputDialog("Digite uma senha:");
                validarSenha(senha);
                break;
            } catch (TamanhoInvalidoException | NaoPossuiMaiusculoException | NaoPossuiDigitoException |
                    NaoPossuiSimboloException | PossuiEspacoException | PossuiRepeticaoException e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Senha inválida!",JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,"Volte sempre!");
                break;
            }
        }
    }

    private static void validarSenha(String senha) throws TamanhoInvalidoException,
            NaoPossuiMaiusculoException, NaoPossuiDigitoException,
            NaoPossuiSimboloException, PossuiEspacoException, PossuiRepeticaoException {

        boolean temMaiusculo = false;
        boolean temDigito = false;
        boolean temSimbolo = false;
        boolean temEspaco = false;
        boolean temRepeticao = false;

        if (senha.length() < 8 || senha.length() > 12) throw new TamanhoInvalidoException();

        for (int i = 0; i < senha.length() - 1; i++)
            if (Character.toLowerCase(senha.charAt(i)) == Character.toLowerCase(senha.charAt(i + 1))) {
                temRepeticao = true;
                break;
            }

        for (Character ch : senha.toCharArray()) {
            if (Character.isUpperCase(ch)) temMaiusculo = true;
            if (Character.isDigit(ch)) temDigito = true;
            if (possuiSimbolo(ch)) temSimbolo = true;
            if (Character.isWhitespace(ch)) temEspaco = true;
        }

        if (temRepeticao) throw new PossuiRepeticaoException();
        if (!temMaiusculo) throw new NaoPossuiMaiusculoException();
        if (!temDigito) throw new NaoPossuiDigitoException();
        if (!temSimbolo) throw new NaoPossuiSimboloException();
        if (temEspaco) throw new PossuiEspacoException();

        JOptionPane.showMessageDialog(null,"Sua senha é válida: " + senha);
    }

    private static boolean possuiSimbolo(Character ch) {
        return ch == '!' || ch == '@' || ch == '#' || ch == '?' || ch == ']';
    }
}
