package service;

import model.Aluno;
import exception.NotaInvalidaException;

public class NotaService {

    public double calcularMedia(Aluno aluno) {
        double nota1 = aluno.getNota1();
        double nota2 = aluno.getNota2();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            throw new NotaInvalidaException("Notas devem estar entre 0 e 10.");
        }

        return (nota1 + nota2) / 2.0;
    }

    public String obterStatus(double media) {
        if (media > 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }
}
