package br.com.calendario.service;

public class CalendarioService {
    public String verificaData(int dia, int mes, int ano) {

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;

        String mensagem;

        if (mes < 1 || mes > 12) {
            mensagem = "A data não está correta!";
        }

        if (mes == 2) { // Fevereiro
            if (bissexto) {

                if (dia > 0 && dia < 28) {
                    mensagem = "A data está correta!";
                } else {
                    mensagem = "A data não está correta!";
                }
            } else {
                if (dia > 0 && dia < 29) {
                    mensagem = "A data está correta!";
                } else {
                    mensagem = "A data não está correta!";
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 0 && dia < 31) {
                mensagem = "A data está correta!";
            } else {
                mensagem = "A data não está correta!";
            }
        } else {
            if (dia > 0 && dia < 32) {
                mensagem = "A data está correta!";
            } else {
                mensagem = "A data não está correta!";
            }
        }
        return mensagem;
    }

}
