package com.company.srpdemo;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
