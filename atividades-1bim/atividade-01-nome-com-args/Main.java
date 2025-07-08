import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objetoDeLeitura = new Scanner(System.in);
        imprimir(args[0]);
        imprimir(args[1]);
        imprimir("Informe o nome:");
        String nome = objetoDeLeitura.nextLine();
        imprimir(nome + ", bem vindo a " + args[0]);
        objetoDeLeitura.close();
    }

    private static void imprimir(String valor) {
        System.out.println(valor);
    }
}
