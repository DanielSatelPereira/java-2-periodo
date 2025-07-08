import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de número primo");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();


        scanner.close();


        boolean primo = true;


        if (numero <= 1) {
            primo = false;
        } else {
            // Verifica se o número é divisível por algum outro número além de 1 e ele mesmo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}