package br.com.pessoa.service;

import br.com.pessoa.model.PessoaModel;

public class PessoaService {
    PessoaModel pessoaModel;
/*
    public PessoaService(PessoaModel pessoaModel){
        this.pessoaModel = pessoaModel;
    }*/

    public String verificarIdade(int idade){
        String mensagem = idade > 17? "Maior de idade!" : "Menor de idade!";
        return mensagem;
    }

}
