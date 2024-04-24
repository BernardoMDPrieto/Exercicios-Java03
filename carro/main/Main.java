package br.com.carro.main;

import br.com.carro.model.CarroModel;
import br.com.carro.service.CarroService;
import br.com.carro.view.CarroView;

public class Main {
    public static void main(String[] args) {
        CarroModel carroModel = carrosDatabase();
        CarroView carroView = new CarroView();
        CarroService carroService = new CarroService(carroModel,carroView);

        carroService.updateView();

    }

    private static CarroModel carrosDatabase(){
        CarroModel carroModel = new CarroModel();
        carroModel.setModelo("Uno");
        carroModel.setMarca("Fiat");
        carroModel.setAno(2003);

        return carroModel;

    }


}
