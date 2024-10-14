package br.com.fiap.control;

import br.com.fiap.model.JogoModel;
import br.com.fiap.view.JogoView;

public class JogoController {

    private JogoModel modelo;
    private JogoView view;

        public JogoController(JogoModel modelo, JogoView view) {
            this.modelo = modelo;
            this.view = view;
        }

    public void iniciaJogo() {
        while (!modelo.isGameOver()) {
            view.mostraResultado(modelo.getChute(), modelo.getTentativasRestantes());
            char letra = view.getLetra();
            modelo.advinhaLetra(letra);
        }

        boolean ganhou = modelo.isAdvinhado();
        view.mostraResultado(ganhou, modelo.getPalavra());
    }

}


