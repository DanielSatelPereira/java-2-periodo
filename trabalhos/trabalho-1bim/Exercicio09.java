import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contadorVogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                    caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
                contadorVogais++;
            }
        }
        System.out.println("A palvra contem " + contadorVogais + " vogais.");

        scanner.close();
        //abriu scanner tem q fechar :0
    }
}