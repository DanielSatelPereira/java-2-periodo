import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);

        scanner.close();
    }
}
