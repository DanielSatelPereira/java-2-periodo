import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        boolean idadeValida = false;

        do {
            System.out.print("Por favor, insira sua idade(em números inteiros): ");
            idade = scanner.nextInt();

            if (idade > 0 && idade < 121) {
                idadeValida = true;
                System.out.println("Idade válida: " + idade);
            } else {
                System.out.println("Idade inválida. Por favor, insira um valor entre 1 e 120.");
            }

        } while (!idadeValida);

        scanner.close();
    }
}
