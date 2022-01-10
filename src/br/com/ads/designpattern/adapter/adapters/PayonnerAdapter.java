package br.com.ads.designpattern.adapter.adapters;

import br.com.ads.designpattern.adapter.payoneer.Payonner;
import br.com.ads.designpattern.adapter.paypal.IPayPalPayments;
import br.com.ads.designpattern.adapter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner) {
        this.payonner = payonner;
        System.out.println("Adaptando Payonner utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token autoToken() {

        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();

    }

    @Override
    public void PaypalReceive() {
        this.payonner.receivePayment();

    }
}
