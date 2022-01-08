package br.com.ads.designpattern.absytractfactory;


import br.com.ads.designpattern.absytractfactory.app.Application;
import br.com.ads.designpattern.absytractfactory.boats.IBoatsMaritimes;
import br.com.ads.designpattern.absytractfactory.factories.BoatsTransport;
import br.com.ads.designpattern.absytractfactory.factories.ITransportFactory;
import br.com.ads.designpattern.absytractfactory.factories.NineNineTransport;
import br.com.ads.designpattern.absytractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "99";

        if (company == "uber") {

            factory = new UberTransport();
        }
        else if (company == "99") {
            factory = new NineNineTransport();

        }

        else {
            factory = new BoatsTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();

    }
}
