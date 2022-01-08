package br.com.ads.designpattern.absytractfactory.app;

import br.com.ads.designpattern.absytractfactory.aircrafs.IAircraft;
import br.com.ads.designpattern.absytractfactory.boats.IBoatsMaritimes;
import br.com.ads.designpattern.absytractfactory.factories.ITransportFactory;
import br.com.ads.designpattern.absytractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoatsMaritimes maritimes;


    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        maritimes = factory.createTransportBoats();

    }
    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        maritimes.startRoute();
    }

}
