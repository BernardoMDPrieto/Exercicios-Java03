package br.com.funcionario.view;

public class FuncionarioView {


    public void mostraFuncionario(String nome, String cargo, float salario){
        System.out.printf("Nome do funcionario: %s \nCargo: %s \nSalario: %.2f \n",nome,cargo,salario);
    }
}
