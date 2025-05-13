package test;

import model.Aluno;
import service.NotaService;
import exception.NotaInvalidaException;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class NotaServiceTest {

    private NotaService service;

    @BeforeEach
    public void setUp() {
        service = new NotaService();
    }

    @Test
    public void deveCalcularMediaCorretamente() {
        Aluno aluno = new Aluno("João", 7.0, 5.0);
        double media = service.calcularMedia(aluno);
        assertEquals(6.0, media, 0.001);
    }

    @Test
    public void deveRetornarStatusAprovado() {
        double media = 7.5;
        assertEquals("Aprovado", service.obterStatus(media));
    }

    @Test
    public void deveRetornarStatusVerificacaoSuplementar() {
        double media = 5.5;
        assertEquals("Verificação Suplementar", service.obterStatus(media));
    }

    @Test
    public void deveRetornarStatusReprovado() {
        double media = 3.0;
        assertEquals("Reprovado", service.obterStatus(media));
    }

    @Test
    public void deveLancarExcecaoParaNotaMenorQueZero() {
        Aluno aluno = new Aluno("Ana", -1.0, 6.0);
        assertThrows(NotaInvalidaException.class, () -> service.calcularMedia(aluno));
    }

    @Test
    public void deveLancarExcecaoParaNotaMaiorQueDez() {
        Aluno aluno = new Aluno("Carlos", 9.0, 11.0);
        assertThrows(NotaInvalidaException.class, () -> service.calcularMedia(aluno));
    }

    @Test
    public void deveAceitarNotasExtremasValidas() {
        Aluno aluno = new Aluno("Lucas", 0.0, 10.0);
        double media = service.calcularMedia(aluno);
        assertEquals(5.0, media, 0.001);
        assertEquals("Verificação Suplementar", service.obterStatus(media));
    }
}
