package br.com.ads.designpattern.factory;

import br.com.ads.designpattern.factory.vehicles.IVehicle;
import br.com.ads.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
