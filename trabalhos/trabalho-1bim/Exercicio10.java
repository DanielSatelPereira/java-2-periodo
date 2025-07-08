import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int quantidadePares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            }
        }
        double mediaPares;
        if (quantidadePares > 0) {
            mediaPares = (double) somaPares / quantidadePares;
        } else {
            mediaPares = 0;
        }
        System.out.println("A média dos números pares digitados é: " + mediaPares);
        scanner.close();
    }
}