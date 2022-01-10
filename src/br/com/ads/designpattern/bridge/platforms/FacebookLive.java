package br.com.ads.designpattern.bridge.platforms;

public class FacebookLive implements IPlatform {

    public FacebookLive() {
        configureRMTP();
        System.out.println("Facebook Live: Transmissão Inciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: conta autorizada");

    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");

    }
}
