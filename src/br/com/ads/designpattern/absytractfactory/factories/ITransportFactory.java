package br.com.ads.designpattern.absytractfactory.factories;

import br.com.ads.designpattern.absytractfactory.aircrafs.IAircraft;
import br.com.ads.designpattern.absytractfactory.boats.IBoatsMaritimes;
import br.com.ads.designpattern.absytractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoatsMaritimes createTransportBoats();
}
