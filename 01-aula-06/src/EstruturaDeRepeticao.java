public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int valor = 2;
        executarExemploWhile(valor);
        executarExemploDoWhile(valor);
        executarExemploFor();

    }

    private static void executarExemploFor() {
        for (int condicao = 0; condicao < 5; condicao++) {
            System.out.println("Exemplo for" + condicao);
        }
    }

    private static void executarExemploDoWhile(int condicao) {
        do {
            System.out.println("Exemplo Do While " + condicao);
            condicao++;
        } while (condicao < 5);
    }

    private static void executarExemploWhile(int condicao) {
        while (condicao < 5) {
            condicao++;
            System.out.println("Exemplo While " + condicao);
        }
    }
}
