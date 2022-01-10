package br.com.ads.designpattern.adapter.payoneer;

import br.com.ads.designpattern.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
