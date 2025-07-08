import java.util.Scanner;

public class Main {
    private static String nome;
    private static String x;

    public static void main(String[] args) {
        System.out.println("=== UniAlfa ===");
        Scanner objetoScanner = new Scanner(System.in);


        int continuar = 0;
        do {
            validarIdadeDoUsuario();
            System.out.println("Deseja continuar cadastrando: [0]-Não [1]-Sim");
            continuar = objetoScanner.nextInt();
        } while (continuar > 0);
    }

    private static void validarIdadeDoUsuario() {
        Scanner objetoScanner = new Scanner(System.in);

        System.out.println("Informe o seu Nome: ");
        String nome = objetoScanner.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = objetoScanner.nextInt();

        if (idade >= 60) {
            System.out.println(nome + "é o veio brabo");
        } else if (idade > 17) {
            System.out.println(nome + "Já pode ir preso.");
        } else {
            System.out.println(nome + "ainda cheira a leite");
        }
    }

}

