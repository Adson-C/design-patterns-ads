package com.company.srpdemo.vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        configMotorcycle();

    }

    public void configMotorcycle() {
        System.out.println("Criando uma moto:" + year + " " + engine + " cinlindradas");
        startVehicle();
    }
}
