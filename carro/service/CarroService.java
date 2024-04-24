package br.com.carro.service;

import br.com.carro.model.CarroModel;
import br.com.carro.view.CarroView;

import java.util.Scanner;

public class CarroService {


    private CarroModel carroModel;
    private CarroView carroView;

    public CarroService(CarroModel carroModel, CarroView carroView) {
        this.carroModel = carroModel;
        this.carroView = carroView;
    }

    void setModelo(String modelo){
        carroModel.setModelo(modelo);
    }

    String getModelo(String modelo){
        return modelo;
    }

    void setMarca(String marca){
        carroModel.setMarca(marca);
    }

    String getMarca(String marca) {
        return marca;
    }

    void setAno(int ano){
        carroModel.setAno(ano);
    }

    int getAno(int ano) {
        return ano;
    }

    public void updateView(){
        carroView.viewCarroDetails(carroModel.getModelo(),carroModel.getMarca(),carroModel.getAno());
    }
}