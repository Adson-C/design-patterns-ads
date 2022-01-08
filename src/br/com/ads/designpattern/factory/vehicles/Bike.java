package br.com.ads.designpattern.factory.vehicles;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Já pegamos a comida!");
    }

    @Override
    public void getCargo() {
        System.out.println("Iniciando o delivery!");

    }
}
