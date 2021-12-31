package com.company.srpdemo;

import com.company.srpdemo.vehicles.Car;
import com.company.srpdemo.vehicles.Motorcycle;

public class Main {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {

        typeVehicle = TypeVehicle.CAR;

        if (typeVehicle == TypeVehicle.CAR) {
            Car car = new Car("Azul", "2201", 4.6, 4);

        }else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("Branca", "2021", 250);
        }

    }

}
