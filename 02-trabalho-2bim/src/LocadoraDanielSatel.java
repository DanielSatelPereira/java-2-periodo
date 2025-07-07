import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocadoraDanielSatel {

    private static final String LOCAL = "Locadora do Daniel Satel";
    private static final int NOME = 0;
    private static final int ESTUDIO = 1;
    private static final int DIRETOR = 2;
    private static final int GENERO = 3;
    private static final int ANO = 4;

    private static List<String[]> filmes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(LOCAL);
        exibirMenu();
    }

    private static void exibirMenu() {
        String menu = """
                ____________________________________________
                 | 1 - Adicionar filme                    |
                 | 2 - Listar todos os filmes             |
                 | 3 - Listar um Filme específico         |
                 | 4 - Alterar o Filme                    |
                 | 5 - Remover o Filme                    |
                 | 6 - Sair                               |
                 ___________________________________________
                
                  Escolha: """;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) System.out.println(adicionarFilme());
            if (opcao == 2) listarFilmes();
            if (opcao == 3) listarFilmesEspecificos();
            if (opcao == 4) System.out.println(alterarFilme());
            if (opcao == 5) System.out.println(removerFilme());
            if (opcao == 6) System.out.println("Finalizando o sistema da " + LOCAL);
        } while (opcao != 6);

    }

    private static String adicionarFilme() {
        Scanner scanner = new Scanner(System.in);
        String[] filme = new String[5];

        System.out.println("""
                ----------------------
                  Registro de Filmes
                ----------------------
                """);

        System.out.println("Nome: ");
        filme[NOME] = scanner.nextLine();

        System.out.println("Estúdio: ");
        filme[ESTUDIO] = scanner.nextLine();

        System.out.println("Diretor: ");
        filme[DIRETOR] = scanner.nextLine();

        System.out.println("Genêro: ");
        filme[GENERO] = scanner.nextLine();

        System.out.println("Ano: ");
        filme[ANO] = scanner.nextLine();

        filmes.add(filme);
        return "Sucesso!";
    }

    private static void listarFilmes() {
        System.out.println("""
                -------------------
                 Lista de Filmes
                -------------------
                """);

        if (filmes.isEmpty()) {
            System.out.println("Não há filmes na lista.");
        } else {
            int indeexDoador = 0;
            for (String[] filme : filmes) {
                System.out.println("[" + (indeexDoador++) + "] █ " +
                        filme[NOME] + " █ " +
                        filme[ESTUDIO] + " █ " +
                        filme[DIRETOR] + " █ " +
                        filme[GENERO] + " █ " +
                        filme[ANO]);
            }
        }
    }


    private static void listarFilmesEspecificos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o índice do filme que deseja pesquisar: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < filmes.size()) {
            String[] filme = filmes.get(index);
            System.out.println("""
                    -------------------
                     Filme Específico
                    -------------------
                    """ + " █ " +
                    "Nome: " + filme[NOME] + " ███ " +
                    "Estúdio: " + filme[ESTUDIO] + " ███ " +
                    "Diretor: " + filme[DIRETOR] + " ███ " +
                    "Gênero: " + filme[GENERO] + " ███ " +
                    "Ano: " + filme[ANO] + " █ "
            );
        } else {
            System.out.println("Índice inválido! Não há filme com esse índice.");
        }
    }

    private static String alterarFilme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ------------------------
                 Remoção de Filmes
                ------------------------
                """);
        System.out.println("Informe o index do filme: ");
        int filme = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Será alterado os dados do filme " + filmes.get(filme)[NOME]);

        System.out.println("Novo Nome: ");
        filmes.get(filme)[NOME] = scanner.nextLine();

        System.out.println("Novo Estúdio: ");
        filmes.get(filme)[ESTUDIO] = scanner.nextLine();

        System.out.println("Novo Diretor: ");
        filmes.get(filme)[DIRETOR] = scanner.nextLine();

        System.out.println("Novo Genêro: ");
        filmes.get(filme)[GENERO] = scanner.nextLine();

        System.out.println("Novo Ano: ");
        filmes.get(filme)[ANO] = scanner.nextLine();

        return "Sucesso!";
    }

    private static String removerFilme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ------------------------
                 Remoção de filmes
                ------------------------
                """);
        System.out.println("Informe o index do filme: ");
        int filme = scanner.nextInt();
        System.out.println("Remover filme " + filmes.get(filme)[NOME]);
        filmes.remove(filme);

        return "Removido com sucesso!";
    }
}
