import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int INDEX_ENDERECO = 0;
    public static final int INDEX_NOME = 1;
    public static final int INDEX_EMAIL = 2;

    private static List<String[]> listaUsers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);

        int op;
        do {
            System.out.println("************* Bem-Vindo ao Litte Tiger Evolution *************");
            System.out.println("Escolha uma opção");
            System.out.println("""
                Adicionar doador (Nome, Endereço, Email) -> Pressione [1]
                Exibir os doadores cadastrados -> Pressione [2]
                Alterar o doador -> Pressione [3]
                Remover o doador -> Pressione [4]
                Sair -> Pressione [5]
                """);
            System.out.println("Opção: ");
            op = scNum.nextInt();
            if (op == 1){
                adicionarUsers();
            } else if (op == 2) {
                mostrarUsersA();
                mostrarUsersB();
                mostrarUsersC();
            } else if (op == 3) {
                alterarUser();
            } else if (op == 4) {
                removerUser();
            }

        } while (op != 5);
    }

    private static void removerUser() {
    }

    private static void alterarUser() {
    }

    private static void mostrarUsersA() {
        for (int i = 0; i < listaUsers.size(); i++) {
            System.out.println("Nome: " + listaUsers.get(i)[INDEX_NOME]);
            System.out.println("Endereço: " + listaUsers.get(i)[INDEX_ENDERECO]);
            System.out.println("Email: " + listaUsers.get(i)[INDEX_EMAIL]);
        }
    }
    private static void mostrarUsersB() {
        for (int i = 0; i < listaUsers.size(); i++) {
            String[] retorno = listaUsers.get(i);
            System.out.println(retorno[INDEX_NOME]);
            System.out.println(retorno[INDEX_ENDERECO]);
            System.out.println(retorno[INDEX_EMAIL]);
        }
    }
    private static void mostrarUsersC() {
        /* Esse for é o mesmo que o da linha 59 e 60 juntos respeitando a sintaxe do for
        dentro do For existe um metodo(sintaxe) que que entende tudo e faz sozinho onde
        a string[] doador recebe o conteudo da lista (listaUsers) que é uma array, e dps acesso cada item do array
        com o index dele.
        */
        for (String[] doador : listaUsers){
            System.out.println(doador[INDEX_NOME]);
            System.out.println(doador[INDEX_ENDERECO]);
            System.out.println(doador[INDEX_EMAIL]);
        }
    }

    private static void adicionarUsers() {
        Scanner scString = new Scanner(System.in);
        String[] user = new String[3];

            System.out.println("Nome do usuario: ");
            user[INDEX_NOME] = scString.nextLine();
            System.out.println("Endereço: ");
            user[INDEX_ENDERECO] = scString.nextLine();
            System.out.println("Email do caboco");
            user[INDEX_EMAIL] = scString.nextLine();

            listaUsers.add(user);
    }

}