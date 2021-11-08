package problema2;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Problema 2 (2pts):
 *
 * Entrada: dois nomes de arquivos existentes (A1 e A2)
 *
 * Saída: informar se os arquivos são idênticos (i.e. o conteúdo dos dois arquivos é o mesmo).
 *
 * @author yuri-italo
 */
public class Problema2 {
    public static void main(String[] args) {
        try {
            var arquivo1 = verificarCaminho(1);
            var arquivo2 = verificarCaminho(2);

            if (saoIdenticos(arquivo1,arquivo2))
                JOptionPane.showMessageDialog(null,"Os arquivos são iguais!");
            else
                JOptionPane.showMessageDialog(null,"Os arquivos não são iguais!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Volte sempre!");
            System.exit(0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro ao comparar arquivos"
                    ,"Não foi possível comparar os arquivos!",JOptionPane.ERROR_MESSAGE);
        }
    }

    private static File verificarCaminho(int numeroArquivo) {
        File arquivo;

        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o caminho absoluto do arquivo [" + numeroArquivo + "]:");
                arquivo = new File(entrada);

                if (arquivo.isDirectory() || entrada.trim().equals(""))
                    throw new IllegalArgumentException();

                if (!arquivo.exists())
                    throw new FileNotFoundException();

                break;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,"Digite um caminho absoluto válido!"
                        ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,"O arquivo não foi encontrado!"
                        ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
            }
        }
        return arquivo;
    }

    private static boolean saoIdenticos(File arquivo1, File arquivo2) throws IOException {
        int i;
        int j;

        if (arquivo1.length() != arquivo2.length())
            return false;

        try (FileInputStream fis1 = new FileInputStream(arquivo1); FileInputStream fis2 = new FileInputStream(arquivo2)) {
            while ((i = fis1.read()) != -1 && (j = fis2.read()) != -1)
                if (i != j)
                    return false;
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado!"
                    , "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }

        return true;
    }
}
