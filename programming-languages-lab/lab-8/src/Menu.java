import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    protected static int exibirMenu() {
        int opcao;
        String entrada;

        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("                    BEM-VINDO A BIBLIOTECA                    ");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("    1 \t\t------------>\t\t Cadastrar um novo livro");
            System.out.println("    2 \t\t------------>\t\t Listar livros cadastrados");
            System.out.println("    3 \t\t------------>\t\t Pesquisar livro (Título)");
            System.out.println("    4 \t\t------------>\t\t Pesquisar livro (Categoria)");
            System.out.println("    5 \t\t------------>\t\t Excluir livro (ID)");
            System.out.println("    6 \t\t------------>\t\t Encerrar sessão");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Escolha uma opção: ");
            entrada = sc.nextLine();

            if (opcaoValida(entrada))
                return Integer.parseInt(entrada);
            else
                System.out.println("\n[ERRO] Digite uma opção válida!");
        }
    }

    protected static boolean opcaoValida(String entrada) {
        return entrada.matches(".*\\d.*") && Integer.parseInt(entrada) > 0 && Integer.parseInt(entrada) <= 6;
    }
}
