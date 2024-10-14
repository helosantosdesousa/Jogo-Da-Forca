# Jogo da Forca 🎉

## Descrição 📝

O **Jogo da Forca** é uma implementação simples do clássico jogo de adivinhação de palavras, onde o jogador tenta descobrir uma palavra oculta letra por letra. O jogo oferece a opção de inserir uma palavra personalizada ou gerar uma palavra aleatória a partir de uma lista predefinida.

## Funcionalidades 🌟

- Inserir uma palavra personalizada.
- Gerar uma palavra aleatória.
- Adivinhar letras e receber feedback em tempo real.
- Mensagens informativas ao final do jogo (você ganhou ou perdeu).

## Tecnologias Utilizadas 💻

- **Java**: Linguagem de programação para a implementação do jogo.
- **UML**: Diagramas para estruturar a arquitetura do projeto.

## Estrutura do Projeto 📂

```plaintext
src
│
├── br
│   └── fiap
│       ├── control
│       │   └── JogoController.java
│       │
│       ├── model
│       │   └── JogoModel.java
│       │
│       └── view
│           └── JogoView.java
│
├── util
│   └── GeradorDePalavras.java
│
└── Main.java
