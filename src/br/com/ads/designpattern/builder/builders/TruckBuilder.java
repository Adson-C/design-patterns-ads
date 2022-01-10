package br.com.ads.designpattern.builder.builders;

import br.com.ads.designpattern.builder.cars.Car;
import br.com.ads.designpattern.builder.cars.Truck;
import br.com.ads.designpattern.builder.componets.CarType;
import br.com.ads.designpattern.builder.componets.Engine;
import br.com.ads.designpattern.builder.componets.Transmition;

public class TruckBuilder implements  IBuilder {
    private CarType carType;
    private  int seats;
    private Transmition transmition;
    private  Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmition(Transmition transmition) {
        this.transmition = transmition;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Truck getresult() {
        return new Truck(carType,seats,engine,transmition);
    }

}
