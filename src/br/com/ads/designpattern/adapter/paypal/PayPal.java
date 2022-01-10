package br.com.ads.designpattern.adapter.paypal;

import br.com.ads.designpattern.adapter.utils.Token;

public class PayPal implements IPayPalPayments {
    private Token token;

    @Override
    public Token autoToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = autoToken();
        System.out.println("Enviando pagamentos via  PayPal");

    }

    @Override
    public void PaypalReceive() {
        System.out.println("Recebendo pagamentos via PayPal");

    }
}
