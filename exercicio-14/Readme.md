# 📘 Projeto: Conversão de Tempo em Segundos

Este projeto em **Java puro** tem como objetivo converter um tempo dado em segundos para horas, minutos e segundos, utilizando métodos separados para leitura, conversão e exibição do tempo. O projeto inclui a utilização de exceções personalizadas para tratar erros como tempo negativo.

---

## ✅ Funcionalidades

- Entrada de dados via console
- Conversão de segundos para horas, minutos e segundos
- Exibição do tempo no formato `h min seg`
- Validação para garantir que o tempo não seja negativo com exceção personalizada
- Testes unitários com **JUnit 5** e **Hamcrest**

---

## 🧩 Estrutura de Pacotes

```
/src
 ├── model
 │   └── Tempo.java
 ├── service
 │   └── TempoService.java
 ├── exception
 │   └── TempoInvalidoException.java
 ├── test
 │   └── TempoServiceTest.java

Main.java
README.md
```

---

## ▶️ Como Executar o Programa

### 1. Compilar:

```bash
javac -d bin src/model/*.java src/service/*.java src/exception/*.java src/test/*.java Main.java
```

### 2. Executar:

```bash
java -cp bin Main
```

---

## 🧪 Como Rodar os Testes

Certifique-se de que o JUnit e Hamcrest estão configurados corretamente.

### 1. Compilar testes:

```bash
javac -d bin -cp "lib/*;bin" src/test/TempoServiceTest.java
```

### 2. Executar testes:

```bash
java -jar lib/junit-platform-console-standalone-1.9.3.jar -cp "bin" --scan-classpath
```

---

## 📋 Exemplo de Execução

```bash
Digite o tempo em segundos: 7023
Tempo convertido: 1h57min3seg
```

---

## 💡 Requisitos

- Java 11 ou superior
- JUnit 5
- Hamcrest (incluso no standalone)
- Terminal (para compilar e executar)

---

## ✍️ Autor

Este projeto foi desenvolvido para estudo de lógica de programação, com foco na conversão de tempo em segundos e no uso de exceções personalizadas.

---
