package test;

import org.junit.jupiter.api.Test;
import service.CalculadoraService;
import exception.DivisaoPorZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraServiceTest {

    @Test
    public void testeSoma() {
        double resultado = CalculadoraService.executarOperacao(1, 2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testeSubtracao() {
        double resultado = CalculadoraService.executarOperacao(2, 5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testeMultiplicacao() {
        double resultado = CalculadoraService.executarOperacao(3, 2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testeDivisao() {
        double resultado = CalculadoraService.executarOperacao(4, 6, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testeDivisaoPorZero() {
        assertThrows(DivisaoPorZeroException.class, () -> CalculadoraService.executarOperacao(4, 6, 0));
    }

    @Test
    public void testePotencia() {
        double resultado = CalculadoraService.executarOperacao(5, 2, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testeOperacaoInvalida() {
        assertThrows(DivisaoPorZeroException.class, () -> CalculadoraService.executarOperacao(6, 2, 3));
    }
}
