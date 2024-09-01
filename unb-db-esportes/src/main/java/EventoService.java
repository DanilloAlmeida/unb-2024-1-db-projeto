import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class EventoService {

    private ConnectionFactory connection;

    public EventoService(){
        this.connection = new ConnectionFactory();
    }

    private Set<Evento> eventos = new HashSet<>();

    public Set<Evento> listarEventosCriados() {
        Connection conn = connection.recuperaConexao();
        return new EventoDAO(conn).listar();
    }

    public void criar(Evento evento) throws SQLException {
        Connection opConn = connection.recuperaConexao();

        new EventoDAO(opConn).salvar(evento);


    }
}



















