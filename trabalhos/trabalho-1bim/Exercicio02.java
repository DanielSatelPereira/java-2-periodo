import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("digite um número");
        int numero = scanner1.nextInt();
        if (numero % 2 == 0) {
            System.out.println("o número  " + numero + " é par ");
        } else {
            System.out.println("o número " + numero + " é impar ");

        }
    }
}