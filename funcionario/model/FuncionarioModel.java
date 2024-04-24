package br.com.funcionario.model;

public class FuncionarioModel {
    private String nome;
    private String cargo;
    private float salario;

    public FuncionarioModel(String nome, String cargo, float salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getCargo(){
        return cargo;
    }

    public float getSalario(){
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }



}
