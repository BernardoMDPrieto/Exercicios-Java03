package br.com.livro.service;

import br.com.livro.model.LivroModel;

public class LivroService {
    LivroModel livroModel;

    public LivroService(LivroModel livroModel){
        this.livroModel = livroModel;
    }

    public String informaDadosLivro(){

            String mensagem = String.format("Titulo: %s \nAutor: %s\nAno de publicação: %d",
                    livroModel.getTitulo(),livroModel.getAutor(),livroModel.getAnoDePublicacao());

            return mensagem;

    }
}
