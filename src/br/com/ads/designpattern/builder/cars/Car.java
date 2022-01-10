package br.com.ads.designpattern.builder.cars;

import br.com.ads.designpattern.builder.componets.CarType;
import br.com.ads.designpattern.builder.componets.Engine;
import br.com.ads.designpattern.builder.componets.Transmition;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmition transmition;

    public Car(CarType carType, int seats, Engine engine, Transmition transmition) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmition = transmition;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmition getTransmition() {
        return transmition;
    }
}