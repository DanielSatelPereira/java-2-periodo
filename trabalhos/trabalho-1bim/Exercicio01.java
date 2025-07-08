import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do array
        int tamanho = 5;
        int[] number = new int[tamanho];

        // Loop para ler os números do usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira o número " + (i + 1) + ":");
            number[i] = scanner.nextInt();
        }

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Loop para calcular a soma dos números
        for (int i = 0; i < tamanho; i++) {
            soma += number[i];
        }

        // Exibe a soma dos números
        System.out.println("A soma dos números inseridos é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}
