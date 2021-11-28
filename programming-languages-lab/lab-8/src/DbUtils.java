import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    public static Connection conectar(String driver, String url, String user, String password) throws ClassNotFoundException, SQLException {
        Connection connection = null;

        // testar a carga do driver
        Class.forName(driver);

        // conexão
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("[INFO] Conexão iniciada com sucesso.");

        return connection;
    }
}
