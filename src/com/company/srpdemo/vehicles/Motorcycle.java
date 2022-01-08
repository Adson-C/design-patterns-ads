package com.company.srpdemo.vehicles;

public class Motorcycle implements IVehicle, IVehicleMotorcycle{ // implemanta mais de uma Interface

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine) {

        configureMotorcycle(color, year, engine);

    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Criando uma Motos: "+ engine + " "+ color+ " "+year);
        startVehicle();

    }


    @Override
    public void startVehicle() {

    }
}
