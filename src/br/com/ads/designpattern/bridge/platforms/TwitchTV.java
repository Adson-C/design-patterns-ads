package br.com.ads.designpattern.bridge.platforms;

public class TwitchTV implements IPlatform {

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão Inciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: configurando RMTP");

    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando on Canal");

    }
}