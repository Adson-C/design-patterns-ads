package br.com.ads.designpattern.bridge;


import br.com.ads.designpattern.bridge.platforms.FacebookLive;
import br.com.ads.designpattern.bridge.platforms.IPlatform;
import br.com.ads.designpattern.bridge.platforms.TwitchTV;
import br.com.ads.designpattern.bridge.platforms.YouTube;
import br.com.ads.designpattern.bridge.transmissions.AdvanceLive;
import br.com.ads.designpattern.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new FacebookLive());
        startLive(new TwitchTV());

    }

    public static void startLive(IPlatform platform) {
       /* System.out.println(".... Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("Transmissão avançada... Aguarde!");
        AdvanceLive advanceLive = new AdvanceLive(platform);
        advanceLive.broadcasting();
        advanceLive.comments();
        advanceLive.subtitles();
        advanceLive.result();
    }
}
