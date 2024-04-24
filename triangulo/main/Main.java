package br.com.triangulo.main;

import br.com.triangulo.model.TrianguloModel;
import br.com.triangulo.service.TrianguloService;
import br.com.triangulo.view.TrianguloView;

public class Main {
    public static void main(String[] args) {
        TrianguloModel trianguloModel01 = new TrianguloModel(3,4,5);
        TrianguloModel trianguloModel02 = new TrianguloModel(1,1,3);

        TrianguloService trianguloService = new TrianguloService();

        TrianguloView trianguloView = new TrianguloView();

        trianguloView.respostaTriangulo(trianguloService.verificarTriangulo(trianguloModel01.getLadoA(),trianguloModel01.getLadoB(),trianguloModel01.getLadoC()));
        trianguloView.respostaTriangulo(trianguloService.verificarTriangulo(trianguloModel02.getLadoA(),trianguloModel02.getLadoB(),trianguloModel02.getLadoC()));


    }
}
