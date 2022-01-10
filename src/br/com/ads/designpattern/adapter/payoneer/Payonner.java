package br.com.ads.designpattern.adapter.payoneer;

import br.com.ads.designpattern.adapter.utils.Token;

public class Payonner implements IPayonnerPayments {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payoneer");

    }
}
