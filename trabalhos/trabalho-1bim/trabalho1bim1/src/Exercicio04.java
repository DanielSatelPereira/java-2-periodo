import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Qual a operação você deseja Realizar");
        System.out.println("(1) Adição (2) Subtração (3) Multiplicação (4) Divisão");
        int operacao = teclado.nextInt();

        System.out.println("Digite um número:");
        int num1 = teclado.nextInt();

        System.out.println("Digite outro número:");
        int num2 = teclado.nextInt();

        operacao(operacao, num1, num2);
    }

    public static void operacao(int operacao, int num1, int num2) {
        int resultado;


        if (operacao == 1) {
            resultado = num1 + num2;
            System.out.printf("%s + %s = %s", num1, num2, resultado);
        } else if (operacao == 2) {
            resultado = num1 - num2;
            System.out.printf("%s - %s = %s", num1, num2, resultado);
        } else if (operacao == 3) {
            resultado = num1 * num2;
            System.out.printf("%s * %s = %s", num1, num2, resultado);
        } else if (operacao == 4) {
            float resultadoDiv = (float) num1 / num2;
            System.out.printf("%s / %s = %s", num1, num2, resultadoDiv);
        } else {
            System.out.println("Operação invalida");
        }


    }

}