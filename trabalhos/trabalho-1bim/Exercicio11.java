import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        String senha = scanner.nextLine();
        int tentativa = 1;
        while (tentativa <= 5) {
            System.out.println("Digite a senha novamente");
            String valor = scanner.nextLine();

            if (valor.equals(senha)) {
                System.out.println("Senha Correta");
                tentativa = 5;
            }
            tentativa++;

        }
    }
}