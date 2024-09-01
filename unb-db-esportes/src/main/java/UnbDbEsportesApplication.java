import org.w3c.dom.ls.LSOutput;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class UnbDbEsportesApplication {
    private static EventoService service = new EventoService();

    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) throws SQLException {
        int opcao = exibirMenu();

        while (opcao != 7){

            try {
                switch (opcao){
                    case 1:
                    listarEventos();
                        break;
                    case 2:
                        incluirEvento();
                        break;
                    case 3:
//                    excluirEvento();
                        break;
                }
            } catch (SQLException e){
                System.out.println("Pressione qualqeur tecla e tecle ENTER para voltar ao menu");
                teclado.next();
            }

            opcao=exibirMenu();
        }
        System.out.println("Finalizando a aplicação");
    }
    private static int exibirMenu(){
        System.out.println("""
            UNB DB SEPORTES - ESCOLHA UMA OPÇÃO:
            1 - Listar Eventos
            2 - Incluir Eventos
            3 - Excluir Eventos
            4 - [...]
            5 - [...]
            6 - [...]
            7 - Sair
            """);
        return teclado.nextInt();
    }
    private static void incluirEvento() throws SQLException {
        System.out.println("Digite o nome do evento");
        String nomeEvento = teclado.next();

        System.out.println("Digite a data do evento");
        String dataEvento = teclado.next();

        System.out.println("dados recebidos:");
        System.out.println("nome: " + nomeEvento);
        System.out.println("data: " + dataEvento);

        service.criar(new Evento(nomeEvento, dataEvento));

        System.out.println("Evento criado com sucesso!");
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        teclado.next();
    }
    private static void listarEventos() throws SQLException {
        System.out.println("Eventos criados: ");
/*        ResultSet eventos = (ResultSet) service.listarEventosCriados();
        while (eventos.next()){
            System.out.println("nome" + eventos.getString(1));
        }*/
        var eventos = service.listarEventosCriados();
        eventos.stream().forEach(System.out::println);

        System.out.println("Precione qualquer tecla");
        teclado.next();
    }
}
