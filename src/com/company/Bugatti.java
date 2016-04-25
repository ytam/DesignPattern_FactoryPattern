package com.company;

/**
 * Created by brusk on 26.04.2016.
 */
public class Bugatti extends ArabaFabrika {
    @Override
    public void createAuto() {
        getArabaListesi().add(new Veyron(1200));
        getArabaListesi().add(new Chiron(1100));
    }
}
