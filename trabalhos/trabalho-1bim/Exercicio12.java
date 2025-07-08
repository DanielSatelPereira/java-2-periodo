import java.util.Scanner;

public class Exercicio12 {

    // Converte Celsius para Fahrenheit
    public static float celsiusParaFahrenheit(float celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Converte Celsius para Kelvin
    public static float celsiusParaKelvin(float celsius) {
        return celsius + 273.15f;
    }

    // Converte Fahrenheit para Celsius
    public static float fahrenheitParaCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Converte Fahrenheit para Kelvin
    public static float fahrenheitParaKelvin(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15f;
    }

    // Converte Kelvin para Celsius
    public static float kelvinParaCelsius(float kelvin) {
        return kelvin - 273.15f;
    }

    // Converte Kelvin para Fahrenheit
    public static float kelvinParaFahrenheit(float kelvin) {
        return (kelvin - 273.15f) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Celsius para Kelvin");
        System.out.println("3. Fahrenheit para Celsius");
        System.out.println("4. Fahrenheit para Kelvin");
        System.out.println("5. Kelvin para Celsius");
        System.out.println("6. Kelvin para Fahrenheit");
        System.out.print("Digite o número da opção escolhida: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a temperatura a ser convertida: ");
        float temperatura = scanner.nextFloat();

        float resultado = 0;
        String unidade = "";

        if (opcao == 1) {
            resultado = celsiusParaFahrenheit(temperatura);
            unidade = "Fahrenheit";
        } else if (opcao == 2) {
            resultado = celsiusParaKelvin(temperatura);
            unidade = "Kelvin";
        } else if (opcao == 3) {
            resultado = fahrenheitParaCelsius(temperatura);
            unidade = "Celsius";
        } else if (opcao == 4) {
            resultado = fahrenheitParaKelvin(temperatura);
            unidade = "Kelvin";
        } else if (opcao == 5) {
            resultado = kelvinParaCelsius(temperatura);
            unidade = "Celsius";
        } else if (opcao == 6) {
            resultado = kelvinParaFahrenheit(temperatura);
            unidade = "Fahrenheit";
        } else {
            System.out.println("Opção inválida.");
            return; // Termina o método se a opção for inválida
        }


        System.out.printf("A temperatura convertida é %.2f %s%n", resultado, unidade);
    }
}
