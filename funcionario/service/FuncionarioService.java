package br.com.funcionario.service;

import br.com.funcionario.model.FuncionarioModel;

public class FuncionarioService {

    FuncionarioModel funcionarioModel;


    public FuncionarioService(FuncionarioModel funcionarioModel){
        this.funcionarioModel = funcionarioModel;
    }

    public void aumentarSalario(float aumento){
        float salario = (float) (funcionarioModel.getSalario() +((funcionarioModel.getSalario()*aumento)/100));
        funcionarioModel.setSalario(salario);
    }
}
