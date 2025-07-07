import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" === UniALFA === ");

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

        System.out.println("Informe o Nome:");
        String nome = objetoScanner.nextLine();

        System.out.println("Informe a Idade:");
        int idade = objetoScanner.nextInt();

        if (idade >= 60) {
            System.out.println(nome + " já é Senior");
        } else if (idade > 17) {
            System.out.println(nome + " pode tirar CNH");
        } else {
            System.out.println(nome + " muito novo");
        }
    }

}