import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExemploDois {
    public static void main(String[] args) {
        System.out.println("UniALFA");
        List<String> listaDeCarros = new ArrayList<>();
        List<String> listadoMenu = Arrays.asList("Cadastrar", "Alterar", "Sair");

        Scanner objetoLeitura = new Scanner(System.in);
        System.out.println("Informe o nome do carro");
        listaDeCarros.add(objetoLeitura.nextLine());

        if (!listaDeCarros.isEmpty()) System.out.println(listaDeCarros.getFirst()+" Cadastrado");
    }


}
