package br.com.fiap.model;

public class JogoModel {

        private String palavra;
        private char[] chute;
        private int tentativasRestantes;

        public JogoModel(String palavra, int maxTentativas) {
            this.palavra = palavra.toLowerCase();
            this.chute = new char[palavra.length()];
            for (int i = 0; i < chute.length; i++) {
                chute[i] = '_';
            }
            this.tentativasRestantes = maxTentativas;
        }

        public boolean advinhaLetra(char letra) {
            letra = Character.toLowerCase(letra);
            boolean achou = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    chute[i] = letra;
                    achou = true;
                }
            }
            if (!achou) {
                tentativasRestantes--;
            }
            return achou;
        }

        public boolean isGameOver() {
            return tentativasRestantes == 0 || isAdvinhado();
        }

        public boolean isAdvinhado() {
            for (char c : chute) {
                if (c == '_') {
                    return false;
                }
            }
            return true;
        }

        public int getTentativasRestantes() {
            return tentativasRestantes;
        }

        public String getChute() {
            return new String(chute);
        }

        public String getPalavra() {
            return palavra;
        }
    }


