import java.util.Scanner;

public class Main {

    private static String nome;
    private static int idade;
    private static int valorDoado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Little Tiger");
        System.out.println("|");
        System.out.println("|");
        System.out.println("Olá, possivel ganhador venha jogar com a gente , se cadastre abaixo agora mesmo!!!");

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

        System.out.println("Para Adicionar um cliente digite [1], para realizar doações digite [2],");
        System.out.println("para exibir as informações dos clientes cadastrados digite [3],  ");
        System.out.println("para alterar o cliente digite [4],para remover o cliente digite [5],");
        System.out.println("e para sair digite [6]");
        int opcao = scanner.nextInt();
        switch (opcao) {

        }
    }
}