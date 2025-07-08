import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        // Criação do Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro positivo ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println("Números entre 1 e " + numero + " que são divisíveis por 3 e 5:");

            // Laço for para percorrer os números de 1 até o número fornecido
            for (int i = 1; i <= numero; i++) {
                // Verifica se o número é divisível por 3 e por 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }

        // Fecha o Scanner
        scanner.close();
    }
}
