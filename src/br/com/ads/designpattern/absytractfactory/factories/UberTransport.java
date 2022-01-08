package br.com.ads.designpattern.absytractfactory.factories;

import br.com.ads.designpattern.absytractfactory.aircrafs.Airplane;
import br.com.ads.designpattern.absytractfactory.aircrafs.IAircraft;
import br.com.ads.designpattern.absytractfactory.boats.IBoatsMaritimes;
import br.com.ads.designpattern.absytractfactory.boats.Ship;
import br.com.ads.designpattern.absytractfactory.boats.SpeedBoast;
import br.com.ads.designpattern.absytractfactory.landvehicles.Car;
import br.com.ads.designpattern.absytractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoatsMaritimes createTransportBoats() {
        return new SpeedBoast();
    }
}
