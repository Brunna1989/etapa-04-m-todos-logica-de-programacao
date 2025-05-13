package service;

import model.Tempo;
import exception.TempoInvalidoException;

public class TempoService {

    public Tempo converterSegundos(int segundosTotais) {
        if (segundosTotais < 0) {
            throw new TempoInvalidoException("O tempo não pode ser negativo.");
        }

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        return new Tempo(horas, minutos, segundos);
    }
}
