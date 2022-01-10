package br.com.ads.designpattern.builder.builders;

import br.com.ads.designpattern.builder.componets.CarType;
import br.com.ads.designpattern.builder.componets.Engine;
import br.com.ads.designpattern.builder.componets.Transmition;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmition(Transmition transmition);
    void  setEngine(Engine engine);
}
