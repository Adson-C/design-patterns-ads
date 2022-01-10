package br.com.ads.designpattern.builder.director;

import br.com.ads.designpattern.builder.builders.IBuilder;
import br.com.ads.designpattern.builder.componets.CarType;
import br.com.ads.designpattern.builder.componets.Engine;
import br.com.ads.designpattern.builder.componets.Transmition;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmition(Transmition.AUTOMATIC);
        builder.setEngine(new Engine(200));
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmition(Transmition.MANUAL);
        builder.setEngine(new Engine(3000));
    }
}
