package problema3;

import problema3.exceptions.CpfInvalidoException;
import problema3.exceptions.FormatoInvalidoException;
import problema3.exceptions.PossuiLetrasException;
import problema3.exceptions.TodosNumerosIguaisException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Problema 3
 *
 * Entrada: um CPF (String) digitado pelo usuário
 * Saída: informar se o CPF é válido ou não conforme o algoritmo de validação de CPFs
 *
 * @author yuri-italo
 */
public class Problema3 {
    public static void main(String[] args) {
        while (true) {
            try {
                String cpf = JOptionPane.showInputDialog("Digite um CPF, para verificar se é válido:");
                validarFormatoCpf(cpf);
                validarCPF(cpf);
                JOptionPane.showMessageDialog(null,"O CPF informado é válido.\nCPF: " + cpf);
                break;
            } catch (FormatoInvalidoException | TodosNumerosIguaisException | PossuiLetrasException | CpfInvalidoException e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"CPF inválido!",JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,"Volte sempre!");
                break;
            }
        }
    }

    private static void validarCPF(String cpf) throws CpfInvalidoException {
        var cpfValido = validarPrimeiroDigito(cpf) && validarSegundoDigito(cpf);

        if (!cpfValido)
            throw new CpfInvalidoException();
    }


    private static boolean validarPrimeiroDigito(String cpf) {
        List<Integer> auxiliar = new ArrayList<>();
        int soma = 0, i = 10, j = 0;

        while (j != 11) {
            if (checarApenasDigitos(j)) {
                auxiliar.add(Integer.parseInt(String.valueOf(cpf.charAt(j))) * i);
                i--;
            }
            j++;
        }

        for (var numero : auxiliar)
            soma += numero;

        int resto = soma * 10 % 11;

        if (resto == 10)
            resto = 0;

        return resto == Integer.parseInt(String.valueOf(cpf.charAt(12)));
    }

    private static boolean validarSegundoDigito(String cpf) {
        List<Integer> auxiliar = new ArrayList<>();
        int soma = 0, i = 11, j = 0;

        while (j != 13) {
            if (checarApenasDigitos(j)) {
                auxiliar.add(Integer.parseInt(String.valueOf(cpf.charAt(j))) * i);
                i--;
            }
            j++;
        }

        for (var numero : auxiliar)
            soma += numero;

        int resto = soma * 10 % 11;

        if (resto == 10)
            resto = 0;

        return resto == Integer.parseInt(String.valueOf(cpf.charAt(13)));
    }

    private static void validarFormatoCpf(String cpf) throws FormatoInvalidoException, TodosNumerosIguaisException, PossuiLetrasException {
        if (cpf.length() != 14) throw new FormatoInvalidoException();
        if (!temPontoETraco(cpf)) throw new FormatoInvalidoException();
        if (!apenasDigitos(cpf)) throw new PossuiLetrasException();
        if (todosNumerosIguais(cpf)) throw new TodosNumerosIguaisException();
    }

    private static boolean apenasDigitos(String cpf) {
        for (int i = 0; i < cpf.length(); i++)
            if (checarApenasDigitos(i))
                if (!Character.isDigit(cpf.charAt(i)))
                    return false;

        return true;
    }

    private static boolean todosNumerosIguais(String cpf) {
        Set<Character> auxiliar = new HashSet<>();
        for (int i = 0; i < cpf.length(); i++)
            if (checarApenasDigitos(i))
                auxiliar.add(cpf.charAt(i));

        return auxiliar.size() == 1;
    }

    private static boolean temPontoETraco(String cpf) {
        return cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-';
    }

    private static boolean checarApenasDigitos(int i) {
        return i != 3 && i != 7 && i != 11;
    }
}