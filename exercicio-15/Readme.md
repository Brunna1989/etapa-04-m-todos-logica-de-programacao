# Projeto: Calculadora com Java Puro

Este projeto é uma calculadora desenvolvida em Java puro, sem uso de frameworks como Spring. O objetivo é realizar operações matemáticas básicas (soma, subtração, multiplicação, divisão e potenciação), com entrada via console e organização do código em camadas:

- `model`: lógica matemática
- `service`: controle e validação da operação
- `exception`: exceções personalizadas
- `test`: testes unitários com JUnit

## Funcionalidades

- Escolha da operação via `switch-case`
- Tratamento de exceções como divisão por zero e operação inválida
- Operações com métodos estáticos
- Testes unitários cobrindo cenários positivos, negativos e exceções

## Tecnologias

- Java 8+
- JUnit 5
- Hamcrest
- Console para entrada de dados

## Estrutura de Pastas

```
├── src
│   ├── model
│   │   └── Calculadora.java
│   ├── service
│   │   └── CalculadoraService.java
│   ├── exception
│   │   ├── DivisaoPorZeroException.java
│   │   └── Main.java
├── test
│   └── CalculadoraServiceTest.java
├── lib
│   ├── junit-5.x.x.jar
│   └── hamcrest-core-x.x.x.jar
└── README.md
```

## Como Executar

### 1. Compilar o Projeto

Abra o terminal na pasta do projeto e compile:

```bash
javac -cp "lib/*" -d bin src/**/*.java
```

### 2. Executar o Programa

```bash
java -cp "bin" Main
```

### 3. Executar os Testes com JUnit

Crie a pasta `bin-test` se ainda não existir e compile os testes:

```bash
javac -cp "lib/*;bin" -d bin-test test/CalculadoraServiceTest.java
```

Execute os testes com:

```bash
java -cp "lib/*;bin;bin-test" org.junit.runner.JUnitCore test.CalculadoraServiceTest
```

> Obs: No Linux/macOS troque `;` por `:` no classpath (`-cp`) acima.

## Exemplo de Uso

```
Escolha uma operação: 
1. Soma
2. Subtração
3. Multiplicação
4. Divisão
5. Potenciação
1
Digite o primeiro número: 10
Digite o segundo número: 5
Resultado: 15.0
```

## Cobertura de Testes

- ✅ Soma correta
- ✅ Subtração correta
- ✅ Multiplicação correta
- ✅ Divisão correta
- ✅ Potenciação correta
- ✅ Erro de divisão por zero tratado com `DivisaoPorZeroException`
- ✅ Erro de operação inválida tratado com `OperacaoInvalidaException`

## Autor

Brunna Dornelles  
Projeto de lógica de programação – Etapa 04  
[GitHub - Brunna1989](https://github.com/Brunna1989)

