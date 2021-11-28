import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            int opcao;
            var biblioteca = new DaoLivros();

            do {
                opcao = Menu.exibirMenu();
                switch (opcao) {
                    case 1:
                        biblioteca.cadastrarLivro();
                        break;
                    case 2:
                        biblioteca.listar();
                        break;
                    case 3:
                        biblioteca.pesquisarPorTitulo();
                        break;
                    case 4:
                        biblioteca.pesquisarPorCategoria();
                        break;
                    case 5:
                        biblioteca.excluir();
                        break;
                }
            } while (opcao != 6);

            biblioteca.encerrarConexao();
            System.out.println("Volte Sempre!");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
