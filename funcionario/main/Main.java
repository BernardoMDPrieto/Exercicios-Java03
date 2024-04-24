package br.com.funcionario.main;

import br.com.funcionario.model.FuncionarioModel;
import br.com.funcionario.service.FuncionarioService;
import br.com.funcionario.view.FuncionarioView;

public class Main {
    public static void main(String[] args) {
        FuncionarioModel funcionarioModel = new FuncionarioModel("Bernardo","Estagiário",1500.00f);
        FuncionarioService funcionarioService = new FuncionarioService(funcionarioModel);
        FuncionarioView funcionarioView = new FuncionarioView();

        funcionarioView.mostraFuncionario(funcionarioModel.getNome(),funcionarioModel.getCargo(),funcionarioModel.getSalario());
        funcionarioService.aumentarSalario(10);
        funcionarioView.mostraFuncionario(funcionarioModel.getNome(),funcionarioModel.getCargo(),funcionarioModel.getSalario());

    }

}
