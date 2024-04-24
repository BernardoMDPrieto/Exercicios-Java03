package br.com.retangulo.main;

import br.com.retangulo.model.RetanguloModel;
import br.com.retangulo.service.RetanguloService;
import br.com.retangulo.view.RetanguloView;

public class Main {
    public static void main(String[]args){
        RetanguloModel retanguloModel = dataBaseRetangulo();
        RetanguloView retanguloView = new RetanguloView();
        RetanguloService retanguloService = new RetanguloService(retanguloModel,retanguloView);

        retanguloService.updateRetanguloView();

    }

    private static RetanguloModel dataBaseRetangulo(){
        RetanguloModel retanguloModel = new RetanguloModel();


        retanguloModel.setComprimento(32.3);
        retanguloModel.setLargura(62.33);

        return retanguloModel;

    }

}
