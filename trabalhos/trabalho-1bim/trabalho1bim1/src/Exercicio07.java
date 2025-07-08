import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
            return;
        }
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}