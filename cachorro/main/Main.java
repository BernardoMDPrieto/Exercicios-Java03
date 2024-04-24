package br.com.cachorro.main;

import br.com.cachorro.model.CachorroModel;
import br.com.cachorro.service.CachorroService;
import br.com.cachorro.view.CachorroView;

public class Main {
    public static void main(String[] args) {
        CachorroModel cachorroModel = new CachorroModel("Peter", "Vira-lata", 12);
        CachorroService cachorroService = new CachorroService();
        CachorroView cachorroView = new CachorroView();

        cachorroView.mostraLatido(cachorroService.latir());
    }

}
