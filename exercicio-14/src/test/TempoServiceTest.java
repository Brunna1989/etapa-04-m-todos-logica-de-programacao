package test;

import model.Tempo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.TempoService;
import exception.TempoInvalidoException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TempoServiceTest {

    private TempoService tempoService;

    @BeforeEach
    public void setUp() {
        tempoService = new TempoService();
    }

    @Test
    public void deveConverterSegundosParaTempoCorreto() {
        Tempo tempo = tempoService.converterSegundos(7023);
        assertEquals(1, tempo.getHoras());
        assertEquals(57, tempo.getMinutos());
        assertEquals(3, tempo.getSegundos());
    }

    @Test
    public void deveLancarExcecaoParaTempoNegativo() {
        TempoInvalidoException exception = assertThrows(TempoInvalidoException.class, () -> tempoService.converterSegundos(-1));
        assertEquals("O tempo não pode ser negativo.", exception.getMessage());
    }

    @Test
    public void deveConverterZeroSegundosParaZeroTempo() {
        Tempo tempo = tempoService.converterSegundos(0);
        assertEquals(0, tempo.getHoras());
        assertEquals(0, tempo.getMinutos());
        assertEquals(0, tempo.getSegundos());
    }

    @Test
    public void deveConverterSegundosParaHoraMinutoSegundosCorretos() {
        Tempo tempo = tempoService.converterSegundos(3661);
        assertEquals("1h1min1seg", tempo.toString());
    }
}
