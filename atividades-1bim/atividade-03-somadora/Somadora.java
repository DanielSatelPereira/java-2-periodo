import java.util.Scanner;

public class Somadora {
    public static void main(String[] args) {
        System.out.println("=== SOMADORA ===");
        Scanner objetoDeLeitura = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int valor1 = objetoDeLeitura.nextInt();

        System.out.println("Informe o segundo valor:");
        int valor2 = objetoDeLeitura.nextInt();

        int resultado = valor1 + valor2;
        System.out.println("O resultado é:" + resultado);
    }
}
