import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class ConnectionFactory {

    public Connection recuperaConexao(){

        try {
            System.out.println("recuperei a conexão");
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
