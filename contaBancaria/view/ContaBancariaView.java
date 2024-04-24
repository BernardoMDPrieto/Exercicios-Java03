package br.com.contaBancaria.view;

public class ContaBancariaView {

    public void contaBancariaDetails(String titular, int numeroDaConta, float saldoDaConta){
        System.out.printf("Detalhes da conta: \nTitular da conta: %s \nNumeroDaConta: %d \nSaldo da conta: %f \n",titular,numeroDaConta,saldoDaConta);
    }
}
