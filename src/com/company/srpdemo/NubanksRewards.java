package com.company.srpdemo;

public class NubanksRewards implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {
        // validações
        System.out.println("Limite OK, Rewards OK!");

    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento Realizado com sucesso!");
        System.out.println("Pontuação creditada no Programa Rewards!");

    }
}
