package br.com.contaBancaria.main;

import br.com.contaBancaria.model.ContaBancariaModel;
import br.com.contaBancaria.service.ContaBancariaService;
import br.com.contaBancaria.view.ContaBancariaView;

public class Main {
    public static void main(String[] args) {
        ContaBancariaModel contaBancariaModel = new ContaBancariaModel("Bernardo", 54878157, 1500.00f);
        ContaBancariaView contaBancariaView = new ContaBancariaView();
        ContaBancariaService contaBancariaService = new ContaBancariaService(contaBancariaModel,contaBancariaView);

        contaBancariaView.contaBancariaDetails(contaBancariaModel.getTitular(),contaBancariaModel.getNumeroDaConta(),contaBancariaModel.getSaldoDaConta());

        contaBancariaService.sacarDinheiro(2000);

        contaBancariaView.contaBancariaDetails(contaBancariaModel.getTitular(),contaBancariaModel.getNumeroDaConta(),contaBancariaModel.getSaldoDaConta());

        contaBancariaService.depositarDinheiro(500);

        contaBancariaView.contaBancariaDetails(contaBancariaModel.getTitular(),contaBancariaModel.getNumeroDaConta(),contaBancariaModel.getSaldoDaConta());

        contaBancariaService.sacarDinheiro(2000);

        contaBancariaView.contaBancariaDetails(contaBancariaModel.getTitular(),contaBancariaModel.getNumeroDaConta(),contaBancariaModel.getSaldoDaConta());

    }
}
