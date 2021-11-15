import lab.problema1.exceptions.PathDoesNotExistException;
import lab.problema1.exceptions.PathIsFileException;

import java.io.File;
import java.util.Scanner;
/**
 * Problema 1:
 *
 * Entrada: um caminho de diretório informado pelo usuário
 * Saída: exibir todos os arquivos do diretório e sub-diretórios (usando recursão)
 */
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter a path to list its content: ");
        String input = sc.nextLine();
        File path = new File(input);

        checkFile(path);
        listDirectory(path);
    }

    public static void listDirectory(File path) {
        var list = path.listFiles();
        try {
            if (list == null)
                return;

            System.out.println(path.getAbsolutePath());
            for (var file : list) {
                if (file.isFile()) System.out.println("├── " + file.getName());
                if (file.isDirectory()) listDirectory(file);
                if (!file.exists()) throw new PathDoesNotExistException(file);
            }
        } catch (PathDoesNotExistException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static void checkFile(File path) {
        try {
            if (!path.exists())
                throw new PathDoesNotExistException(path);
            else if (path.isFile())
                throw new PathIsFileException(path);
        } catch (PathDoesNotExistException | PathIsFileException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
