package br.com.triangulo.service;

import br.com.triangulo.model.TrianguloModel;

public class TrianguloService {

    TrianguloModel trianguloModel;

    public void TrianguloModel(TrianguloModel trianguloModel){
        this.trianguloModel = trianguloModel;
    }

    public String verificarTriangulo(float ladoA, float ladoB, float ladoC){
        String mensagem = "";
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            mensagem = "É triângulo!";
        }else{
            mensagem = "Não é triângulo!";
        }
        return mensagem;
    }
}
