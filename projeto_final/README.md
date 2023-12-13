# Projeto Final da Disciplina de Programação Orientada a Objetos

## Sistema de Gerenciamento Escolar


```mermaid
classDiagram
    class Pessoa {
        -nome: String
        -idade: int
        +getNome(): String
        +getIdade(): int
        +setNome(): void
        +setIdade(): void
    }

    class Aluno {
        -matricula: int
        -curso: String
        +getNotas(): double
    }

    class Professor {
        -disciplina: String
        +getDisciplina(): String
    }

    Pessoa <|-- Aluno
    Pessoa <|-- Professor
```