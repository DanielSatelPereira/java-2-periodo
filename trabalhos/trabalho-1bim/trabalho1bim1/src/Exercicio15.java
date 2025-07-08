import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contagem
        int contagemPositivos = 0;
        int contagemNegativos = 0;
        int contagemZeros = 0;

        // Laço for para solicitar 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            // Atualiza contadores com base no número fornecido
            if (numero > 0) {
                contagemPositivos++;
            } else if (numero < 0) {
                contagemNegativos++;
            } else {
                contagemZeros++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de números positivos: " + contagemPositivos);
        System.out.println("Quantidade de números negativos: " + contagemNegativos);
        System.out.println("Quantidade de zeros: " + contagemZeros);

        scanner.close();
    }
}
