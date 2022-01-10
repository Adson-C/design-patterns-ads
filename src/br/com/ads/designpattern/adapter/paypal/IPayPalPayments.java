package br.com.ads.designpattern.adapter.paypal;

import br.com.ads.designpattern.adapter.utils.Token;

public interface IPayPalPayments {

    Token autoToken();
    void paypalPayment();
    void PaypalReceive();
}
