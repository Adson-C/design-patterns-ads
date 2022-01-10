package br.com.ads.designpattern.builder.cars;

import br.com.ads.designpattern.builder.componets.CarType;
import br.com.ads.designpattern.builder.componets.Engine;
import br.com.ads.designpattern.builder.componets.Transmition;

public class Truck {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmition transmition;

    public Truck(CarType carType, int seats, Engine engine, Transmition transmition) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmition = transmition;
    }

    public String result() {
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += " Trasmition: " + transmition;

        return truck;
    }

}
