import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaoLivros {
    static Scanner sc = new Scanner(System.in);
    public static final String DRIVER = "org.h2.Driver";
    public static final String URL = "jdbc:h2:C:\\Users\\Yuri Italo\\Desktop\\workspace\\LP\\u8\\biblioteca\\users";
    public static final String USER = "sa";
    public static final String PASSWORD = "";

    private final Connection connection;

    public DaoLivros() throws SQLException, ClassNotFoundException {
        this.connection = DbUtils.conectar(DRIVER, URL, USER, PASSWORD);
    }

    public void cadastrarLivro() throws SQLException {
        var livro = new Livro();

        System.out.print("Informe o título do livro: ");
        livro.setTitulo(sc.nextLine());
        System.out.print("Informe o autor do livro: ");
        livro.setAutor(sc.nextLine());
        while (true) {
            System.out.print("Informe o ano de publicação do livro: ");
            var ano = sc.nextLine();
            if (ano.length() == 4 && ano.matches(".*\\d.*")) {
                livro.setAnoDePublicacao(Integer.parseInt(ano));
                break;
            }

            System.out.println("[ERRO] Ano inválido.");
        }
        System.out.print("Informe a editora do livro: ");
        livro.setEditora(sc.nextLine());
        System.out.print("Informe a categoria do livro: ");
        livro.setCategoria(sc.nextLine());

        var sql = "insert into livros (titulo, autor, ano_publicacao, editora, categorias) " +
                "values(" +
                "'" +livro.getTitulo()+ "', '"+livro.getAutor()+"', '"+livro.getAnoDePublicacao()+"', " +
                "'"+livro.getEditora()+"', '"+livro.getCategoria()+"'" +
                ")";

        var statement = connection.createStatement();
        var resultado = statement.executeUpdate(sql);

        System.out.println("\n[INFO] Livro inserido com sucesso.\nLinhas afetadas: " + resultado);

        statement.close();
    }

    public void listar() throws SQLException {
        var statement = connection.createStatement();

        var sql = "select * from livros";
        var resultado = statement.executeQuery(sql);

        // processar o resultado do sql
        var lista = new ArrayList<Livro>();

        // iterador
        while (resultado.next()) {
            // populando objetos a partir da resposta no banco
            var livro = new Livro();

            livro.setId(resultado.getInt("id"));
            livro.setTitulo(resultado.getString("titulo"));
            livro.setAutor(resultado.getString("autor"));
            livro.setAnoDePublicacao(resultado.getInt("ano_publicacao"));
            livro.setEditora(resultado.getString("editora"));
            livro.setCategoria(resultado.getString("categorias"));

            lista.add(livro);
        }

        System.out.println("\nListando livros . . .");
        if (lista.isEmpty())
            System.out.println("[INFO] Nenhum livro Cadastrado.");
        else
            for (var livro : lista)
                System.out.println(livro);

        resultado.close();
        statement.close();
    }

    public void pesquisarPorTitulo() throws SQLException {
        System.out.print("Digite um título: ");
        var entrada = sc.nextLine();

        var statement = connection.createStatement();

        var sql = "select * from livros where titulo like '%"+entrada+"%'";
        var resultado = statement.executeQuery(sql);

        // processar o resultado do sql
        var lista = new ArrayList<Livro>();

        // iterador
        while (resultado.next()) {
            // populando objetos a partir da resposta no banco
            var livro = new Livro();

            livro.setId(resultado.getInt("id"));
            livro.setTitulo(resultado.getString("titulo"));
            livro.setAutor(resultado.getString("autor"));
            livro.setAnoDePublicacao(resultado.getInt("ano_publicacao"));
            livro.setEditora(resultado.getString("editora"));
            livro.setCategoria(resultado.getString("categorias"));

            lista.add(livro);
        }

        System.out.println("\nListando livros com o título contendo: " + entrada + " . . .");
        if (lista.isEmpty())
            System.out.println("[INFO] Nenhum livro encontrado.");
        else
            for (var livro : lista)
                System.out.println(livro);

        System.out.println("Total: " + lista.size());

        resultado.close();
        statement.close();
    }

    public void pesquisarPorCategoria() throws SQLException {
        System.out.print("Digite uma categoria: ");
        var entrada = sc.nextLine();

        var statement = connection.createStatement();

        var sql = "select * from livros where categorias like '%"+entrada+"%'";
        var resultado = statement.executeQuery(sql);

        // processar o resultado do sql
        var lista = new ArrayList<Livro>();

        // iterador
        while (resultado.next()) {
            // populando objetos a partir da resposta no banco
            var livro = new Livro();

            livro.setId(resultado.getInt("id"));
            livro.setTitulo(resultado.getString("titulo"));
            livro.setAutor(resultado.getString("autor"));
            livro.setAnoDePublicacao(resultado.getInt("ano_publicacao"));
            livro.setEditora(resultado.getString("editora"));
            livro.setCategoria(resultado.getString("categorias"));

            lista.add(livro);
        }

        System.out.println("\nListando livros com a categoria contendo: " + entrada + " . . .");
        if (lista.isEmpty())
            System.out.println("[INFO] Nenhum livro encontrado.");
        else
            for (var livro : lista)
                System.out.println(livro);

        System.out.println("Total: " + lista.size());

        resultado.close();
        statement.close();
    }

    public void excluir() throws SQLException {
        int id;

        while (true) {
            System.out.print("Informe um ID: ");
            var entrada = sc.nextLine();

            if (entrada.matches(".*\\d.*")) {
                id = Integer.parseInt(entrada);
                break;
            }
        }

        System.out.print("Deseja realmente excluir o livro? [S/N] ");
        var entrada = sc.nextLine();

        if (entrada.equalsIgnoreCase("S")) {
            var statement = connection.createStatement();
            var sql = "delete from livros where id = " + id;
            var resultado = statement.executeUpdate(sql);

            if (resultado > 0)
                System.out.println("\n[INFO] Livro excluído com sucesso.\nLinhas afetadas: " + resultado);
            else
                System.out.println("\n[ERRO] ID não encontrado.");

            statement.close();
        }
    }

    protected void encerrarConexao() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
