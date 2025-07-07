import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String LITTLE_TIBER_EVOLUTION = "Little Tiger Evolution";
    private static final int NOME = 0;
    private static final int ENDERECO = 1;
    private static final int EMAIL = 2;

    private static List<String[]> doadores = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(LITTLE_TIBER_EVOLUTION);
        exibirMenu();
    }
    private static void exibirMenu(){
        String menu = """
               ____________________________________________
                | 1 - Adicionar Doador                   |
                | 2 - Exibir os Doadores Cadastrados     |
                | 3 - Alterar o doador                   |
                | 4 - Remover o doador                   |
                | 5 - Sair                               |
                ___________________________________________
               
                 Escolha: """;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) System.out.println(adicionarDoador());
            if (opcao == 2) listarDoadores();
            if (opcao == 3) System.out.println(alterarDoador());
            if (opcao == 4) System.out.println(removerDoador());
            if (opcao == 5) System.out.println("Finalizando o " + LITTLE_TIBER_EVOLUTION);
        } while (opcao != 5);

    }

    private static String adicionarDoador(){
        Scanner scanner = new Scanner(System.in);
        String[] doador = new String[3];

        System.out.println("""
                ----------------------
                 Cadastro de doadores
                ----------------------
                """);

        System.out.println("Nome: ");
        doador[NOME] = scanner.nextLine();

        System.out.println("Endereço: ");
        doador[ENDERECO] = scanner.nextLine();

        System.out.println("E-mail: ");
        doador[EMAIL] = scanner.nextLine();

        doadores.add(doador);
        return "Sucesso!";
    }

    private static void listarDoadores(){

        System.out.println("""
                -------------------
                 Lista de doadores
                -------------------
                """);
        int indeexDoador = 0;
        for(String[] doador : doadores){
            System.out.println("[" + (indeexDoador++)  + "] - " +
                    doador[NOME] + " - " +
                    doador[ENDERECO]  + " - " +
                    doador[EMAIL]);
        }
    }

    private static String alterarDoador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ------------------------
                 Remoção de doadores
                ------------------------
                """);
        System.out.println("Informe o index do doador: ");
        int indexDoador = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Será alterado os dados do doador " + doadores.get(indexDoador)[NOME]);

        System.out.println("Novo Nome: ");
        doadores.get(indexDoador)[NOME] = scanner.nextLine();

        System.out.println("Novo Endereço: ");
        doadores.get(indexDoador)[ENDERECO] = scanner.nextLine();

        System.out.println("Novo E-mail: ");
        doadores.get(indexDoador)[EMAIL] = scanner.nextLine();


        return "Sucesso!";
    }

    private static String removerDoador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ------------------------
                 Manutenção de doadores
                ------------------------
                """);
        System.out.println("Informe o index do doador: ");
        int indexDoador = scanner.nextInt();
        System.out.println("Remover doador " + doadores.get(indexDoador)[NOME]);
        doadores.remove(indexDoador);

        return "Removido com sucesso!";
    }
}