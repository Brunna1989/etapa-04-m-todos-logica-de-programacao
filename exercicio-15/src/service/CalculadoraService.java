package service;

import model.Calculadora;
import exception.DivisaoPorZeroException;

public class CalculadoraService {

    public static double executarOperacao(int operacao, double a, double b) {
        switch (operacao) {
            case 1:
                return Calculadora.soma(a, b);
            case 2:
                return Calculadora.subtracao(a, b);
            case 3:
                return Calculadora.multiplicacao(a, b);
            case 4:
                if (b == 0) {
                    throw new DivisaoPorZeroException("Erro: Divisão por zero não permitida.");
                }
                return Calculadora.divisao(a, b);
            case 5:
                return Calculadora.potencia(a, b);
            default:
                throw new DivisaoPorZeroException("Erro: Operação inválida.");
        }
    }
}
