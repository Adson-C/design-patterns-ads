package br.com.ads.designpattern.factory;

import br.com.ads.designpattern.factory.vehicles.Bike;
import br.com.ads.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
