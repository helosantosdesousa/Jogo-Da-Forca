package br.com.fiap.util;

import java.util.Random;

public class GeradorDePalavras {

        private static final String[] PALAVRAS = {
                "computador", "professor", "floresta", "montanha", "chocolate", "rato", "instrumento",
                "natal", "destino", "vermelho", "alegria", "filme"
        };

        private Random random;

        public GeradorDePalavras() {
            this.random = new Random();
        }

        public String gerarPalavraAleatoria() {
            int index = random.nextInt(PALAVRAS.length);
            return PALAVRAS[index];
        }
    }


