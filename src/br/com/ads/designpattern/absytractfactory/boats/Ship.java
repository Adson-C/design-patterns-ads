package br.com.ads.designpattern.absytractfactory.boats;

public class Ship implements IBoatsMaritimes {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Saindo do Porto!");
    }

    @Override
    public void getCargo() {
        System.out.println("Todos a bordo, ligando os motores");

    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, Sudeste, ventos ok!");
    }
}
