# 📘 Projeto: Avaliação de Aluno - Cálculo de Média e Status

Este projeto em **Java puro (sem frameworks)** permite cadastrar um aluno via terminal, calcular a média com base nas notas e informar o status acadêmico conforme critérios definidos.

---

## ✅ Funcionalidades

- Entrada de dados via console
- Cálculo da média de duas notas
- Determinação de status do aluno:
    - Nota **acima de 6** → `Aprovado`
    - Nota **entre 4 e 6** → `Verificação Suplementar`
    - Nota **abaixo de 4** → `Reprovado`
- Validação de notas (entre 0 e 10)
- Testes unitários com **JUnit 5** e **Hamcrest**

---

## 🧩 Estrutura de Pacotes

```
/src
 ├── model
 │   └── Aluno.java
 ├── service
 │   └── NotaService.java
 ├── exception
 │   └── NotaInvalidaException.java

/test
 └── NotaServiceTest.java

/lib
 ├── junit-platform-console-standalone-1.9.3.jar
 └── hamcrest-core-1.3.jar

Main.java
README.md
```

---

## ▶️ Como Executar o Programa

### 1. Compilar:

```bash
javac -d bin src/model/*.java src/service/*.java src/exception/*.java Main.java
```

### 2. Executar:

```bash
java -cp bin Main
```

---

## 🧪 Como Rodar os Testes

Certifique-se de que os arquivos `.jar` do **JUnit** e **Hamcrest** estão dentro da pasta `/lib`.

### 1. Compilar testes:

```bash
javac -d bin -cp "lib/*;bin" test/NotaServiceTest.java
```

### 2. Executar testes:

```bash
java -jar lib/junit-platform-console-standalone-1.9.3.jar -cp "bin" --scan-classpath
```

---

## 📋 Exemplo de Execução

```bash
Digite o nome do aluno: João
Digite a primeira nota: 7.5
Digite a segunda nota: 8.0

Aluno: João
Média: 7.75
Status: Aprovado
```

---

## 💡 Requisitos

- Java 11 ou superior
- JUnit 5
- Hamcrest (incluso no standalone)
- Terminal (para compilar e executar)

---

## ✍️ Autor

Este projeto foi desenvolvido como exercício de lógica e boas práticas em Java com separação por pacotes e testes automatizados.

---
