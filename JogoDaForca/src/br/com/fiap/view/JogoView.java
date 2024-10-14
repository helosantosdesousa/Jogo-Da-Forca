package br.com.fiap.view;

import java.util.Scanner;

public class JogoView {

        private Scanner e = new Scanner(System.in);

        public void mostraResultado(String chute, int tentativasRestantes) {
            System.out.println("Palavra: " + chute);
            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }

        public char getLetra() {
            System.out.print("Digite uma letra: ");
            return e.next().charAt(0);
        }

        public void mostraResultado(boolean ganhou, String palavrra) {
            if (ganhou) {
                System.out.println("Parabéns! Você ganhou o jogo!");
            } else {
                System.out.println("Você perdeu! A palavra era: " + palavrra);
            }
        }
    }


