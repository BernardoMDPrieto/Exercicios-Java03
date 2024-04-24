package br.com.calendario.main;

import br.com.calendario.model.CalendarioModel;
import br.com.calendario.service.CalendarioService;
import br.com.calendario.view.CalendarioView;

public class Main {
    public static void main(String[] args) {
        CalendarioModel calendarioModel = new CalendarioModel(29,02,2017);
        CalendarioService calendarioService = new CalendarioService();
        CalendarioView calendarioView = new CalendarioView();

        calendarioView.mostraResposta(calendarioService.verificaData(calendarioModel.getDia(),calendarioModel.getMes(),calendarioModel.getAno()));
    }
}
