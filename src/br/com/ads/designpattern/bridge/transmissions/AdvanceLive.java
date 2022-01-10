package br.com.ads.designpattern.bridge.transmissions;

import br.com.ads.designpattern.bridge.platforms.IPlatform;

public class AdvanceLive extends Live {
    public AdvanceLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na Transmissão");
    }

    public void comments() {
        System.out.println("Cométarios liberados na Live");
    }

}
