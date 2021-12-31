package com.company.srpdemo;

public class Vehicle {

        private String color;
        private String year;
        private double engine;
        private int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car() {
        System.out.println("");
    }

    void motorCycle() {
        System.out.println();
    }

}
