import model.Aluno;
import service.NotaService;
import exception.NotaInvalidaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotaService service = new NotaService();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        try {
            Aluno aluno = new Aluno(nome, nota1, nota2);
            double media = service.calcularMedia(aluno);
            String status = service.obterStatus(media);

            System.out.printf("\nAluno: %s\nMédia: %.2f\nStatus: %s\n", nome, media, status);
        } catch (NotaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
