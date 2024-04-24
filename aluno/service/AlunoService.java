package br.com.aluno.service;

import br.com.aluno.model.AlunoModel;

import java.util.List;

public class AlunoService {

    public static double calcularMediaDasNotas(List<AlunoModel> alunos) {
        double somaDasNotas = 0.0;
        int totalDeAlunos = alunos.size();

        for (AlunoModel aluno : alunos) {
            somaDasNotas += aluno.getMedia();
        }

        double mediaDasNotas = somaDasNotas / totalDeAlunos;
        return mediaDasNotas;
    }
}
