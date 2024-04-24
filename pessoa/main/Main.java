package br.com.pessoa.main;

import br.com.pessoa.model.PessoaModel;
import br.com.pessoa.service.PessoaService;
import br.com.pessoa.view.PessoaView;

public class Main {
    public static void main(String[]args){
        PessoaModel pessoaModel01 = new PessoaModel("João",19,1.81f);
        PessoaModel pessoaModel02 = new PessoaModel("Pedro",17,1.71f);

        PessoaService pessoaService = new PessoaService();

        PessoaView pessoaView = new PessoaView();

        pessoaView.mostraMensagem(pessoaService.verificarIdade(pessoaModel01.getIdade()));
        pessoaView.mostraMensagem(pessoaService.verificarIdade(pessoaModel02.getIdade()));



    }
}
