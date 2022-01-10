package br.com.ads.designpattern.adapter;


import br.com.ads.designpattern.adapter.adapters.PayonnerAdapter;
import br.com.ads.designpattern.adapter.payoneer.IPayonnerPayments;
import br.com.ads.designpattern.adapter.payoneer.Payonner;
import br.com.ads.designpattern.adapter.paypal.IPayPalPayments;
import br.com.ads.designpattern.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        /*IPayonnerPayments payment = new Payonner();
        payment.sendPayment();
        payment.receivePayment();*/


       IPayPalPayments payment = new PayonnerAdapter(new Payonner());
        payment.paypalPayment();
        payment.PaypalReceive();

    }
}
