import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class EventoDAO {
    private Connection conn;

    EventoDAO(Connection connection){
        this.conn = connection;
    }

    public void salvar(Evento eventoEnt) {
        Evento evento = new Evento(eventoEnt.getNomeEvento(), eventoEnt.getDataEvento());

        String sql = "INSERT INTO evento " +
                "(data, nome) " +
                "VALUES (?, ?);";
        try {
            PreparedStatement ppStt = conn.prepareStatement(sql);
            ppStt.setString(1, evento.getDataEvento());
            ppStt.setString(2, evento.getNomeEvento());
            ppStt.execute();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Set<Evento> listar(){
        Set<Evento> eventos = new HashSet<>();

        String sql = "SELECT * from evento;";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
//                Integer id = resultSet.getInt(1)
                String nome = resultSet.getString(3);
                String data = resultSet.getString(2);
                Evento evento = new Evento(nome, data);

                eventos.add(evento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return eventos;
    }
}







