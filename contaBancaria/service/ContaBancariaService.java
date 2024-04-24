package br.com.contaBancaria.service;

import br.com.contaBancaria.model.ContaBancariaModel;
import br.com.contaBancaria.view.ContaBancariaView;

public class ContaBancariaService {
    ContaBancariaModel contaBancariaModel;
    ContaBancariaView contaBancariaView;


    public ContaBancariaService(ContaBancariaModel contaBancariaModel, ContaBancariaView contaBancariaView) {
        this.contaBancariaModel = contaBancariaModel;
        this.contaBancariaView = contaBancariaView;
    }

    public void sacarDinheiro(float saque){
        if (contaBancariaModel.getSaldoDaConta() - saque < 0){
            System.out.println("Impossível sacar essa quantia!");
            System.out.println("Quantia disponível para saque: R$" + contaBancariaModel.getSaldoDaConta());
        }else{
            float valorAtual = contaBancariaModel.getSaldoDaConta() - saque;
            contaBancariaModel.setSaldoDaConta(valorAtual);
            System.out.println("Saque concluído!");
            System.out.println("Seu novo saldo é de: R$" + contaBancariaModel.getSaldoDaConta());
        }
    }

    public void depositarDinheiro(float deposito){
        if (deposito > 0){
            float valorAtual = contaBancariaModel.getSaldoDaConta() + deposito;
            contaBancariaModel.setSaldoDaConta(valorAtual);
            System.out.println("Deposito concluído!");
            System.out.println("Seu novo saldo é de: R$" + contaBancariaModel.getSaldoDaConta());

        }else{
            System.out.println("Impossível depositar essa quantia!");        }
    }

}
