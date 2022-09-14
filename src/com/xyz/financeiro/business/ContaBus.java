package com.xyz.financeiro.business;
import com.xyz.financeiro.model.Conta;

public class ContaBus {
    private Conta conta;

    public ContaBus(Conta conta){
        this.conta = conta;
    }
    public void sacar(double valor){
        conta.setSaldo(conta.getSaldo() - valor);
    }
    public void depositar(double valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }
}
