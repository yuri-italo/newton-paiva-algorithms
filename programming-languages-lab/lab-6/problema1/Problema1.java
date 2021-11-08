package problema1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/**
 * Problema 1:
 *
 * O comando MV é responsável por mover um arquivo A de um diretório D1 para um diretório D2.
 * Escreva um programa que lê do usuário o nome de um arquivo existente (A)
 * e um diretório de destino (D2) e realiza o movimento do arquivo de D1 para D2.
 *
 * Notas:
 *
 * Se o arquivo não existir, uma mensagem de erro deverá ser exibida para o usuário.
 *
 * Se o diretório de destino não existir, o programa deverá informar ao usuário
 * e perguntar se ele/ela deseja criar o diretório. Se sim, o caminho deverá ser criado e o arquivo movido para D2.
 * Se não, o programa encerrará a operação sem mover o arquivo.
 *
 * @author yuri-italo
 */
public class Problema1 {
    private static File arquivo;
    private static File destino;

    public static void main(String[] args) {
        try {
            arquivo = verificarArquivo();
            moverArquivo(arquivo);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Volte sempre!");
            System.exit(0);
        }
    }

    public static File verificarArquivo() {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o caminho absoluto do arquivo:");
                arquivo = new File(entrada);

                if (arquivo.isDirectory() || entrada.trim().equals("")) throw new IllegalArgumentException();

                if (!arquivo.exists()) throw new FileNotFoundException();

                break;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,"Digite um caminho absoluto válido!"
                        ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,"O arquivo não existe!"
                        ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
            }
        }
        return arquivo;
    }

    private static void moverArquivo(File origem) {
        try {
            boolean movido;
            destino = verificarDestino(origem);

            if (arquivoExiste(arquivo,destino))
                movido = substituirArquivo(origem,destino);
            else
                movido = moverArquivo(origem,destino);

            if (movido)
                JOptionPane.showMessageDialog(null,"Arquivo movido com sucesso!");
            else
                JOptionPane.showMessageDialog(null,"Não foi possível mover o arquivo"
                        ,"Operação inválida",JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,"Digite um caminho válido"
                    ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
        }
    }

    private static File verificarDestino(File arquivo) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o caminho absoluto de destino:");
                destino = new File(entrada);

                if (destino.isFile() || entrada.trim().equals("")) throw new IllegalArgumentException();

                if (destino.getPath().equals(arquivo.getParent())) throw new InputMismatchException();

                if (!destino.exists()) {
                    int criarPastar = JOptionPane.showConfirmDialog(null, "Criar pasta?",
                            "Diretório não existe",JOptionPane.YES_NO_CANCEL_OPTION);

                    if (criarPastar == 0)
                        destino.mkdir();
                    else {
                        JOptionPane.showMessageDialog(null,"Volte sempre!");
                        System.exit(0);
                    }
                }
                break;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,"Digite um caminho válido"
                        ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null,"Os caminhos são iguais!"
                        ,"Entrada inválida",JOptionPane.ERROR_MESSAGE);
            }
        }
        return destino;
    }

    private static boolean substituirArquivo(File arquivo, File destino) {
        int substituirArquivo = JOptionPane.showConfirmDialog(
                null,
                "Deseja substituir o arquivo?",
                "Já existe um arquivo com mesmo nome",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        if (substituirArquivo != 0) {
            JOptionPane.showMessageDialog(null, "Volte sempre!");
            System.exit(0);
        } else {
            File nomeIgual = new File(destino,arquivo.getName());
            nomeIgual.delete();
        }

        return moverArquivo(arquivo,destino);
    }

    private static boolean moverArquivo(File arquivo, File destino) {
        return arquivo.renameTo(new File(destino.getPath(),arquivo.getName()));
    }

    private static boolean arquivoExiste(File arquivo, File destino) {
        var arquivos = destino.list();
        for (var item : arquivos)
            if (item.equals(arquivo.getName()))
                return true;

        return false;
    }
}
