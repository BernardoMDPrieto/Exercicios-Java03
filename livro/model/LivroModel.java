package br.com.livro.model;

public class LivroModel {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public LivroModel(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

}
