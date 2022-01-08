package br.com.ads.designpattern.factory;

import br.com.ads.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {

    void  startTransport() {

        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
