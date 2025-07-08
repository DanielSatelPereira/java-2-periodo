import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora de Média");

        System.out.println("Insira a primeira nota:");
        int nota1 = teclado.nextInt();

        System.out.println("Insira a segunda nota:");
        int nota2 = teclado.nextInt();

        System.out.println("Insira a terceira nota:");
        int nota3 = teclado.nextInt();

        media(nota1, nota2, nota3);

    }

    public static void media(int n1, int n2, int n3) {
        float media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Aluno está aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}