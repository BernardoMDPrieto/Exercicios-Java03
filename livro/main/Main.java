package br.com.livro.main;

import br.com.livro.model.LivroModel;
import br.com.livro.service.LivroService;
import br.com.livro.view.LivroView;

public class Main {

    public static void main(String[] args) {
        LivroModel livroModel = new LivroModel("O Processo", "Kafka",1925);
        LivroService livroService = new LivroService(livroModel);

        LivroView livroView = new LivroView();

        livroView.mostraLivro(livroService.informaDadosLivro());
    }



}
