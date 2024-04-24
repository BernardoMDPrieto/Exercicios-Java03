package br.com.retangulo.service;

import br.com.retangulo.model.RetanguloModel;
import br.com.retangulo.view.RetanguloView;

public class RetanguloService {
    RetanguloModel retanguloModel;
    RetanguloView retanguloView;

    public RetanguloService(RetanguloModel retanguloModel,RetanguloView retanguloView){
        this.retanguloModel = retanguloModel;
        this.retanguloView = retanguloView;
    }

    double calcularArea(double comprimento,double largura) {
        double resultado = 0;
        resultado = comprimento * largura;

        return resultado;

    }

    public void updateRetanguloView(){
        retanguloView.retanguloDetails(retanguloModel.getComprimento(),retanguloModel.getLargura(),calcularArea(retanguloModel.getComprimento(),retanguloModel.getLargura()));
    }

}
