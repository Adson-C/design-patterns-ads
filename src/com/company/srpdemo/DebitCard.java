package com.company.srpdemo;

public class DebitCard extends NubankCard {

    @Override
    public void validate() throws Exception {

        System.out.println("Verificando Saldo!");
        System.out.println("Saldo Disponivel!!");
    }
}
