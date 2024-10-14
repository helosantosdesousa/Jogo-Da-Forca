package br.com.fiap;

import br.com.fiap.control.JogoController;
import br.com.fiap.view.JogoView;
import br.com.fiap.model.JogoModel;
import br.com.fiap.util.GeradorDePalavras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int maxTentativas = 6;
        String palavra = "";
        GeradorDePalavras gerador = new GeradorDePalavras();

        int op= 0;

        do {
            System.out.println("------------------- JOGO DA FORCA -------------------");
            System.out.println("0 - SAIR\n1 - Inserir palavra à ser advinhada\n2 - Gerar palavra aleatória");
            op = e.nextInt();
            switch (op){
                case 1:
                    System.out.println("Insira a palavra: ");
                    palavra = e.next().toLowerCase();
                    break;
                case 2:
                    palavra = gerador.gerarPalavraAleatoria();
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            if (!palavra.isEmpty() && op!=0) {
                JogoModel model = new JogoModel(palavra, maxTentativas);
                JogoView view = new JogoView();
                JogoController controller = new JogoController(model, view);
                controller.iniciaJogo();
            } else {
                System.out.println("Nenhuma palavra foi escolhida.");
            }

        } while (op!=0);

    }
        
        
    }
