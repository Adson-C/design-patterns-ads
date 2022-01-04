package com.company.srpdemo;

public class MainPayment {

    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();

        NubanksRewards card = new NubanksRewards();

        card.validate();
        card.collectPayment();
    }
}
