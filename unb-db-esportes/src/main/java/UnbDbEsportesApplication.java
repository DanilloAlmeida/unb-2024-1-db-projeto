import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UnbDbEsportesApplication {

    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args){
        int opcao = exibirMenu();
        while (opcao != 7){
            switch (opcao){
                case 1:
//                    listarEventos();
                    break;
                case 2:
//                    incluirEvento();
                    break;
                case 3:
//                    excluirEvento();
                    break;
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
    private static void incluirEvento(){
        System.out.println("Digite o nome do evento");
        String nomeEvento = teclado.next();
    }
}
