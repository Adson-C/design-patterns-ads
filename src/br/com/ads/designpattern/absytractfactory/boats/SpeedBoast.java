package br.com.ads.designpattern.absytractfactory.boats;

public class SpeedBoast implements IBoatsMaritimes {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("zarpanto do porto");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, Vamos zarpar");

    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, ventos ok!");
    }
}
