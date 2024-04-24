package br.com.aluno.main;

import br.com.aluno.model.AlunoModel;
import br.com.aluno.service.AlunoService;
import br.com.aluno.view.AlunoView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<AlunoModel> listaDeAlunos = new ArrayList<>();

        AlunoView alunoView = new AlunoView();

        listaDeAlunos.add(new AlunoModel("Guilherme", 7.3f));
        listaDeAlunos.add(new AlunoModel("Matheus", 3.5f));
        listaDeAlunos.add(new AlunoModel("Vinicius", 9.9f));
        listaDeAlunos.add(new AlunoModel("Pedro", 6.5f));

        float mediaDasNotas = (float) AlunoService.calcularMediaDasNotas(listaDeAlunos);

        alunoView.showMedia(mediaDasNotas);

    }
}
