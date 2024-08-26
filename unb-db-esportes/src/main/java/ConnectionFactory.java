import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class ConnectionFactory {

    public Collection recuperaConexao(){

        try {
            return (Collection) DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/unbdbesportes?user=root&password=0843Wajed@2");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
