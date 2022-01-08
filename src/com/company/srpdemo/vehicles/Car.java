package com.company.srpdemo.vehicles;

public class Car implements IVehicle , IVehicleCar{ // implemanta mais de uma Interface

    private String color;
    private String year;
    private double engine;
    private int seats;



    public Car(String color, String year, double engine, int seats) {

        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {

        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro: "+ engine + " "+ color+ " "+year+ " "+seats+ " assentos");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("ligando os Mostores:");

    }
}
