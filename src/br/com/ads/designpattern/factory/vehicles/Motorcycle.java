package br.com.ads.designpattern.factory.vehicles;

public class Motorcycle implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciamos a entrega!");

    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda!");

    }
}
