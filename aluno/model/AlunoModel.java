package br.com.aluno.model;

public class AlunoModel {
    private String nome;
    private float media;

    public AlunoModel(String nome, float media){
        this.nome = nome;
        this.media = media;
    }

    public float getMedia(){
        return media;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedia(float media) {
        this.media = media;
    }



}
