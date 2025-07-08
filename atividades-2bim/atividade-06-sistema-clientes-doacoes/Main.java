import java.util.Scanner;

public class Main {
    private static String nome = "";
    private static int idade = 0;
    private static int valorDoado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Little Tiger!");
        System.out.println("|");
        System.out.println("|");
        System.out.println("Olá, possível ganhador! Venha jogar com a gente. Cadastre-se abaixo agora mesmo!!!");

        for (int i = 1; i <= 10; i++) {
            System.out.println("                             |||||||");
        }
        System.out.println("                      \\\\\\\\\\\\\\|||||||//////");
        System.out.println("                       \\\\\\\\\\\\|||||||/////");
        System.out.println("                        \\\\\\\\\\|||||||////");
        System.out.println("                         \\\\\\\\|||||||///");
        System.out.println("                          \\\\\\|||||||//");
        System.out.println("                           \\\\|||||||/");
        System.out.println("                            \\\\|||||/");
        System.out.println("                             \\\\|||/");
        System.out.println("                              \\\\|/");
        System.out.println("                               \\/");

        int opcao;

        do {
            System.out.println("""
                    
                    MENU:
                    1 - Adicionar Cliente
                    2 - Exibir Dados do Cliente
                    3 - Alterar Cliente
                    4 - Remover Cliente
                    5 - Realizar Doação
                    6 - Sair
                    """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> adicionarCliente();
                case 2 -> exibirDados();
                case 3 -> alterarCliente();
                case 4 -> removerCliente();
                case 5 -> realizarDoacao();
                case 6 -> System.out.println("Encerrando...");
                default -> System.out.println("Digite um número válido (1 a 6).");
            }

        } while (opcao != 6);
    }

    private static void adicionarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();

        validarIdade();
    }

    private static void exibirDados() {
        if (idade > 0) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Valor doado: R$" + valorDoado);
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }
    }

    private static void alterarCliente() {
        if (idade >= 18) {
            System.out.println("Alterando os dados do cliente: " + nome);
            adicionarCliente();
            System.out.println("Cliente alterado com sucesso!");
            exibirDados();
        } else {
            System.out.println("Nenhum cliente cadastrado para alterar.");
        }
    }

    private static void removerCliente() {
        nome = "";
        idade = 0;
        valorDoado = 0;
        System.out.println("Cliente removido.");
    }

    private static void realizarDoacao() {
        if (idade >= 18) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o valor da doação (número inteiro): ");
            valorDoado += scanner.nextInt();
            System.out.println("O saldo doado pelo cliente " + nome + " é: R$" + valorDoado);
        } else {
            System.out.println("Não há cliente cadastrado para doação.");
        }
    }

    private static void validarIdade() {
        if (idade < 18) {
            System.out.println("Este cliente é menor de idade. Cadastro cancelado.");
            removerCliente();
        }
    }
}
