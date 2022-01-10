package br.com.ads.designpattern.builder;

import br.com.ads.designpattern.builder.builders.CarBuilder;
import br.com.ads.designpattern.builder.builders.TruckBuilder;
import br.com.ads.designpattern.builder.cars.Car;
import br.com.ads.designpattern.builder.cars.Truck;
import br.com.ads.designpattern.builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        // criando carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " + truck.result());

    }
}
