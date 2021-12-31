package com.company.srpdemo.vehicles;

public class Car implements IvehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {

        configVehicle(color,year, engine, seats);
    }

    @Override
    public void configVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro com Interface: " + color + " " + engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligandos os Motores com Interface");
    }

//    private int seats;
//
//    public Car(String color, String year, double engine, int seats) {
//        this.color = color;
//        this.year = year;
//        this.engine = engine;
//        this.seats = seats;
//
//        configureCar();
//    }
//
//    public void configureCar() {
//        System.out.println("Criando um Carro:" + color + " " + year + " " + engine + " com " + seats + " assentos");
//        startVehicle();
//    }
}
