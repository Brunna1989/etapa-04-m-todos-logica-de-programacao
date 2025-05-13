import service.TempoService;
import exception.TempoInvalidoException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TempoService tempoService = new TempoService();

        System.out.print("Digite o tempo em segundos: ");
        int segundos = scanner.nextInt();

        try {
            String resultado = tempoService.converterSegundos(segundos).toString();
            System.out.println("Tempo convertido: " + resultado);
        } catch (TempoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
