package br.com.ads.designpattern.factory;

import br.com.ads.designpattern.factory.vehicles.Car;
import br.com.ads.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
